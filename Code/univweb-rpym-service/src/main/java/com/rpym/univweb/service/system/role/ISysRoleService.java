package com.rpym.univweb.service.system.role;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.role.QuerySysRoleDto;
import com.rpym.univweb.dto.role.SysRolesDto;
import com.rpym.univweb.entity.SysRoles;

public interface ISysRoleService {

	//新增角色
    boolean saveRole(SysRolesDto dto);
    //删除角色
    public boolean deleteRole(int id);
    //角色列表
    public PageInfo<SysRoles> queryRoles(QuerySysRoleDto qdto);
    //单个详情
    public SysRoles queryRolesById(int id);
    //更新角色
    public boolean updateRolesInfo(SysRolesDto dto);
}
