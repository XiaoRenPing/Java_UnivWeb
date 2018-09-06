package com.rpym.univweb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rpym.univweb.entity.SysMenu;
import com.rpym.univweb.entity.SysMenuExample;

public interface SysMenuMapper {
    int countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

	//List<SysMenusExt> selectMenusByUserAndRole(@Param("userId")Long userId, @Param("userRoles")List<SysUserRoles> userRoles);
    //List<SysMenu> selectMenusByUserAndRole(@Param("pojo")MenuQryPojo pojo);

	List<SysMenu> selectMenusByUserAndRole(@Param("userId")Long userId, @Param("roleIds")List<Long> roleIdList);

}