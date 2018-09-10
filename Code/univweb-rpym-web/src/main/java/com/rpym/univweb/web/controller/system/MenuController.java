package com.rpym.univweb.web.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.menu.SysMenuQueryDto;
import com.rpym.univweb.dto.menu.SysMenusExt;
import com.rpym.univweb.entity.SysMenu;
import com.rpym.univweb.service.system.menu.ISysMenuService;

@Controller
@RequestMapping("/menus/*")
public class MenuController {

	@Autowired
	ISysMenuService menuService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddMenu() {
		return "system/menu/addMenu";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public ModelAndView toEditMenu(Long id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("menu", menuService.findSysMenuById(id));
		mv.setViewName("system/menu/editMenu");
		return mv;
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/toview")
	public ModelAndView toView(Long id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("menu", menuService.findSysMenuById(id));
		mv.setViewName("system/menu/editMenu");
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListMenu() {
		return "system/menu/menuList";
	}
	
// ------------------------------------------------------业务方法 -------------------------------------------------------------
	/**
	 * 根据用户查询菜单
	 * @param request
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/usermenu")
	@ResponseBody
	public List<SysMenusExt> findMenuByUser(HttpServletRequest request) {
		return menuService.findMenuByUser(request);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	@ResponseBody
	public PageInfo<SysMenu> listMenu(SysMenuQueryDto menuQueryDto) {
		return menuService.pageListSysMenu(menuQueryDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public String addMenu(SysMenu sysMenu) {
		return menuService.addSysMenu(sysMenu);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit")
	@ResponseBody
	public boolean editMenu(SysMenu sysMenu) {
		return menuService.updateSysMenu(sysMenu);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public String deleteMenu(@RequestParam("id") Long id) {
		return menuService.deleteSysMenu(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/parentmenus")
	@ResponseBody
	public SysMenusExt findParentMenuByCurrent(Long id) {
		return menuService.findParentMenuByCurrent(id);
	}
	
}
