package com.rpym.univweb.service.system.file;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.business.attachment.AttachmentAddAndUpdateDto;
import com.rpym.univweb.dto.business.attachment.AttachmentQryInDto;
import com.rpym.univweb.dto.business.attachment.BiAttachmentQryOutDto;
import com.rpym.univweb.entity.BiAttachment;

public interface IBiAttachmentService {

	//新增附件
    boolean saveAttachment(AttachmentAddAndUpdateDto dto);
    //删除附件
    public boolean deleteAttachment(Long id);
    //附件列表
    public PageInfo<BiAttachmentQryOutDto> queryAttachments(AttachmentQryInDto attachmentQryDto);
    //单个详情
    public BiAttachment queryAttachmentsById(Long id);
    //更新附件
    public boolean updateAttachmentInfo(AttachmentAddAndUpdateDto dto);
    
    // ------------------------- 业务操作   ------------------------------------
    //根据用户查询文件
    public PageInfo<BiAttachmentQryOutDto> queryAttachmentsByUser(AttachmentQryInDto attachmentQryDto);

    //文件上传
    public String uploadFile(MultipartFile file,Model model, HttpServletRequest request);
    
    //文件下载
    public boolean downloadFile(String bussinessIds, HttpServletRequest req, HttpServletResponse response);
    
    //打包下载
    public boolean pressAndDowLoad(String bussinessIds, String pressType, HttpServletRequest req, HttpServletResponse response);
    
    //根据关联业务id查询文件
    public List<BiAttachment> getAttachmentByBussinessId(String bussinessIds, HttpServletRequest req);
}
