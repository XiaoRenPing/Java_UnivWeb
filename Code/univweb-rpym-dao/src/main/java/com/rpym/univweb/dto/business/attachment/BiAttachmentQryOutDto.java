package com.rpym.univweb.dto.business.attachment;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BiAttachmentQryOutDto {

	private Long id;

    private Long ownertype;
    private String ownertypetext;
    
    private Long ownerid;
    private String owner;
    
    private String filename;

    private String path;

    private Long size;

    private String bussinessid;

    private Long creatoruserid;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationtime;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deletiontime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOwnertype() {
		return ownertype;
	}

	public void setOwnertype(Long ownertype) {
		this.ownertype = ownertype;
	}

	public String getOwnertypetext() {
		if(this.getOwnertype() == null) {
			this.setOwnertypetext("未绑定归属类型");
		}
		return ownertypetext;
	}

	public void setOwnertypetext(String ownertypetext) {
		this.ownertypetext = ownertypetext;
	}

	public Long getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(Long ownerid) {
		this.ownerid = ownerid;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getBussinessid() {
		return bussinessid;
	}

	public void setBussinessid(String bussinessid) {
		this.bussinessid = bussinessid;
	}

	public Long getCreatoruserid() {
		return creatoruserid;
	}

	public void setCreatoruserid(Long creatoruserid) {
		this.creatoruserid = creatoruserid;
	}

	public Date getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public Date getDeletiontime() {
		return deletiontime;
	}

	public void setDeletiontime(Date deletiontime) {
		this.deletiontime = deletiontime;
	}
    
    
    
}
