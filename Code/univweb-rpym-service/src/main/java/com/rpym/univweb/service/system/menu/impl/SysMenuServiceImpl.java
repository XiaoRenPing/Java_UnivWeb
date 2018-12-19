package com.rpym.univweb.service.system.menu.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dao.SysMenuMapper;
import com.rpym.univweb.dao.SysUserRolesMapper;
import com.rpym.univweb.dto.menu.SysMenuQueryDto;
import com.rpym.univweb.dto.menu.SysMenusExt;
import com.rpym.univweb.entity.SysMenu;
import com.rpym.univweb.entity.SysMenuExample;
import com.rpym.univweb.entity.SysUserRoles;
import com.rpym.univweb.entity.SysUserRolesExample;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.system.menu.ISysMenuService;

@Service("sysMenuService")
public class SysMenuServiceImpl implements ISysMenuService {

	@Autowired
	SysMenuMapper sysMenuDao;

	@Autowired
	SysUserRolesMapper userRolesDao;

	public String addSysMenu(SysMenu sysMenu) {
		sysMenuDao.updateByPrimaryKeySelective(sysMenu);
		return sysMenu.getDisplayname();
	}

	public SysMenu findSysMenuById(Long id) {
		SysMenu sysMenu = sysMenuDao.selectByPrimaryKey(id);
		return sysMenu;
	}

	public String deleteSysMenu(Long id) {
		SysMenu sysMenu = sysMenuDao.selectByPrimaryKey(id);
		sysMenuDao.deleteByPrimaryKey(sysMenu.getId());
		return sysMenu.getDisplayname();
	}

	/**
	 * 查询所有菜单
	 * <p>
	 * Title: pageListSysMenu
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param menuQueryDto
	 * @return
	 * @see com.rpym.univweb.service.basic.menu.impl.ISysMenuService#pageListSysMenu(com.rpym.univweb.dto.SysMenuQueryDto)
	 */
	public PageInfo<SysMenu> pageListSysMenu(SysMenuQueryDto menuQueryDto) {
		SysMenuExample menuExample = new SysMenuExample();
		SysMenuExample.Criteria menuCriteria = menuExample.createCriteria();
		if (menuQueryDto.getMenuname() != null) {
			menuCriteria.andDisplaynameLike(menuQueryDto.getMenuname());
		}
		List<SysMenu> sysMenuList = sysMenuDao.selectByExample(menuExample);
		return new PageInfo<SysMenu>(sysMenuList);
	}

	public boolean updateSysMenu(SysMenu sysMenu) {
		sysMenuDao.updateByPrimaryKeySelective(sysMenu);
		return true;
	}

	// ---------------- 根据 -------------------------
	/**
	 * 根据父类id获取子菜单 @Title: getSubMenuList @Description: @param @param
	 * parenId @param @return 参数 @return List<SysMenu> 返回类型 @throws
	 */
	public List<SysMenu> getSubMenuList(Long parenId) {
		SysMenuExample menuExample = new SysMenuExample();
		menuExample.createCriteria().andParentidEqualTo(parenId);
		List<SysMenu> sysMenuList = sysMenuDao.selectByExample(menuExample);
		return sysMenuList;
	}

	/**
	 * 根据当前用户的角色，用户id查询菜单
	 */
	//@Cacheable(value="menu_cache", key="menus")
	public List<SysMenusExt> findMenuByUser(HttpServletRequest request) {
		SysUsers user = (SysUsers) request.getSession().getAttribute("sessionUser");
		List<SysMenusExt> fatherList = new ArrayList<SysMenusExt>();

		// 根据当前用户查询角色类型
		SysUserRolesExample userRolesExample = new SysUserRolesExample();
		userRolesExample.createCriteria().andUseridEqualTo(user.getId());  //
		List<SysUserRoles> userRoles = userRolesDao.selectByExample(userRolesExample);
		List<Long> roleIdList = getIdListFromRoleList(userRoles);
		List<SysMenu> allMenuList = sysMenuDao.selectMenusByUserAndRole(user.getId(), roleIdList);
		if (!CollectionUtils.isEmpty(allMenuList)) {
			for (SysMenu menu : allMenuList) {
				if (menu.getParentid() == null || menu.getParentid() == 0) { // 主菜单
					SysMenusExt menus = new SysMenusExt();
					menus.setMenuicon(menu.getMenuicon());
					menus.setDisplayname(menu.getDisplayname());
					List<SysMenusExt> list = getChild(allMenuList, menu.getId());
					List<SysMenusExt> childList = new ArrayList<SysMenusExt>();
					//主要跳转的功能在于子菜单的url
					if (!CollectionUtils.isEmpty(list)) { // 非空判断
						for (SysMenusExt sysMenusExt : list) {
							SysMenusExt childMenus = new SysMenusExt();
							childMenus.setDisplayname(sysMenusExt.getDisplayname());
							childMenus.setParentid(sysMenusExt.getParentid());
							childMenus.setMenuurl(sysMenusExt.getMenuurl());
							childList.add(childMenus);
						}
					}
					menus.setItems(childList);
					fatherList.add(menus);
				}else {
					continue;
					/*SysMenusExt menus = new SysMenusExt();
					menus.setMenuicon(menu.getMenuicon());
					menus.setDisplayname(menu.getDisplayname());
					fatherList.add(menus);*/
				}
			}
		}
		return fatherList;
	}
	
	/**
	 * 在List集合中根据上级菜单Id获取子菜单
	* @Description: 【工具方法】
	* @param list
	* @param fatherId
	* @return List<SysMenusExt> 
	* @throws 
	* @author 肖仁枰
	* @date 2018年8月14日
	 */
	private List<SysMenusExt> getChild(List<SysMenu> list, Long fatherId) {
		// 子菜单
		List<SysMenusExt> childList = new ArrayList<SysMenusExt>();
		for (SysMenu menu : list) {
			// 遍历所有节点，将父菜单id与传过来的id比较
			if (menu != null && menu.getParentid() == fatherId) {
				SysMenusExt child = new SysMenusExt();
				BeanUtils.copyProperties(menu, child);
				childList.add(child);
			}
		}
		
		return childList;
	}
	
	public List<Long> getIdListFromRoleList(List<SysUserRoles> roleList){
		List<Long> returnList = new ArrayList<Long>();
		if(!CollectionUtils.isEmpty(roleList)) {
			for(SysUserRoles role : roleList) {
				returnList.add(role.getRoleid().longValue());
			}
		}
		return returnList;
	}
	
	public List<Object> getIdListFromObjectList(List<?> objectList) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		List<Object> returnList = new ArrayList<Object>();
		if(!CollectionUtils.isEmpty(objectList)) {
			/*Object entity = objectList.get(0);
			String clazz = entity.getClass().getName();*/
			for(Object obj : objectList) {
				String clazz = obj.getClass().getName();
				Field id = Class.forName(clazz).getField("id");
				returnList.add(id.getLong(id));
			}
		}
		return returnList;
	}

	/**
	 * 根据当前菜单查找上级菜单，下拉列表回显菜单接口
	 * 
	 */
	public SysMenusExt findParentMenuByCurrent(Long id) {
		Map<String, Map<String, Map<String, Object>>> menuMap = new HashMap<String, Map<String, Map<String, Object>>>();
		SysMenu currentMenu = sysMenuDao.selectByPrimaryKey(id);
		Map<String, Object> currentMap = new HashMap<String, Object>();
		currentMap.put("current", currentMenu);
		//menuMap.put("current", new HashMap<String, Object>(currentMap));
		//获取上级菜单
		SysMenuExample menuExample = new SysMenuExample();
		SysMenuExample.Criteria menuCriteria = menuExample.createCriteria();
		if(currentMenu.getParentid() != null && currentMenu.getParentid() != 0) {//如果有上级菜单
			menuCriteria.andParentidEqualTo(currentMenu.getParentid());
			List<SysMenu> parentList = sysMenuDao.selectByExample(menuExample);
			if(!CollectionUtils.isEmpty(parentList)) {
				SysMenu parent = parentList.get(0);
				
				if(parent.getParentid() != null && parent.getParentid() != 0) {
					SysMenuExample thirdExample = new SysMenuExample();
					SysMenuExample.Criteria thirdCriteria = menuExample.createCriteria();
					thirdCriteria.andParentidEqualTo(parent.getParentid());
					List<SysMenu> thirdList = sysMenuDao.selectByExample(menuExample);
					if(!CollectionUtils.isEmpty(thirdList)) {
						Map<String, Object> thirdParentMap = new HashMap<String, Object>();
						thirdParentMap.put("parent", thirdList.get(0));
					}
					
				}
			}
		}
		return null;
	}
}