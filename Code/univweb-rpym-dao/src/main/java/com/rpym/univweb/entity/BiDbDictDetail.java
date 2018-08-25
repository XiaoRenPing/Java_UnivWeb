package com.rpym.univweb.entity;

import java.io.Serializable;

public class BiDbDictDetail implements Serializable {
    private Integer id;

    private Long pid;

    private String code;

    private String name;

    private String english;

    private String remark;

    private Boolean issystem;

    private String selfpid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english == null ? null : english.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(Boolean issystem) {
        this.issystem = issystem;
    }

    public String getSelfpid() {
        return selfpid;
    }

    public void setSelfpid(String selfpid) {
        this.selfpid = selfpid == null ? null : selfpid.trim();
    }
}