package com.rpym.univweb.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.permission.PermissionAddDto;
import com.rpym.univweb.dto.permission.PermissionQueryDto;
import com.rpym.univweb.dto.permission.PermissionUpdateDto;
import com.rpym.univweb.entity.SysPermissions;
import com.rpym.univweb.service.system.permission.IPermissionService;

@Controller
@RequestMapping("/permissions/*")
public class PermissionController {

	@Autowired
	IPermissionService permissionService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddPermission() {
		return "system/permission/addPermission";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditPermission() {
		return "system/permission/editPermission";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListPermission() {
		return "system/permission/permissionList";
	}
	
	//------------------------------- 权限管理 -------------------------------------
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	@ResponseBody
	public PageInfo<SysPermissions> listPermission(PermissionQueryDto permissionQueryDto) {
		return permissionService.pageListPermission(permissionQueryDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public String addPermission(PermissionAddDto permissionAddDto) {
		return permissionService.addPermission(permissionAddDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit")
	@ResponseBody
	public boolean editPermission(PermissionUpdateDto permissinUpdateDto) {
		return permissionService.updatePermission(permissinUpdateDto);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public String deletePermission(@RequestParam("id") Long id) {
		return permissionService.deletePermission(id);
	}
}
