package com.rpym.univweb.dto.merchandise;

import java.util.Date;

public class MerchandiseAddDto {

	private String merchandisename;
    private Long price;

    private Long sprice;

    private String merchandisemodel;

    private String pictures;

    private String vedios;

    private String merchandisedesc;

    private Date factorydate;

    private String htmlpath;

    private Integer status;

	public String getMerchandisename() {
		return merchandisename;
	}

	public void setMerchandisename(String merchandisename) {
		this.merchandisename = merchandisename;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getSprice() {
		return sprice;
	}

	public void setSprice(Long sprice) {
		this.sprice = sprice;
	}

	public String getMerchandisemodel() {
		return merchandisemodel;
	}

	public void setMerchandisemodel(String merchandisemodel) {
		this.merchandisemodel = merchandisemodel;
	}

	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public String getVedios() {
		return vedios;
	}

	public void setVedios(String vedios) {
		this.vedios = vedios;
	}

	public String getMerchandisedesc() {
		return merchandisedesc;
	}

	public void setMerchandisedesc(String merchandisedesc) {
		this.merchandisedesc = merchandisedesc;
	}

	public Date getFactorydate() {
		return factorydate;
	}

	public void setFactorydate(Date factorydate) {
		this.factorydate = factorydate;
	}

	public String getHtmlpath() {
		return htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    
    
}
