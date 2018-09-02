package com.rpym.univweb.dto.business.attachment;

import java.util.Date;

public class AttachmentAddAndUpdateDto {

	private Long id;

    private Long ownertype;

    private Long ownerid;

    private String filename;

    private String path;

    private Long size;

    private String batchid;

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

	public Long getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(Long ownerid) {
		this.ownerid = ownerid;
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

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

}
