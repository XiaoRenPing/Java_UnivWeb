package com.rpym.univweb.web.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rpym.univweb.dto.menu.SysMenusExt;
import com.rpym.univweb.service.system.menu.impl.ISysMenuService;

@Controller
@RequestMapping("/menus/*")
public class MemuController {

	@Autowired
	ISysMenuService menuService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddMenu() {
		return "system/menu/addMenu";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditMenu() {
		return "system/menu/editMenu";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	public String pageListMenu() {
		return "system/menu/menuList";
	}
	
// ------------------------------------------------------业务方法 -------------------------------------------------------------
	@RequestMapping(method=RequestMethod.GET, value="/usermenu")
	@ResponseBody
	public List<SysMenusExt> findMenuByUser(HttpServletRequest request) {
		return menuService.findMenuByUser(request);
	}
}
