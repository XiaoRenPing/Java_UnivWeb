package com.rpym.univweb.service.system.role.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysRolesMapper;
import com.rpym.univweb.dto.role.QuerySysRoleDto;
import com.rpym.univweb.dto.role.SysRolesDto;
import com.rpym.univweb.entity.SysRoles;
import com.rpym.univweb.entity.SysRolesExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.role.ISysRoleService;
@Service("roleService")
public class SysRoleServiceImpl extends BaseService implements ISysRoleService{

	@Autowired
	private SysRolesMapper sysRolesDao;
	
	/**
	 * 保存角色
	 */
	public boolean saveRole(SysRolesDto dto) {
		SysRoles roles = new SysRoles();
		roles.setCreationtime(new Date());
		//roles.setCreatoruserid(this.getSessionUserid());
		roles.setDisplayname(dto.getDisplayname());
		roles.setName(dto.getName());
		roles.setIsdefault(true);
		roles.setIsstatic(true);
		roles.setIsdeleted(false);
		return sysRolesDao.insert(roles)==CommonConst.NUM_1;
	}
	
	/**
	 * 删除一个角色,软删除，其实更新操作
	 */
	public boolean deleteRole(int id) {
		SysRoles s = new SysRoles();
		s.setId(id);
		s.setIsdeleted(false);
		return sysRolesDao.updateByPrimaryKeySelective(s)==CommonConst.NUM_1;
	}
	
	/**
	 * 全表查询
	 */
	public PageInfo<SysRoles> queryRoles(QuerySysRoleDto qdto) {
		SysRolesExample roleExample = new SysRolesExample();
		SysRolesExample.Criteria criteria = roleExample.createCriteria();
		if(qdto.getName() != null) {
			criteria.andNameEqualTo(qdto.getName());
		}
		if(qdto.getDisplayname() != null) {
			criteria.andDisplaynameEqualTo(qdto.getDisplayname());
		}
		//initPage(qdto);
		List<SysRoles> list = sysRolesDao.selectByExample(roleExample);
		return new PageInfo<SysRoles>(list);
	}
	
	/**
	 * 查看某个角色
	 */
	public SysRoles queryRolesById(int id) {
		return sysRolesDao.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据id更新角色信息
	 * @param userDto
	 * @return   
	 */
	public boolean updateRolesInfo(SysRolesDto dto) {
		SysRoles role = new SysRoles();
		BeanUtils.copyProperties(dto, role);
		role.setLastmodificationtime(new Date());
		return sysRolesDao.updateByPrimaryKeySelective(role)==CommonConst.NUM_1;
	}
}
