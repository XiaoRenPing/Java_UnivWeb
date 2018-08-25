package com.rpym.univweb.dto.business.merchandise.category;

import com.rpym.univweb.dto.PageDto;

public class CategoryQryInDto extends PageDto {

	private Long parentid;

	private String catename;

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

}
