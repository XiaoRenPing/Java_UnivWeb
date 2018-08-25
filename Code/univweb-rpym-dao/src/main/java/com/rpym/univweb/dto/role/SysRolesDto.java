package com.rpym.univweb.dto.role;

public class SysRolesDto {

	private Long id;

	private String name;

	private String displayname;

	private Boolean isstatic;

	private Boolean isdefault;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public Boolean getIsstatic() {
		return isstatic;
	}

	public void setIsstatic(Boolean isstatic) {
		this.isstatic = isstatic;
	}

	public Boolean getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	
}
