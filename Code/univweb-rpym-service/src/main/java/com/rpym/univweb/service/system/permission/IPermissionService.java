package com.rpym.univweb.service.system.permission;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.permission.PermissionAddDto;
import com.rpym.univweb.dto.permission.PermissionQueryDto;
import com.rpym.univweb.dto.permission.PermissionUpdateDto;
import com.rpym.univweb.entity.SysPermissions;

public interface IPermissionService {

	String addPermission(PermissionAddDto permissionDto);

	SysPermissions findPermissionById(Long id);

	String deletePermission(Long id);

	PageInfo<SysPermissions> pageListPermission(PermissionQueryDto permissionQueryDto);

	boolean updatePermission(PermissionUpdateDto permissionDto);

}
