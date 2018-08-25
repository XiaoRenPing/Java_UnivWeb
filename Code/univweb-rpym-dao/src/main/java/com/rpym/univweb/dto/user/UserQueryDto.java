package com.rpym.univweb.dto.user;

import com.rpym.univweb.dto.PageDto;

public class UserQueryDto extends PageDto{

	private String username;
	
	private String name;
	
	private Integer roleid;
	
	private Boolean isactive;

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
