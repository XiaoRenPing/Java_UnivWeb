package com.rpym.univweb.entity;

import java.io.Serializable;

public class BiAuditlogAgent implements Serializable {
    private Long id;

    private String useragent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }
}