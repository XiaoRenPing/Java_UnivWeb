package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class BiAttachment implements Serializable {
    private Long id;

    private Long ownertype;

    private Long ownerid;

    private String filename;

    private String path;

    private Long size;

    private String bussinessid;

    private Long creatoruserid;

    private Date creationtime;

    private Long deleteruserid;

    private Date deletiontime;

    private Boolean isdeleted;

    private static final long serialVersionUID = 1L;

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
        this.filename = filename == null ? null : filename.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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
        this.bussinessid = bussinessid == null ? null : bussinessid.trim();
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

    public Long getDeleteruserid() {
        return deleteruserid;
    }

    public void setDeleteruserid(Long deleteruserid) {
        this.deleteruserid = deleteruserid;
    }

    public Date getDeletiontime() {
        return deletiontime;
    }

    public void setDeletiontime(Date deletiontime) {
        this.deletiontime = deletiontime;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}