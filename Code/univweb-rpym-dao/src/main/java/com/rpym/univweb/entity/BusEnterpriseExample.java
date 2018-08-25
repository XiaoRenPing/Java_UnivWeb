package com.rpym.univweb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusEnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusEnterpriseExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNull() {
            addCriterion("BusinessLicense is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNotNull() {
            addCriterion("BusinessLicense is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseEqualTo(String value) {
            addCriterion("BusinessLicense =", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotEqualTo(String value) {
            addCriterion("BusinessLicense <>", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThan(String value) {
            addCriterion("BusinessLicense >", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicense >=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThan(String value) {
            addCriterion("BusinessLicense <", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicense <=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLike(String value) {
            addCriterion("BusinessLicense like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotLike(String value) {
            addCriterion("BusinessLicense not like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIn(List<String> values) {
            addCriterion("BusinessLicense in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotIn(List<String> values) {
            addCriterion("BusinessLicense not in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseBetween(String value1, String value2) {
            addCriterion("BusinessLicense between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotBetween(String value1, String value2) {
            addCriterion("BusinessLicense not between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNull() {
            addCriterion("OrganizationCode is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNotNull() {
            addCriterion("OrganizationCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeEqualTo(String value) {
            addCriterion("OrganizationCode =", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotEqualTo(String value) {
            addCriterion("OrganizationCode <>", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThan(String value) {
            addCriterion("OrganizationCode >", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OrganizationCode >=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThan(String value) {
            addCriterion("OrganizationCode <", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThanOrEqualTo(String value) {
            addCriterion("OrganizationCode <=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLike(String value) {
            addCriterion("OrganizationCode like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotLike(String value) {
            addCriterion("OrganizationCode not like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIn(List<String> values) {
            addCriterion("OrganizationCode in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotIn(List<String> values) {
            addCriterion("OrganizationCode not in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeBetween(String value1, String value2) {
            addCriterion("OrganizationCode between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotBetween(String value1, String value2) {
            addCriterion("OrganizationCode not between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceIsNull() {
            addCriterion("BankOpenAccountProvince is null");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceIsNotNull() {
            addCriterion("BankOpenAccountProvince is not null");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceEqualTo(String value) {
            addCriterion("BankOpenAccountProvince =", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceNotEqualTo(String value) {
            addCriterion("BankOpenAccountProvince <>", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceGreaterThan(String value) {
            addCriterion("BankOpenAccountProvince >", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("BankOpenAccountProvince >=", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceLessThan(String value) {
            addCriterion("BankOpenAccountProvince <", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceLessThanOrEqualTo(String value) {
            addCriterion("BankOpenAccountProvince <=", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceLike(String value) {
            addCriterion("BankOpenAccountProvince like", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceNotLike(String value) {
            addCriterion("BankOpenAccountProvince not like", value, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceIn(List<String> values) {
            addCriterion("BankOpenAccountProvince in", values, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceNotIn(List<String> values) {
            addCriterion("BankOpenAccountProvince not in", values, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceBetween(String value1, String value2) {
            addCriterion("BankOpenAccountProvince between", value1, value2, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountprovinceNotBetween(String value1, String value2) {
            addCriterion("BankOpenAccountProvince not between", value1, value2, "bankopenaccountprovince");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityIsNull() {
            addCriterion("BankOpenAccountCity is null");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityIsNotNull() {
            addCriterion("BankOpenAccountCity is not null");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityEqualTo(String value) {
            addCriterion("BankOpenAccountCity =", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityNotEqualTo(String value) {
            addCriterion("BankOpenAccountCity <>", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityGreaterThan(String value) {
            addCriterion("BankOpenAccountCity >", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityGreaterThanOrEqualTo(String value) {
            addCriterion("BankOpenAccountCity >=", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityLessThan(String value) {
            addCriterion("BankOpenAccountCity <", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityLessThanOrEqualTo(String value) {
            addCriterion("BankOpenAccountCity <=", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityLike(String value) {
            addCriterion("BankOpenAccountCity like", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityNotLike(String value) {
            addCriterion("BankOpenAccountCity not like", value, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityIn(List<String> values) {
            addCriterion("BankOpenAccountCity in", values, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityNotIn(List<String> values) {
            addCriterion("BankOpenAccountCity not in", values, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityBetween(String value1, String value2) {
            addCriterion("BankOpenAccountCity between", value1, value2, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andBankopenaccountcityNotBetween(String value1, String value2) {
            addCriterion("BankOpenAccountCity not between", value1, value2, "bankopenaccountcity");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("Regtime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("Regtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(String value) {
            addCriterion("Regtime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(String value) {
            addCriterion("Regtime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(String value) {
            addCriterion("Regtime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(String value) {
            addCriterion("Regtime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(String value) {
            addCriterion("Regtime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(String value) {
            addCriterion("Regtime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLike(String value) {
            addCriterion("Regtime like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotLike(String value) {
            addCriterion("Regtime not like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<String> values) {
            addCriterion("Regtime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<String> values) {
            addCriterion("Regtime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(String value1, String value2) {
            addCriterion("Regtime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(String value1, String value2) {
            addCriterion("Regtime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNull() {
            addCriterion("RegisteredCapital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNotNull() {
            addCriterion("RegisteredCapital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalEqualTo(BigDecimal value) {
            addCriterion("RegisteredCapital =", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotEqualTo(BigDecimal value) {
            addCriterion("RegisteredCapital <>", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThan(BigDecimal value) {
            addCriterion("RegisteredCapital >", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RegisteredCapital >=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThan(BigDecimal value) {
            addCriterion("RegisteredCapital <", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RegisteredCapital <=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIn(List<BigDecimal> values) {
            addCriterion("RegisteredCapital in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotIn(List<BigDecimal> values) {
            addCriterion("RegisteredCapital not in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RegisteredCapital between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RegisteredCapital not between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andLnsizeIsNull() {
            addCriterion("LNSIZE is null");
            return (Criteria) this;
        }

        public Criteria andLnsizeIsNotNull() {
            addCriterion("LNSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andLnsizeEqualTo(String value) {
            addCriterion("LNSIZE =", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeNotEqualTo(String value) {
            addCriterion("LNSIZE <>", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeGreaterThan(String value) {
            addCriterion("LNSIZE >", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeGreaterThanOrEqualTo(String value) {
            addCriterion("LNSIZE >=", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeLessThan(String value) {
            addCriterion("LNSIZE <", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeLessThanOrEqualTo(String value) {
            addCriterion("LNSIZE <=", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeLike(String value) {
            addCriterion("LNSIZE like", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeNotLike(String value) {
            addCriterion("LNSIZE not like", value, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeIn(List<String> values) {
            addCriterion("LNSIZE in", values, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeNotIn(List<String> values) {
            addCriterion("LNSIZE not in", values, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeBetween(String value1, String value2) {
            addCriterion("LNSIZE between", value1, value2, "lnsize");
            return (Criteria) this;
        }

        public Criteria andLnsizeNotBetween(String value1, String value2) {
            addCriterion("LNSIZE not between", value1, value2, "lnsize");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNull() {
            addCriterion("BusinessScope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNotNull() {
            addCriterion("BusinessScope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeEqualTo(String value) {
            addCriterion("BusinessScope =", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotEqualTo(String value) {
            addCriterion("BusinessScope <>", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThan(String value) {
            addCriterion("BusinessScope >", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessScope >=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThan(String value) {
            addCriterion("BusinessScope <", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThanOrEqualTo(String value) {
            addCriterion("BusinessScope <=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLike(String value) {
            addCriterion("BusinessScope like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotLike(String value) {
            addCriterion("BusinessScope not like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIn(List<String> values) {
            addCriterion("BusinessScope in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotIn(List<String> values) {
            addCriterion("BusinessScope not in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeBetween(String value1, String value2) {
            addCriterion("BusinessScope between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotBetween(String value1, String value2) {
            addCriterion("BusinessScope not between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankusernameIsNull() {
            addCriterion("BankUserName is null");
            return (Criteria) this;
        }

        public Criteria andBankusernameIsNotNull() {
            addCriterion("BankUserName is not null");
            return (Criteria) this;
        }

        public Criteria andBankusernameEqualTo(String value) {
            addCriterion("BankUserName =", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameNotEqualTo(String value) {
            addCriterion("BankUserName <>", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameGreaterThan(String value) {
            addCriterion("BankUserName >", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameGreaterThanOrEqualTo(String value) {
            addCriterion("BankUserName >=", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameLessThan(String value) {
            addCriterion("BankUserName <", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameLessThanOrEqualTo(String value) {
            addCriterion("BankUserName <=", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameLike(String value) {
            addCriterion("BankUserName like", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameNotLike(String value) {
            addCriterion("BankUserName not like", value, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameIn(List<String> values) {
            addCriterion("BankUserName in", values, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameNotIn(List<String> values) {
            addCriterion("BankUserName not in", values, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameBetween(String value1, String value2) {
            addCriterion("BankUserName between", value1, value2, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankusernameNotBetween(String value1, String value2) {
            addCriterion("BankUserName not between", value1, value2, "bankusername");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("BankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("BankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("BankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("BankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("BankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("BankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("BankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("BankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("BankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("BankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("BankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("BankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("BankAccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceIsNull() {
            addCriterion("CompanyProvince is null");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceIsNotNull() {
            addCriterion("CompanyProvince is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceEqualTo(String value) {
            addCriterion("CompanyProvince =", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceNotEqualTo(String value) {
            addCriterion("CompanyProvince <>", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceGreaterThan(String value) {
            addCriterion("CompanyProvince >", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyProvince >=", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceLessThan(String value) {
            addCriterion("CompanyProvince <", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceLessThanOrEqualTo(String value) {
            addCriterion("CompanyProvince <=", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceLike(String value) {
            addCriterion("CompanyProvince like", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceNotLike(String value) {
            addCriterion("CompanyProvince not like", value, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceIn(List<String> values) {
            addCriterion("CompanyProvince in", values, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceNotIn(List<String> values) {
            addCriterion("CompanyProvince not in", values, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceBetween(String value1, String value2) {
            addCriterion("CompanyProvince between", value1, value2, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanyprovinceNotBetween(String value1, String value2) {
            addCriterion("CompanyProvince not between", value1, value2, "companyprovince");
            return (Criteria) this;
        }

        public Criteria andCompanycityIsNull() {
            addCriterion("CompanyCity is null");
            return (Criteria) this;
        }

        public Criteria andCompanycityIsNotNull() {
            addCriterion("CompanyCity is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycityEqualTo(String value) {
            addCriterion("CompanyCity =", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotEqualTo(String value) {
            addCriterion("CompanyCity <>", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityGreaterThan(String value) {
            addCriterion("CompanyCity >", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyCity >=", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityLessThan(String value) {
            addCriterion("CompanyCity <", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityLessThanOrEqualTo(String value) {
            addCriterion("CompanyCity <=", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityLike(String value) {
            addCriterion("CompanyCity like", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotLike(String value) {
            addCriterion("CompanyCity not like", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityIn(List<String> values) {
            addCriterion("CompanyCity in", values, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotIn(List<String> values) {
            addCriterion("CompanyCity not in", values, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityBetween(String value1, String value2) {
            addCriterion("CompanyCity between", value1, value2, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotBetween(String value1, String value2) {
            addCriterion("CompanyCity not between", value1, value2, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("CompanyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("CompanyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("CompanyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("CompanyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("CompanyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("CompanyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("CompanyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("CompanyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("CompanyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("CompanyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("CompanyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("CompanyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("CompanyAddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeIsNull() {
            addCriterion("CompanyPostcode is null");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeIsNotNull() {
            addCriterion("CompanyPostcode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeEqualTo(String value) {
            addCriterion("CompanyPostcode =", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeNotEqualTo(String value) {
            addCriterion("CompanyPostcode <>", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeGreaterThan(String value) {
            addCriterion("CompanyPostcode >", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyPostcode >=", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeLessThan(String value) {
            addCriterion("CompanyPostcode <", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeLessThanOrEqualTo(String value) {
            addCriterion("CompanyPostcode <=", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeLike(String value) {
            addCriterion("CompanyPostcode like", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeNotLike(String value) {
            addCriterion("CompanyPostcode not like", value, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeIn(List<String> values) {
            addCriterion("CompanyPostcode in", values, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeNotIn(List<String> values) {
            addCriterion("CompanyPostcode not in", values, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeBetween(String value1, String value2) {
            addCriterion("CompanyPostcode between", value1, value2, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andCompanypostcodeNotBetween(String value1, String value2) {
            addCriterion("CompanyPostcode not between", value1, value2, "companypostcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameIsNull() {
            addCriterion("JuridicalPersonName is null");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameIsNotNull() {
            addCriterion("JuridicalPersonName is not null");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameEqualTo(String value) {
            addCriterion("JuridicalPersonName =", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameNotEqualTo(String value) {
            addCriterion("JuridicalPersonName <>", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameGreaterThan(String value) {
            addCriterion("JuridicalPersonName >", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("JuridicalPersonName >=", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameLessThan(String value) {
            addCriterion("JuridicalPersonName <", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameLessThanOrEqualTo(String value) {
            addCriterion("JuridicalPersonName <=", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameLike(String value) {
            addCriterion("JuridicalPersonName like", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameNotLike(String value) {
            addCriterion("JuridicalPersonName not like", value, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameIn(List<String> values) {
            addCriterion("JuridicalPersonName in", values, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameNotIn(List<String> values) {
            addCriterion("JuridicalPersonName not in", values, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameBetween(String value1, String value2) {
            addCriterion("JuridicalPersonName between", value1, value2, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonnameNotBetween(String value1, String value2) {
            addCriterion("JuridicalPersonName not between", value1, value2, "juridicalpersonname");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeIsNull() {
            addCriterion("JuridicalPersonIDCode is null");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeIsNotNull() {
            addCriterion("JuridicalPersonIDCode is not null");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeEqualTo(String value) {
            addCriterion("JuridicalPersonIDCode =", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeNotEqualTo(String value) {
            addCriterion("JuridicalPersonIDCode <>", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeGreaterThan(String value) {
            addCriterion("JuridicalPersonIDCode >", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeGreaterThanOrEqualTo(String value) {
            addCriterion("JuridicalPersonIDCode >=", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeLessThan(String value) {
            addCriterion("JuridicalPersonIDCode <", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeLessThanOrEqualTo(String value) {
            addCriterion("JuridicalPersonIDCode <=", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeLike(String value) {
            addCriterion("JuridicalPersonIDCode like", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeNotLike(String value) {
            addCriterion("JuridicalPersonIDCode not like", value, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeIn(List<String> values) {
            addCriterion("JuridicalPersonIDCode in", values, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeNotIn(List<String> values) {
            addCriterion("JuridicalPersonIDCode not in", values, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeBetween(String value1, String value2) {
            addCriterion("JuridicalPersonIDCode between", value1, value2, "juridicalpersonidcode");
            return (Criteria) this;
        }

        public Criteria andJuridicalpersonidcodeNotBetween(String value1, String value2) {
            addCriterion("JuridicalPersonIDCode not between", value1, value2, "juridicalpersonidcode");
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

        public Criteria andCreatoruseridIsNull() {
            addCriterion("CreatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIsNotNull() {
            addCriterion("CreatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridEqualTo(Long value) {
            addCriterion("CreatorUserId =", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotEqualTo(Long value) {
            addCriterion("CreatorUserId <>", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridGreaterThan(Long value) {
            addCriterion("CreatorUserId >", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("CreatorUserId >=", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridLessThan(Long value) {
            addCriterion("CreatorUserId <", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridLessThanOrEqualTo(Long value) {
            addCriterion("CreatorUserId <=", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIn(List<Long> values) {
            addCriterion("CreatorUserId in", values, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotIn(List<Long> values) {
            addCriterion("CreatorUserId not in", values, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridBetween(Long value1, Long value2) {
            addCriterion("CreatorUserId between", value1, value2, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotBetween(Long value1, Long value2) {
            addCriterion("CreatorUserId not between", value1, value2, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CreationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("CreationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("CreationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("CreationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("CreationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("CreationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("CreationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("CreationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("CreationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("CreationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridIsNull() {
            addCriterion("LastModifierUserId is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridIsNotNull() {
            addCriterion("LastModifierUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridEqualTo(Long value) {
            addCriterion("LastModifierUserId =", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridNotEqualTo(Long value) {
            addCriterion("LastModifierUserId <>", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridGreaterThan(Long value) {
            addCriterion("LastModifierUserId >", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("LastModifierUserId >=", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridLessThan(Long value) {
            addCriterion("LastModifierUserId <", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridLessThanOrEqualTo(Long value) {
            addCriterion("LastModifierUserId <=", value, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridIn(List<Long> values) {
            addCriterion("LastModifierUserId in", values, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridNotIn(List<Long> values) {
            addCriterion("LastModifierUserId not in", values, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridBetween(Long value1, Long value2) {
            addCriterion("LastModifierUserId between", value1, value2, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruseridNotBetween(Long value1, Long value2) {
            addCriterion("LastModifierUserId not between", value1, value2, "lastmodifieruserid");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIsNull() {
            addCriterion("LastModificationTime is null");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIsNotNull() {
            addCriterion("LastModificationTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeEqualTo(Date value) {
            addCriterion("LastModificationTime =", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotEqualTo(Date value) {
            addCriterion("LastModificationTime <>", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeGreaterThan(Date value) {
            addCriterion("LastModificationTime >", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModificationTime >=", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeLessThan(Date value) {
            addCriterion("LastModificationTime <", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModificationTime <=", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIn(List<Date> values) {
            addCriterion("LastModificationTime in", values, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotIn(List<Date> values) {
            addCriterion("LastModificationTime not in", values, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeBetween(Date value1, Date value2) {
            addCriterion("LastModificationTime between", value1, value2, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModificationTime not between", value1, value2, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridIsNull() {
            addCriterion("DeleterUserId is null");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridIsNotNull() {
            addCriterion("DeleterUserId is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridEqualTo(Long value) {
            addCriterion("DeleterUserId =", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridNotEqualTo(Long value) {
            addCriterion("DeleterUserId <>", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridGreaterThan(Long value) {
            addCriterion("DeleterUserId >", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("DeleterUserId >=", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridLessThan(Long value) {
            addCriterion("DeleterUserId <", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridLessThanOrEqualTo(Long value) {
            addCriterion("DeleterUserId <=", value, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridIn(List<Long> values) {
            addCriterion("DeleterUserId in", values, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridNotIn(List<Long> values) {
            addCriterion("DeleterUserId not in", values, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridBetween(Long value1, Long value2) {
            addCriterion("DeleterUserId between", value1, value2, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeleteruseridNotBetween(Long value1, Long value2) {
            addCriterion("DeleterUserId not between", value1, value2, "deleteruserid");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeIsNull() {
            addCriterion("DeletionTime is null");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeIsNotNull() {
            addCriterion("DeletionTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeEqualTo(Date value) {
            addCriterion("DeletionTime =", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeNotEqualTo(Date value) {
            addCriterion("DeletionTime <>", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeGreaterThan(Date value) {
            addCriterion("DeletionTime >", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeletionTime >=", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeLessThan(Date value) {
            addCriterion("DeletionTime <", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeLessThanOrEqualTo(Date value) {
            addCriterion("DeletionTime <=", value, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeIn(List<Date> values) {
            addCriterion("DeletionTime in", values, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeNotIn(List<Date> values) {
            addCriterion("DeletionTime not in", values, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeBetween(Date value1, Date value2) {
            addCriterion("DeletionTime between", value1, value2, "deletiontime");
            return (Criteria) this;
        }

        public Criteria andDeletiontimeNotBetween(Date value1, Date value2) {
            addCriterion("DeletionTime not between", value1, value2, "deletiontime");
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

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
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