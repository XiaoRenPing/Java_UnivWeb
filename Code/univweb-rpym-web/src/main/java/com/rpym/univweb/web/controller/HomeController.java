package com.rpym.univweb.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rpym.univweb.dto.menu.SysMenusExt;
import com.rpym.univweb.entity.SysConfig;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.system.menu.impl.ISysMenuService;
import com.rpym.univweb.service.system.sysconfig.ISysConfigService;

@Controller
@RequestMapping("/home/*")
public class HomeController {

	@Autowired
	ISysMenuService menuService;
	
	@Autowired
	ISysConfigService sysConfigService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) {
		SysUsers user = (SysUsers) request.getSession().getAttribute("sessionUser");
		ModelAndView mv = new ModelAndView();
		//校验用户是否登录
		if(user == null) {
			mv.setViewName("view/user/login");
			return mv;
		}
		//加载菜单
		List<SysMenusExt> menus = menuService.findMenuByUser(request);
		mv.setViewName("system/main");
		mv.addObject("menu", menus);
		//加载网站全局：头部和页面底部
		SysConfig websiteConfig = sysConfigService.getWebSiteConfig(request);
		mv.addObject("site", websiteConfig);
		return mv;
	}
	
	
	
	

	
	@RequestMapping(method=RequestMethod.GET, value="/newindex")
	public ModelAndView mainIndex() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("system/lui/index");
		return mv;
	}
}
