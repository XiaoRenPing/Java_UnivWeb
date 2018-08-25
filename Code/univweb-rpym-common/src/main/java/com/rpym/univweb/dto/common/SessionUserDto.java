package com.rpym.univweb.dto.common;

import java.util.List;

import com.rpym.univweb.entity.BusEnterprise;
import com.rpym.univweb.entity.SysUsers;

public class SessionUserDto {
	private static final long serialVersionUID = 1L;
	private SysUsers user;
	private BusEnterprise enterprise;
	private List<Integer> roleids;
	private List<String> permissionsCodes; // 权限code集合

	public BusEnterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(BusEnterprise enterprise) {
		this.enterprise = enterprise;
	}

	public SysUsers getUser() {
		return user;
	}

	public void setUser(SysUsers user) {
		this.user = user;
	}
	public List<Integer> getRoleids() {
		return roleids;
	}

	public void setRoleids(List<Integer> roleids) {
		this.roleids = roleids;
	}
}