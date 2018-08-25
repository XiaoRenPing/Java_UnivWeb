package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUserNotifications implements Serializable {
    private Long id;

    private Long userid;

    private String message;

    private Integer state;

    private Date creationtime;

    private Long creatoruserid;

    private Long lastmodifieruserid;

    private Date lastmodificationtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Long getLastmodifieruserid() {
        return lastmodifieruserid;
    }

    public void setLastmodifieruserid(Long lastmodifieruserid) {
        this.lastmodifieruserid = lastmodifieruserid;
    }

    public Date getLastmodificationtime() {
        return lastmodificationtime;
    }

    public void setLastmodificationtime(Date lastmodificationtime) {
        this.lastmodificationtime = lastmodificationtime;
    }
}