package com.rpym.univweb.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.role.QuerySysRoleDto;
import com.rpym.univweb.dto.role.SysRolesDto;
import com.rpym.univweb.dto.role.SysRolesQryOutDto;
import com.rpym.univweb.entity.SysRoles;
import com.rpym.univweb.entity.SysUserRoles;
import com.rpym.univweb.service.system.role.ISysRoleService;

@Controller
@RequestMapping("/roles/*")
public class SysRolesController {

	@Autowired
	ISysRoleService sysRoleService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddRole() {
		return "system/role/addRole";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditRole() {
		return "system/role/editRole";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListRole() {
		return "system/role/roleList";
	}
	
	//------------------------------- 角色管理 -------------------------------------
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	@ResponseBody
	public PageInfo<SysRolesQryOutDto> listRole(@ModelAttribute QuerySysRoleDto roleQueryDto) {
		return sysRoleService.queryRoles(roleQueryDto);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public boolean addRole(@ModelAttribute SysRolesDto sysRoleDto) {
		return sysRoleService.saveRole(sysRoleDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit")
	@ResponseBody
	public boolean editRole(@ModelAttribute SysRolesDto sysRoleDto) {
		return sysRoleService.updateRolesInfo(sysRoleDto);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public boolean deleteRole(@RequestParam("id") Integer id) {
		return sysRoleService.deleteRole(id);
	}
	
	// ----------------------------- 业务操作    ----------------------------
	//1.角色分配权限
	
	//2.用户分配角色
}
