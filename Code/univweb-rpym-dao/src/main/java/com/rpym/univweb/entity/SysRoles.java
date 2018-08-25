package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class SysRoles implements Serializable {
    private Integer id;

    private Integer tenantid;

    private String name;

    private String displayname;

    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    private Date creationtime;

    private Long creatoruserid;

    private Boolean isstatic;

    private Boolean isdefault;

    private Boolean isdeleted;

    private Long deleteruserid;

    private Date deletiontime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
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

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
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
}