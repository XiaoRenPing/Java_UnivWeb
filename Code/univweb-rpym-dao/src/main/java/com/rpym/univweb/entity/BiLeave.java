package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class BiLeave implements Serializable {
    private Long id;

    private String name;

    private String content;

    private String description;

    private Long applyuserid;

    private String applyusername;

    private Long receiveuserid;

    private String receiveusername;

    private Date creationtime;

    private Integer status;

    private Date approvetime;

    private String taskid;

    private String processinstanceid;

    private static final long serialVersionUID = 1L;

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
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getApplyuserid() {
        return applyuserid;
    }

    public void setApplyuserid(Long applyuserid) {
        this.applyuserid = applyuserid;
    }

    public String getApplyusername() {
        return applyusername;
    }

    public void setApplyusername(String applyusername) {
        this.applyusername = applyusername == null ? null : applyusername.trim();
    }

    public Long getReceiveuserid() {
        return receiveuserid;
    }

    public void setReceiveuserid(Long receiveuserid) {
        this.receiveuserid = receiveuserid;
    }

    public String getReceiveusername() {
        return receiveusername;
    }

    public void setReceiveusername(String receiveusername) {
        this.receiveusername = receiveusername == null ? null : receiveusername.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid == null ? null : processinstanceid.trim();
    }
}