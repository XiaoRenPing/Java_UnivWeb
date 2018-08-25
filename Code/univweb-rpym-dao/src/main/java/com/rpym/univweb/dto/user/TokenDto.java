package com.rpym.univweb.dto.user;

public class TokenDto {
	private String token;
		
	private Long userid;
	
	private String userName;
	
	private String userRoleName;
	
	private Integer enterpriseId;
	
	private String enterpriseName;
	
	private Integer roletype;
	 
	private String roleTypeName;
	
	private Long enterpriseStatus;
	
	private String enterpriseStatusName;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getRoleTypeName() {
		return roleTypeName;
	}
	public void setRoleTypeName(String roleTypeName) {
		this.roleTypeName = roleTypeName;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public Long getEnterpriseStatus() {
		return enterpriseStatus;
	}
	public void setEnterpriseStatus(Long enterpriseStatus) {
		this.enterpriseStatus = enterpriseStatus;
	}
	public String getEnterpriseStatusName() {
		return enterpriseStatusName;
	}
	public void setEnterpriseStatusName(String enterpriseStatusName) {
		this.enterpriseStatusName = enterpriseStatusName;
	}
	public Integer getRoletype() {
		return roletype;
	}
	public void setRoletype(Integer roletype) {
		this.roletype = roletype;
	}

}
	
