package com.rpym.univweb.service.system.file.impl;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dao.BiAttachmentMapper;
import com.rpym.univweb.dto.business.attachment.AttachmentAddAndUpdateDto;
import com.rpym.univweb.dto.business.attachment.AttachmentQryInDto;
import com.rpym.univweb.dto.business.attachment.BiAttachmentQryOutDto;
import com.rpym.univweb.entity.BiAttachment;
import com.rpym.univweb.entity.BiAttachmentExample;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.file.IBiAttachmentService;
import com.rpym.univweb.utils.UWException;

@Service("attachementService")
public class BiAttachmentServiceImpl extends BaseService implements IBiAttachmentService {

	
	@Autowired
	BiAttachmentMapper attachmentDao;
	
	public boolean saveAttachment(AttachmentAddAndUpdateDto dto) {
		BiAttachment attachment = new BiAttachment();
		BeanUtils.copyProperties(dto, attachment);
		attachmentDao.insertSelective(attachment);
		return true;
	}

	public boolean deleteAttachment(Long id) {
		BiAttachment attachment = new BiAttachment();
		attachment.setIsdeleted(true);
		attachmentDao.updateByPrimaryKeySelective(attachment);
		return true;
	}

	public PageInfo<BiAttachmentQryOutDto> queryAttachments(AttachmentQryInDto attachmentQryDto) {
		BiAttachmentExample attachmentExample = new BiAttachmentExample();
		BiAttachmentExample.Criteria attachmentCriteria = attachmentExample.createCriteria();
		if(attachmentQryDto.getName() != null) {
			attachmentCriteria.andFilenameLike(this.fullLike(attachmentQryDto.getName()));
		}
		//this.initPage(attachmentQryDto);
		List<BiAttachment> attachmentList = attachmentDao.selectByExample(attachmentExample);
		List<BiAttachmentQryOutDto> resultAttachmentList = this.convert(attachmentList, BiAttachmentQryOutDto.class);
		return new PageInfo<BiAttachmentQryOutDto>(resultAttachmentList);
	}

	public BiAttachment queryAttachmentsById(Long id) {
		return attachmentDao.selectByPrimaryKey(id);
	}

	public boolean updateAttachmentInfo(AttachmentAddAndUpdateDto dto) {
		BiAttachment attachment = new BiAttachment();
		BeanUtils.copyProperties(dto, attachment);
		attachmentDao.updateByPrimaryKeySelective(attachment);
		return true;
	}

	
	/**
	 * 根据用户查询文件
	 */
	public PageInfo<BiAttachmentQryOutDto> queryAttachmentsByUser(AttachmentQryInDto attachmentQryDto) {
		//获取用户id
		BiAttachmentExample attachmentExample = new BiAttachmentExample();
		BiAttachmentExample.Criteria attachmentCriteria = attachmentExample.createCriteria();
		//attachmentCriteria.andCreatoruseridEqualTo(value);
		if(attachmentQryDto.getName() != null) {
			attachmentCriteria.andFilenameLike(this.fullLike(attachmentQryDto.getName()));
		}
		//this.initPage(attachmentQryDto);
		List<BiAttachment> attachmentList = attachmentDao.selectByExample(attachmentExample);
		List<BiAttachmentQryOutDto> resultAttachmentList = this.convert(attachmentList, BiAttachmentQryOutDto.class);
		return new PageInfo<BiAttachmentQryOutDto>(resultAttachmentList);
	}

	public String uploadFile(MultipartFile file, Model model, HttpServletRequest request) {
		SysUsers sessionUser = (SysUsers) request.getSession().getAttribute("loginUser");
		String fileName = file.getOriginalFilename();
		String description = request.getParameter("description");
		BiAttachment attachment = new BiAttachment();
		String path = request.getServletContext().getRealPath("upload/user/file");
		File saveFile = new File(path, fileName);
		if(!saveFile.exists()){
			saveFile.mkdirs();
		}
		try {
			file.transferTo(saveFile); //已经保存文件
			attachment.setCreationtime(new Date());
			attachment.setPath(path + fileName);
			attachment.setCreatoruserid(sessionUser.getId());
			attachment.setFilename(fileName);
			attachmentDao.insertSelective(attachment);
		} catch (IOException e) {
			throw new UWException("文件保存失败！");
		}
		return attachment.getBussinessid();
	}

	public boolean downloadFile(String bussinessIds, HttpServletRequest request, HttpServletResponse response) {
		List<BiAttachment> attachmentList = this.getAttachmentByBussinessId(bussinessIds, request);
		if(attachmentList != null) {
			for(BiAttachment attachment : attachmentList) {
				String fileName = attachment.getFilename();
				try {
					response.setCharacterEncoding("utf-8");
					response.setContentType("multipart/form-data");
					response.setHeader("Content-Disposition", "attachment;fileName=" + new String(fileName.getBytes("gbk"), "iso-8859-1"));
					String path = request.getServletContext().getRealPath("upload/user/file");//这个download目录为啥建立在classes下的
					InputStream inputStream = new FileInputStream(new File(path + File.separator + fileName));
					OutputStream os = response.getOutputStream();
					byte[] b = new byte[2048];
					int length;
					while ((length = inputStream.read(b)) > 0) {
						os.write(b, 0, length);
					}
					os.close();
					inputStream.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	public boolean pressAndDowLoad(String bussinessIds, String pressType, HttpServletRequest request, HttpServletResponse response) {
		List<BiAttachment> attachmentList = this.getAttachmentByBussinessId(bussinessIds, request);
		String commonPath = request.getServletContext().getRealPath("upload/user/file");//这个download目录为啥建立在classes下的
		ZipOutputStream zipos = null;
		DataOutputStream os=null;
		try {
			zipos = new ZipOutputStream(new BufferedOutputStream(response.getOutputStream()));
			zipos.setMethod(ZipOutputStream.DEFLATED);//设置压缩方法
		} catch (IOException e1) {
			e1.printStackTrace();
		} 

		
		if(attachmentList != null) {
			for(int i=0; i<attachmentList.size(); ++i) {
				String fileName = attachmentList.get(i).getFilename();
				String path = attachmentList.get(i).getPath();
				
				try {
					response.setCharacterEncoding("utf-8");
					response.setContentType("APPLICATION/OCTET-STREAM");
					response.setHeader("Content-Disposition", "attachment; fileName=" + new String(fileName.getBytes("gbk"), "iso-8859-1"));
					InputStream inputStream = new FileInputStream(new File(path + File.separator + fileName));
					zipos.putNextEntry(new ZipEntry(i + fileName));
					os = new DataOutputStream(zipos);
					byte[] b = new byte[2048];
					int length;
					while ((length = inputStream.read(b)) > 0) {
						os.write(b, 0, length);
					}
					os.close();
					inputStream.close();
					zipos.closeEntry();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return true;
	}

	public List<BiAttachment> getAttachmentByBussinessId(String bussinessIds, HttpServletRequest req) {
		//业务id转为集合
		List<String> bussinessIdList = Arrays.asList(bussinessIds.split(","));
		BiAttachmentExample attachmentExample = new BiAttachmentExample();
		BiAttachmentExample.Criteria attachmentCriteria = attachmentExample.createCriteria();
		attachmentCriteria.andBussinessidIn(bussinessIdList);
		List<BiAttachment> attachmentList = attachmentDao.selectByExample(attachmentExample);
		if(!CollectionUtils.isEmpty(attachmentList)) {
			return attachmentList;
		}
		return null;
	}


	
    
}
