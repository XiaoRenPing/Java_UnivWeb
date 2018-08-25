package com.rpym.univweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BusEnterprise implements Serializable {
    private Long id;

    private String name;

    private String businesslicense;

    private String organizationcode;

    private String bankopenaccountprovince;

    private String bankopenaccountcity;

    private String regtime;

    private BigDecimal registeredcapital;

    private String lnsize;

    private String businessscope;

    private String bankname;

    private String bankusername;

    private String bankaccount;

    private String companyprovince;

    private String companycity;

    private String companyaddress;

    private String companypostcode;

    private String juridicalpersonname;

    private String juridicalpersonidcode;

    private Integer status;

    private Long creatoruserid;

    private Date creationtime;

    private Long lastmodifieruserid;

    private Date lastmodificationtime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    public String getOrganizationcode() {
        return organizationcode;
    }

    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode == null ? null : organizationcode.trim();
    }

    public String getBankopenaccountprovince() {
        return bankopenaccountprovince;
    }

    public void setBankopenaccountprovince(String bankopenaccountprovince) {
        this.bankopenaccountprovince = bankopenaccountprovince == null ? null : bankopenaccountprovince.trim();
    }

    public String getBankopenaccountcity() {
        return bankopenaccountcity;
    }

    public void setBankopenaccountcity(String bankopenaccountcity) {
        this.bankopenaccountcity = bankopenaccountcity == null ? null : bankopenaccountcity.trim();
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    public BigDecimal getRegisteredcapital() {
        return registeredcapital;
    }

    public void setRegisteredcapital(BigDecimal registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    public String getLnsize() {
        return lnsize;
    }

    public void setLnsize(String lnsize) {
        this.lnsize = lnsize == null ? null : lnsize.trim();
    }

    public String getBusinessscope() {
        return businessscope;
    }

    public void setBusinessscope(String businessscope) {
        this.businessscope = businessscope == null ? null : businessscope.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankusername() {
        return bankusername;
    }

    public void setBankusername(String bankusername) {
        this.bankusername = bankusername == null ? null : bankusername.trim();
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getCompanyprovince() {
        return companyprovince;
    }

    public void setCompanyprovince(String companyprovince) {
        this.companyprovince = companyprovince == null ? null : companyprovince.trim();
    }

    public String getCompanycity() {
        return companycity;
    }

    public void setCompanycity(String companycity) {
        this.companycity = companycity == null ? null : companycity.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanypostcode() {
        return companypostcode;
    }

    public void setCompanypostcode(String companypostcode) {
        this.companypostcode = companypostcode == null ? null : companypostcode.trim();
    }

    public String getJuridicalpersonname() {
        return juridicalpersonname;
    }

    public void setJuridicalpersonname(String juridicalpersonname) {
        this.juridicalpersonname = juridicalpersonname == null ? null : juridicalpersonname.trim();
    }

    public String getJuridicalpersonidcode() {
        return juridicalpersonidcode;
    }

    public void setJuridicalpersonidcode(String juridicalpersonidcode) {
        this.juridicalpersonidcode = juridicalpersonidcode == null ? null : juridicalpersonidcode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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