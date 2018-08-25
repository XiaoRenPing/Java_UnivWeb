package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusMerchandiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusMerchandiseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameIsNull() {
            addCriterion("MerchandiseName is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameIsNotNull() {
            addCriterion("MerchandiseName is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameEqualTo(String value) {
            addCriterion("MerchandiseName =", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameNotEqualTo(String value) {
            addCriterion("MerchandiseName <>", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameGreaterThan(String value) {
            addCriterion("MerchandiseName >", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseName >=", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameLessThan(String value) {
            addCriterion("MerchandiseName <", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseName <=", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameLike(String value) {
            addCriterion("MerchandiseName like", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameNotLike(String value) {
            addCriterion("MerchandiseName not like", value, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameIn(List<String> values) {
            addCriterion("MerchandiseName in", values, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameNotIn(List<String> values) {
            addCriterion("MerchandiseName not in", values, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameBetween(String value1, String value2) {
            addCriterion("MerchandiseName between", value1, value2, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andMerchandisenameNotBetween(String value1, String value2) {
            addCriterion("MerchandiseName not between", value1, value2, "merchandisename");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("SPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("SPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Long value) {
            addCriterion("SPrice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Long value) {
            addCriterion("SPrice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Long value) {
            addCriterion("SPrice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SPrice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Long value) {
            addCriterion("SPrice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Long value) {
            addCriterion("SPrice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Long> values) {
            addCriterion("SPrice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Long> values) {
            addCriterion("SPrice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Long value1, Long value2) {
            addCriterion("SPrice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Long value1, Long value2) {
            addCriterion("SPrice not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelIsNull() {
            addCriterion("MerchandiseModel is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelIsNotNull() {
            addCriterion("MerchandiseModel is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelEqualTo(String value) {
            addCriterion("MerchandiseModel =", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelNotEqualTo(String value) {
            addCriterion("MerchandiseModel <>", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelGreaterThan(String value) {
            addCriterion("MerchandiseModel >", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseModel >=", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelLessThan(String value) {
            addCriterion("MerchandiseModel <", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseModel <=", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelLike(String value) {
            addCriterion("MerchandiseModel like", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelNotLike(String value) {
            addCriterion("MerchandiseModel not like", value, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelIn(List<String> values) {
            addCriterion("MerchandiseModel in", values, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelNotIn(List<String> values) {
            addCriterion("MerchandiseModel not in", values, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelBetween(String value1, String value2) {
            addCriterion("MerchandiseModel between", value1, value2, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andMerchandisemodelNotBetween(String value1, String value2) {
            addCriterion("MerchandiseModel not between", value1, value2, "merchandisemodel");
            return (Criteria) this;
        }

        public Criteria andPicturesIsNull() {
            addCriterion("Pictures is null");
            return (Criteria) this;
        }

        public Criteria andPicturesIsNotNull() {
            addCriterion("Pictures is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesEqualTo(String value) {
            addCriterion("Pictures =", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotEqualTo(String value) {
            addCriterion("Pictures <>", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesGreaterThan(String value) {
            addCriterion("Pictures >", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesGreaterThanOrEqualTo(String value) {
            addCriterion("Pictures >=", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesLessThan(String value) {
            addCriterion("Pictures <", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesLessThanOrEqualTo(String value) {
            addCriterion("Pictures <=", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesLike(String value) {
            addCriterion("Pictures like", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotLike(String value) {
            addCriterion("Pictures not like", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesIn(List<String> values) {
            addCriterion("Pictures in", values, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotIn(List<String> values) {
            addCriterion("Pictures not in", values, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesBetween(String value1, String value2) {
            addCriterion("Pictures between", value1, value2, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotBetween(String value1, String value2) {
            addCriterion("Pictures not between", value1, value2, "pictures");
            return (Criteria) this;
        }

        public Criteria andVediosIsNull() {
            addCriterion("Vedios is null");
            return (Criteria) this;
        }

        public Criteria andVediosIsNotNull() {
            addCriterion("Vedios is not null");
            return (Criteria) this;
        }

        public Criteria andVediosEqualTo(String value) {
            addCriterion("Vedios =", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotEqualTo(String value) {
            addCriterion("Vedios <>", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosGreaterThan(String value) {
            addCriterion("Vedios >", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosGreaterThanOrEqualTo(String value) {
            addCriterion("Vedios >=", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosLessThan(String value) {
            addCriterion("Vedios <", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosLessThanOrEqualTo(String value) {
            addCriterion("Vedios <=", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosLike(String value) {
            addCriterion("Vedios like", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotLike(String value) {
            addCriterion("Vedios not like", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosIn(List<String> values) {
            addCriterion("Vedios in", values, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotIn(List<String> values) {
            addCriterion("Vedios not in", values, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosBetween(String value1, String value2) {
            addCriterion("Vedios between", value1, value2, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotBetween(String value1, String value2) {
            addCriterion("Vedios not between", value1, value2, "vedios");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescIsNull() {
            addCriterion("MerchandiseDesc is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescIsNotNull() {
            addCriterion("MerchandiseDesc is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescEqualTo(String value) {
            addCriterion("MerchandiseDesc =", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescNotEqualTo(String value) {
            addCriterion("MerchandiseDesc <>", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescGreaterThan(String value) {
            addCriterion("MerchandiseDesc >", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseDesc >=", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescLessThan(String value) {
            addCriterion("MerchandiseDesc <", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseDesc <=", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescLike(String value) {
            addCriterion("MerchandiseDesc like", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescNotLike(String value) {
            addCriterion("MerchandiseDesc not like", value, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescIn(List<String> values) {
            addCriterion("MerchandiseDesc in", values, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescNotIn(List<String> values) {
            addCriterion("MerchandiseDesc not in", values, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescBetween(String value1, String value2) {
            addCriterion("MerchandiseDesc between", value1, value2, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andMerchandisedescNotBetween(String value1, String value2) {
            addCriterion("MerchandiseDesc not between", value1, value2, "merchandisedesc");
            return (Criteria) this;
        }

        public Criteria andFactorydateIsNull() {
            addCriterion("FactoryDate is null");
            return (Criteria) this;
        }

        public Criteria andFactorydateIsNotNull() {
            addCriterion("FactoryDate is not null");
            return (Criteria) this;
        }

        public Criteria andFactorydateEqualTo(Date value) {
            addCriterion("FactoryDate =", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotEqualTo(Date value) {
            addCriterion("FactoryDate <>", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateGreaterThan(Date value) {
            addCriterion("FactoryDate >", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateGreaterThanOrEqualTo(Date value) {
            addCriterion("FactoryDate >=", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateLessThan(Date value) {
            addCriterion("FactoryDate <", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateLessThanOrEqualTo(Date value) {
            addCriterion("FactoryDate <=", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateIn(List<Date> values) {
            addCriterion("FactoryDate in", values, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotIn(List<Date> values) {
            addCriterion("FactoryDate not in", values, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateBetween(Date value1, Date value2) {
            addCriterion("FactoryDate between", value1, value2, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotBetween(Date value1, Date value2) {
            addCriterion("FactoryDate not between", value1, value2, "factorydate");
            return (Criteria) this;
        }

        public Criteria andHtmlpathIsNull() {
            addCriterion("HtmlPath is null");
            return (Criteria) this;
        }

        public Criteria andHtmlpathIsNotNull() {
            addCriterion("HtmlPath is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlpathEqualTo(String value) {
            addCriterion("HtmlPath =", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathNotEqualTo(String value) {
            addCriterion("HtmlPath <>", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathGreaterThan(String value) {
            addCriterion("HtmlPath >", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathGreaterThanOrEqualTo(String value) {
            addCriterion("HtmlPath >=", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathLessThan(String value) {
            addCriterion("HtmlPath <", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathLessThanOrEqualTo(String value) {
            addCriterion("HtmlPath <=", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathLike(String value) {
            addCriterion("HtmlPath like", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathNotLike(String value) {
            addCriterion("HtmlPath not like", value, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathIn(List<String> values) {
            addCriterion("HtmlPath in", values, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathNotIn(List<String> values) {
            addCriterion("HtmlPath not in", values, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathBetween(String value1, String value2) {
            addCriterion("HtmlPath between", value1, value2, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andHtmlpathNotBetween(String value1, String value2) {
            addCriterion("HtmlPath not between", value1, value2, "htmlpath");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNull() {
            addCriterion("ProduceDate is null");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNotNull() {
            addCriterion("ProduceDate is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateEqualTo(Date value) {
            addCriterion("ProduceDate =", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotEqualTo(Date value) {
            addCriterion("ProduceDate <>", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThan(Date value) {
            addCriterion("ProduceDate >", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ProduceDate >=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThan(Date value) {
            addCriterion("ProduceDate <", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThanOrEqualTo(Date value) {
            addCriterion("ProduceDate <=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateIn(List<Date> values) {
            addCriterion("ProduceDate in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotIn(List<Date> values) {
            addCriterion("ProduceDate not in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateBetween(Date value1, Date value2) {
            addCriterion("ProduceDate between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotBetween(Date value1, Date value2) {
            addCriterion("ProduceDate not between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNull() {
            addCriterion("PostTime is null");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNotNull() {
            addCriterion("PostTime is not null");
            return (Criteria) this;
        }

        public Criteria andPosttimeEqualTo(Date value) {
            addCriterion("PostTime =", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotEqualTo(Date value) {
            addCriterion("PostTime <>", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThan(Date value) {
            addCriterion("PostTime >", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PostTime >=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThan(Date value) {
            addCriterion("PostTime <", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("PostTime <=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeIn(List<Date> values) {
            addCriterion("PostTime in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotIn(List<Date> values) {
            addCriterion("PostTime not in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeBetween(Date value1, Date value2) {
            addCriterion("PostTime between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("PostTime not between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("CategoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("CategoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("CategoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("CategoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("CategoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("CategoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("CategoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("CategoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("CategoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("CategoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}