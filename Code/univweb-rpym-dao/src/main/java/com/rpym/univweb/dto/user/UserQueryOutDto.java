package com.rpym.univweb.dto.user;

public class UserQueryOutDto {

	private Long id;
	
	private String name;

	private String surname;

	private String username;

	private String emailaddress;
	
	private String phonenumber;

    private String idcardnumber;

    private Boolean isactive;
    private String isactivetext;
    
    
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
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getIdcardnumber() {
		return idcardnumber;
	}

	public void setIdcardnumber(String idcardnumber) {
		this.idcardnumber = idcardnumber;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public String getIsactivetext() {
		if(this.getIsactive()) {
			this.setIsactivetext("正常");
		}else {
			this.setIsactivetext("禁用");
		}
		return isactivetext;
	}

	public void setIsactivetext(String isactivetext) {
		this.isactivetext = isactivetext;
	}
    
}
