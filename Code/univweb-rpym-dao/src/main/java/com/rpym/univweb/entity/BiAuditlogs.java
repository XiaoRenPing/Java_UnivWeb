package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class BiAuditlogs implements Serializable {
    private Long id;

    private Long userid;

    private String methodname;

    private String parameters;

    private Date executiontime;

    private Integer executionduration;

    private String clientipaddress;

    private String clientname;

    private String response;

    private String apioperation;

    private Long urlid;

    private Long useragentid;

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

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }

    public Date getExecutiontime() {
        return executiontime;
    }

    public void setExecutiontime(Date executiontime) {
        this.executiontime = executiontime;
    }

    public Integer getExecutionduration() {
        return executionduration;
    }

    public void setExecutionduration(Integer executionduration) {
        this.executionduration = executionduration;
    }

    public String getClientipaddress() {
        return clientipaddress;
    }

    public void setClientipaddress(String clientipaddress) {
        this.clientipaddress = clientipaddress == null ? null : clientipaddress.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public String getApioperation() {
        return apioperation;
    }

    public void setApioperation(String apioperation) {
        this.apioperation = apioperation == null ? null : apioperation.trim();
    }

    public Long getUrlid() {
        return urlid;
    }

    public void setUrlid(Long urlid) {
        this.urlid = urlid;
    }

    public Long getUseragentid() {
        return useragentid;
    }

    public void setUseragentid(Long useragentid) {
        this.useragentid = useragentid;
    }
}