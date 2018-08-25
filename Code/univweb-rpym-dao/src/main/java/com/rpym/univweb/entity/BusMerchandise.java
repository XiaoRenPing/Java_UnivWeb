package com.rpym.univweb.entity;

import java.io.Serializable;
import java.util.Date;

public class BusMerchandise implements Serializable {
    private Long id;

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

    private Date producedate;

    private Date posttime;

    private Long categoryid;

    private Byte isdeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchandisename() {
        return merchandisename;
    }

    public void setMerchandisename(String merchandisename) {
        this.merchandisename = merchandisename == null ? null : merchandisename.trim();
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
        this.merchandisemodel = merchandisemodel == null ? null : merchandisemodel.trim();
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    public String getVedios() {
        return vedios;
    }

    public void setVedios(String vedios) {
        this.vedios = vedios == null ? null : vedios.trim();
    }

    public String getMerchandisedesc() {
        return merchandisedesc;
    }

    public void setMerchandisedesc(String merchandisedesc) {
        this.merchandisedesc = merchandisedesc == null ? null : merchandisedesc.trim();
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
        this.htmlpath = htmlpath == null ? null : htmlpath.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }
}