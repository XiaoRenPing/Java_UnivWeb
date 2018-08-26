package com.rpym.univweb.dto.role;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SysRolesQryOutDto {

	private Integer id;

    private String name;

    private String displayname;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationtime;

    private Long creatoruserid;

    private Boolean isdeleted;
    private String isdeletedtext;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Date getLastmodificationtime() {
		return lastmodificationtime;
	}
	public void setLastmodificationtime(Date lastmodificationtime) {
		this.lastmodificationtime = lastmodificationtime;
	}
	public Long getLastmodifieruserid() {
		return lastmodifieruserid;
	}
	public void setLastmodifieruserid(Long lastmodifieruserid) {
		this.lastmodifieruserid = lastmodifieruserid;
	}
	public Date getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}
	public Long getCreatoruserid() {
		return creatoruserid;
	}
	public void setCreatoruserid(Long creatoruserid) {
		this.creatoruserid = creatoruserid;
	}
	public Boolean getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public String getIsdeletedtext() {
		if(this.getIsdeleted()) {
			this.setIsdeletedtext("是");
		}else {
			this.setIsdeletedtext("否");
		}
		return isdeletedtext;
	}
	public void setIsdeletedtext(String isdeletedtext) {
		this.isdeletedtext = isdeletedtext;
	}

    
}
