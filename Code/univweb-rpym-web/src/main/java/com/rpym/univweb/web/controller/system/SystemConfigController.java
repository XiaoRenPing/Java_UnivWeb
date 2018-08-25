package com.rpym.univweb.web.controller.system;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rpym.univweb.service.system.sysconfig.ISysConfigService;

@Controller
@RequestMapping("/sysconf/*")
public class SystemConfigController {
	
	@Autowired
	ISysConfigService sysConfigService;
	
	/**
	 * 跳转网站头部
	* @author 肖仁枰
	* @date 2018年8月15日
	 */
	@RequestMapping(method=RequestMethod.GET, value="/siteheader")
	public String settingWebSiteHeader() {
		return null;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/sitefooter")
	public String settingWebSiteFooter() {
		return null;
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET, value="/int")
	public ModelAndView saveWebSiteConfig(Model model, HttpServletRequest request) {
		return null;
	}
	
	
	
}
