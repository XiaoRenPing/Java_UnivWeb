package com.rpym.univweb.web.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.business.attachment.AttachmentAddAndUpdateDto;
import com.rpym.univweb.dto.business.attachment.AttachmentQryInDto;
import com.rpym.univweb.dto.business.attachment.BiAttachmentQryOutDto;
import com.rpym.univweb.entity.BiAttachment;
import com.rpym.univweb.service.system.file.IBiAttachmentService;

@Controller
@RequestMapping("/files/*")
public class FileController {

	@Autowired
	IBiAttachmentService attachmentService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddAttachment() {
		return "system/file/addFile";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditAttachment() {
		return "system/file/editFile";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListAttachment() {
		return "system/file/fileList";
	}
	
	//------------------------------- 文件管理 -------------------------------------
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	@ResponseBody
	public PageInfo<BiAttachmentQryOutDto> listAttachment(@ModelAttribute AttachmentQryInDto attachmentQueryDto) {
		return attachmentService.queryAttachments(attachmentQueryDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public boolean addAttachment(@ModelAttribute AttachmentAddAndUpdateDto attachmentAddDto) {
		return attachmentService.saveAttachment(attachmentAddDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit")
	@ResponseBody
	public boolean editAttachment(@ModelAttribute AttachmentAddAndUpdateDto permissinUpdateDto) {
		return attachmentService.updateAttachmentInfo(permissinUpdateDto);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public boolean deleteAttachment(@RequestParam("id") Long id) {
		return attachmentService.deleteAttachment(id);
	}
	
	// -------------------------------------   业务操作       ---------------------------------------------
	//文件上传
	@RequestMapping(method=RequestMethod.POST, value="/upload")
	public String fileUpload(MultipartFile file, Model model, HttpServletRequest request) {
		return attachmentService.uploadFile(file, model, request);
	}
	
	//下载
	@RequestMapping(method=RequestMethod.GET, value="/download")
	public boolean downloadFile(String bussinessIds, HttpServletRequest req, HttpServletResponse response) {
		return attachmentService.downloadFile(bussinessIds, req, response);
	}
	
	//压缩下载
	@RequestMapping(method=RequestMethod.GET, value="/download/press")
	public boolean pressAndDowLoad(String bussinessIds, String pressType, HttpServletRequest req, HttpServletResponse response) {
		return attachmentService.pressAndDowLoad(bussinessIds, pressType, req, response);
	}
	
	//查找用户文件
	@RequestMapping(method=RequestMethod.GET, value="/listbyuser")
	@ResponseBody
	public PageInfo<BiAttachmentQryOutDto> queryAttachmentsByUser(@ModelAttribute AttachmentQryInDto attachmentQryDto){
		return attachmentService.queryAttachmentsByUser(attachmentQryDto);
	}
	
	
	//根据业务查询附件
	@RequestMapping(method=RequestMethod.GET, value="/getbybussIds")
	@ResponseBody
	public List<BiAttachment> getAttachmentByBussinessId(String bussinessIds, HttpServletRequest req){
		return attachmentService.getAttachmentByBussinessId(bussinessIds, req);
	}
}
