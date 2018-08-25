package com.rpym.univweb.service.system.permission.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dao.SysPermissionsMapper;
import com.rpym.univweb.dto.permission.PermissionAddDto;
import com.rpym.univweb.dto.permission.PermissionQueryDto;
import com.rpym.univweb.dto.permission.PermissionUpdateDto;
import com.rpym.univweb.entity.SysPermissions;
import com.rpym.univweb.entity.SysPermissionsExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.permission.IPermissionService;

@Service("permissionService")
public class PermissionServiceImpl extends BaseService implements IPermissionService{

	@Autowired
	private SysPermissionsMapper permissionDao;
	
	public String addPermission(PermissionAddDto permissionDto) {
		SysPermissions permission = new SysPermissions();
		BeanUtils.copyProperties(permissionDto, permission);
		Integer result = permissionDao.insertSelective(permission);
		return result.toString();
	}

	public SysPermissions findPermissionById(Long id) {
		return permissionDao.selectByPrimaryKey(id);
	}

	public String deletePermission(Long id) {
		Integer result = permissionDao.deleteByPrimaryKey(id);
		return result.toString();
	}

	public PageInfo<SysPermissions> pageListPermission(PermissionQueryDto permissionQueryDto) {
		SysPermissionsExample permissionExample = new SysPermissionsExample();
		SysPermissionsExample.Criteria criteria = permissionExample.createCriteria();
		if(permissionQueryDto.getName() != null) {
			criteria.andNameLike("%" + permissionQueryDto.getName() + "%");
		}
		//this.startPage(permissionQueryDto);
		List<SysPermissions> permissionList = permissionDao.selectByExample(permissionExample);
		return new PageInfo<SysPermissions>(permissionList);
	}

	public boolean updatePermission(PermissionUpdateDto permissionDto) {
		SysPermissions permission = new SysPermissions();
		BeanUtils.copyProperties(permissionDto, permission);
		Integer result = permissionDao.updateByPrimaryKeySelective(permission);
		if(result == 1) {
			return true;
		}else {
			return false ;
		}
	}

}
