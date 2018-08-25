package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUsers implements Serializable {
    private Long id;

    private Integer enterpriseid;

    private Integer tenantid;

    private String name;

    private String surname;

    private String username;

    private String password;

    private String emailaddress;

    private Boolean isemailconfirmed;

    private String emailconfirmationcode;

    private String passwordresetcode;

    private Date lastlogintime;

    private Boolean isdeleted;

    private Long deleteruserid;

    private Date deletiontime;

    private Date lastmodificationtime;

    private Long lastmodifieruserid;

    private Date creationtime;

    private Long creatoruserid;

    private Boolean isactive;

    private Boolean shouldchangepasswordonnextlogin;

    private String profilepictureid;

    private String authenticationsource;

    private Date lockoutenddateutc;

    private Integer accessfailedcount;

    private Boolean islockoutenabled;

    private String mobilenumber;

    private String phonenumber;

    private Boolean isphonenumberconfirmed;

    private String securitystamp;

    private Boolean istwofactorenabled;

    private String clientid;

    private String clientsecret;

    private String idcardnumber;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    public Boolean getIsemailconfirmed() {
        return isemailconfirmed;
    }

    public void setIsemailconfirmed(Boolean isemailconfirmed) {
        this.isemailconfirmed = isemailconfirmed;
    }

    public String getEmailconfirmationcode() {
        return emailconfirmationcode;
    }

    public void setEmailconfirmationcode(String emailconfirmationcode) {
        this.emailconfirmationcode = emailconfirmationcode == null ? null : emailconfirmationcode.trim();
    }

    public String getPasswordresetcode() {
        return passwordresetcode;
    }

    public void setPasswordresetcode(String passwordresetcode) {
        this.passwordresetcode = passwordresetcode == null ? null : passwordresetcode.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
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

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Boolean getShouldchangepasswordonnextlogin() {
        return shouldchangepasswordonnextlogin;
    }

    public void setShouldchangepasswordonnextlogin(Boolean shouldchangepasswordonnextlogin) {
        this.shouldchangepasswordonnextlogin = shouldchangepasswordonnextlogin;
    }

    public String getProfilepictureid() {
        return profilepictureid;
    }

    public void setProfilepictureid(String profilepictureid) {
        this.profilepictureid = profilepictureid == null ? null : profilepictureid.trim();
    }

    public String getAuthenticationsource() {
        return authenticationsource;
    }

    public void setAuthenticationsource(String authenticationsource) {
        this.authenticationsource = authenticationsource == null ? null : authenticationsource.trim();
    }

    public Date getLockoutenddateutc() {
        return lockoutenddateutc;
    }

    public void setLockoutenddateutc(Date lockoutenddateutc) {
        this.lockoutenddateutc = lockoutenddateutc;
    }

    public Integer getAccessfailedcount() {
        return accessfailedcount;
    }

    public void setAccessfailedcount(Integer accessfailedcount) {
        this.accessfailedcount = accessfailedcount;
    }

    public Boolean getIslockoutenabled() {
        return islockoutenabled;
    }

    public void setIslockoutenabled(Boolean islockoutenabled) {
        this.islockoutenabled = islockoutenabled;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber == null ? null : mobilenumber.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Boolean getIsphonenumberconfirmed() {
        return isphonenumberconfirmed;
    }

    public void setIsphonenumberconfirmed(Boolean isphonenumberconfirmed) {
        this.isphonenumberconfirmed = isphonenumberconfirmed;
    }

    public String getSecuritystamp() {
        return securitystamp;
    }

    public void setSecuritystamp(String securitystamp) {
        this.securitystamp = securitystamp == null ? null : securitystamp.trim();
    }

    public Boolean getIstwofactorenabled() {
        return istwofactorenabled;
    }

    public void setIstwofactorenabled(Boolean istwofactorenabled) {
        this.istwofactorenabled = istwofactorenabled;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getClientsecret() {
        return clientsecret;
    }

    public void setClientsecret(String clientsecret) {
        this.clientsecret = clientsecret == null ? null : clientsecret.trim();
    }

    public String getIdcardnumber() {
        return idcardnumber;
    }

    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber == null ? null : idcardnumber.trim();
    }
}