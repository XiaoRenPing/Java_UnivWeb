package com.rpym.univweb.dto.permission;

public class PermissionUpdateDto {

	private Long id;
	
    private String name;

    private boolean isgranted;

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

	public boolean isIsgranted() {
		return isgranted;
	}

	public void setIsgranted(boolean isgranted) {
		this.isgranted = isgranted;
	}
	
}
