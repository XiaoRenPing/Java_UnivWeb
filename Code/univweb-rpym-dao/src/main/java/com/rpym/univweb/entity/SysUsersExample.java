package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsersExample() {
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

        public Criteria andEnterpriseidIsNull() {
            addCriterion("EnterpriseId is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidIsNotNull() {
            addCriterion("EnterpriseId is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidEqualTo(Integer value) {
            addCriterion("EnterpriseId =", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotEqualTo(Integer value) {
            addCriterion("EnterpriseId <>", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidGreaterThan(Integer value) {
            addCriterion("EnterpriseId >", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EnterpriseId >=", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidLessThan(Integer value) {
            addCriterion("EnterpriseId <", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidLessThanOrEqualTo(Integer value) {
            addCriterion("EnterpriseId <=", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidIn(List<Integer> values) {
            addCriterion("EnterpriseId in", values, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotIn(List<Integer> values) {
            addCriterion("EnterpriseId not in", values, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidBetween(Integer value1, Integer value2) {
            addCriterion("EnterpriseId between", value1, value2, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotBetween(Integer value1, Integer value2) {
            addCriterion("EnterpriseId not between", value1, value2, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TenantId is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TenantId is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Integer value) {
            addCriterion("TenantId =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Integer value) {
            addCriterion("TenantId <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Integer value) {
            addCriterion("TenantId >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenantId >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Integer value) {
            addCriterion("TenantId <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Integer value) {
            addCriterion("TenantId <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Integer> values) {
            addCriterion("TenantId in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Integer> values) {
            addCriterion("TenantId not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Integer value1, Integer value2) {
            addCriterion("TenantId between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Integer value1, Integer value2) {
            addCriterion("TenantId not between", value1, value2, "tenantid");
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

        public Criteria andSurnameIsNull() {
            addCriterion("Surname is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNotNull() {
            addCriterion("Surname is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEqualTo(String value) {
            addCriterion("Surname =", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotEqualTo(String value) {
            addCriterion("Surname <>", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThan(String value) {
            addCriterion("Surname >", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("Surname >=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThan(String value) {
            addCriterion("Surname <", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThanOrEqualTo(String value) {
            addCriterion("Surname <=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLike(String value) {
            addCriterion("Surname like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotLike(String value) {
            addCriterion("Surname not like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameIn(List<String> values) {
            addCriterion("Surname in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotIn(List<String> values) {
            addCriterion("Surname not in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameBetween(String value1, String value2) {
            addCriterion("Surname between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotBetween(String value1, String value2) {
            addCriterion("Surname not between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNull() {
            addCriterion("EmailAddress is null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNotNull() {
            addCriterion("EmailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressEqualTo(String value) {
            addCriterion("EmailAddress =", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotEqualTo(String value) {
            addCriterion("EmailAddress <>", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThan(String value) {
            addCriterion("EmailAddress >", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("EmailAddress >=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThan(String value) {
            addCriterion("EmailAddress <", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThanOrEqualTo(String value) {
            addCriterion("EmailAddress <=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLike(String value) {
            addCriterion("EmailAddress like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotLike(String value) {
            addCriterion("EmailAddress not like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIn(List<String> values) {
            addCriterion("EmailAddress in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotIn(List<String> values) {
            addCriterion("EmailAddress not in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressBetween(String value1, String value2) {
            addCriterion("EmailAddress between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotBetween(String value1, String value2) {
            addCriterion("EmailAddress not between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedIsNull() {
            addCriterion("IsEmailConfirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedIsNotNull() {
            addCriterion("IsEmailConfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedEqualTo(Boolean value) {
            addCriterion("IsEmailConfirmed =", value, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedNotEqualTo(Boolean value) {
            addCriterion("IsEmailConfirmed <>", value, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedGreaterThan(Boolean value) {
            addCriterion("IsEmailConfirmed >", value, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsEmailConfirmed >=", value, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedLessThan(Boolean value) {
            addCriterion("IsEmailConfirmed <", value, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsEmailConfirmed <=", value, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedIn(List<Boolean> values) {
            addCriterion("IsEmailConfirmed in", values, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedNotIn(List<Boolean> values) {
            addCriterion("IsEmailConfirmed not in", values, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEmailConfirmed between", value1, value2, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsemailconfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEmailConfirmed not between", value1, value2, "isemailconfirmed");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeIsNull() {
            addCriterion("EmailConfirmationCode is null");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeIsNotNull() {
            addCriterion("EmailConfirmationCode is not null");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeEqualTo(String value) {
            addCriterion("EmailConfirmationCode =", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeNotEqualTo(String value) {
            addCriterion("EmailConfirmationCode <>", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeGreaterThan(String value) {
            addCriterion("EmailConfirmationCode >", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EmailConfirmationCode >=", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeLessThan(String value) {
            addCriterion("EmailConfirmationCode <", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeLessThanOrEqualTo(String value) {
            addCriterion("EmailConfirmationCode <=", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeLike(String value) {
            addCriterion("EmailConfirmationCode like", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeNotLike(String value) {
            addCriterion("EmailConfirmationCode not like", value, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeIn(List<String> values) {
            addCriterion("EmailConfirmationCode in", values, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeNotIn(List<String> values) {
            addCriterion("EmailConfirmationCode not in", values, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeBetween(String value1, String value2) {
            addCriterion("EmailConfirmationCode between", value1, value2, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andEmailconfirmationcodeNotBetween(String value1, String value2) {
            addCriterion("EmailConfirmationCode not between", value1, value2, "emailconfirmationcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeIsNull() {
            addCriterion("PasswordResetCode is null");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeIsNotNull() {
            addCriterion("PasswordResetCode is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeEqualTo(String value) {
            addCriterion("PasswordResetCode =", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeNotEqualTo(String value) {
            addCriterion("PasswordResetCode <>", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeGreaterThan(String value) {
            addCriterion("PasswordResetCode >", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordResetCode >=", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeLessThan(String value) {
            addCriterion("PasswordResetCode <", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeLessThanOrEqualTo(String value) {
            addCriterion("PasswordResetCode <=", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeLike(String value) {
            addCriterion("PasswordResetCode like", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeNotLike(String value) {
            addCriterion("PasswordResetCode not like", value, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeIn(List<String> values) {
            addCriterion("PasswordResetCode in", values, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeNotIn(List<String> values) {
            addCriterion("PasswordResetCode not in", values, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeBetween(String value1, String value2) {
            addCriterion("PasswordResetCode between", value1, value2, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andPasswordresetcodeNotBetween(String value1, String value2) {
            addCriterion("PasswordResetCode not between", value1, value2, "passwordresetcode");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("LastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("LastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("LastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("LastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("LastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("LastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime not between", value1, value2, "lastlogintime");
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

        public Criteria andIsactiveIsNull() {
            addCriterion("IsActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("IsActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Boolean value) {
            addCriterion("IsActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Boolean value) {
            addCriterion("IsActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Boolean value) {
            addCriterion("IsActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Boolean value) {
            addCriterion("IsActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Boolean value) {
            addCriterion("IsActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Boolean> values) {
            addCriterion("IsActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Boolean> values) {
            addCriterion("IsActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Boolean value1, Boolean value2) {
            addCriterion("IsActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsActive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginIsNull() {
            addCriterion("ShouldChangePasswordOnNextLogin is null");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginIsNotNull() {
            addCriterion("ShouldChangePasswordOnNextLogin is not null");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginEqualTo(Boolean value) {
            addCriterion("ShouldChangePasswordOnNextLogin =", value, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginNotEqualTo(Boolean value) {
            addCriterion("ShouldChangePasswordOnNextLogin <>", value, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginGreaterThan(Boolean value) {
            addCriterion("ShouldChangePasswordOnNextLogin >", value, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ShouldChangePasswordOnNextLogin >=", value, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginLessThan(Boolean value) {
            addCriterion("ShouldChangePasswordOnNextLogin <", value, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginLessThanOrEqualTo(Boolean value) {
            addCriterion("ShouldChangePasswordOnNextLogin <=", value, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginIn(List<Boolean> values) {
            addCriterion("ShouldChangePasswordOnNextLogin in", values, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginNotIn(List<Boolean> values) {
            addCriterion("ShouldChangePasswordOnNextLogin not in", values, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginBetween(Boolean value1, Boolean value2) {
            addCriterion("ShouldChangePasswordOnNextLogin between", value1, value2, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andShouldchangepasswordonnextloginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ShouldChangePasswordOnNextLogin not between", value1, value2, "shouldchangepasswordonnextlogin");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidIsNull() {
            addCriterion("ProfilePictureId is null");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidIsNotNull() {
            addCriterion("ProfilePictureId is not null");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidEqualTo(String value) {
            addCriterion("ProfilePictureId =", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidNotEqualTo(String value) {
            addCriterion("ProfilePictureId <>", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidGreaterThan(String value) {
            addCriterion("ProfilePictureId >", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidGreaterThanOrEqualTo(String value) {
            addCriterion("ProfilePictureId >=", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidLessThan(String value) {
            addCriterion("ProfilePictureId <", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidLessThanOrEqualTo(String value) {
            addCriterion("ProfilePictureId <=", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidLike(String value) {
            addCriterion("ProfilePictureId like", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidNotLike(String value) {
            addCriterion("ProfilePictureId not like", value, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidIn(List<String> values) {
            addCriterion("ProfilePictureId in", values, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidNotIn(List<String> values) {
            addCriterion("ProfilePictureId not in", values, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidBetween(String value1, String value2) {
            addCriterion("ProfilePictureId between", value1, value2, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andProfilepictureidNotBetween(String value1, String value2) {
            addCriterion("ProfilePictureId not between", value1, value2, "profilepictureid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceIsNull() {
            addCriterion("AuthenticationSource is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceIsNotNull() {
            addCriterion("AuthenticationSource is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceEqualTo(String value) {
            addCriterion("AuthenticationSource =", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceNotEqualTo(String value) {
            addCriterion("AuthenticationSource <>", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceGreaterThan(String value) {
            addCriterion("AuthenticationSource >", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceGreaterThanOrEqualTo(String value) {
            addCriterion("AuthenticationSource >=", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceLessThan(String value) {
            addCriterion("AuthenticationSource <", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceLessThanOrEqualTo(String value) {
            addCriterion("AuthenticationSource <=", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceLike(String value) {
            addCriterion("AuthenticationSource like", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceNotLike(String value) {
            addCriterion("AuthenticationSource not like", value, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceIn(List<String> values) {
            addCriterion("AuthenticationSource in", values, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceNotIn(List<String> values) {
            addCriterion("AuthenticationSource not in", values, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceBetween(String value1, String value2) {
            addCriterion("AuthenticationSource between", value1, value2, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andAuthenticationsourceNotBetween(String value1, String value2) {
            addCriterion("AuthenticationSource not between", value1, value2, "authenticationsource");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcIsNull() {
            addCriterion("LockoutEndDateUtc is null");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcIsNotNull() {
            addCriterion("LockoutEndDateUtc is not null");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcEqualTo(Date value) {
            addCriterion("LockoutEndDateUtc =", value, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcNotEqualTo(Date value) {
            addCriterion("LockoutEndDateUtc <>", value, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcGreaterThan(Date value) {
            addCriterion("LockoutEndDateUtc >", value, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcGreaterThanOrEqualTo(Date value) {
            addCriterion("LockoutEndDateUtc >=", value, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcLessThan(Date value) {
            addCriterion("LockoutEndDateUtc <", value, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcLessThanOrEqualTo(Date value) {
            addCriterion("LockoutEndDateUtc <=", value, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcIn(List<Date> values) {
            addCriterion("LockoutEndDateUtc in", values, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcNotIn(List<Date> values) {
            addCriterion("LockoutEndDateUtc not in", values, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcBetween(Date value1, Date value2) {
            addCriterion("LockoutEndDateUtc between", value1, value2, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andLockoutenddateutcNotBetween(Date value1, Date value2) {
            addCriterion("LockoutEndDateUtc not between", value1, value2, "lockoutenddateutc");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountIsNull() {
            addCriterion("AccessFailedCount is null");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountIsNotNull() {
            addCriterion("AccessFailedCount is not null");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountEqualTo(Integer value) {
            addCriterion("AccessFailedCount =", value, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountNotEqualTo(Integer value) {
            addCriterion("AccessFailedCount <>", value, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountGreaterThan(Integer value) {
            addCriterion("AccessFailedCount >", value, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessFailedCount >=", value, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountLessThan(Integer value) {
            addCriterion("AccessFailedCount <", value, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountLessThanOrEqualTo(Integer value) {
            addCriterion("AccessFailedCount <=", value, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountIn(List<Integer> values) {
            addCriterion("AccessFailedCount in", values, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountNotIn(List<Integer> values) {
            addCriterion("AccessFailedCount not in", values, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountBetween(Integer value1, Integer value2) {
            addCriterion("AccessFailedCount between", value1, value2, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andAccessfailedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessFailedCount not between", value1, value2, "accessfailedcount");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledIsNull() {
            addCriterion("IsLockoutEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledIsNotNull() {
            addCriterion("IsLockoutEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledEqualTo(Boolean value) {
            addCriterion("IsLockoutEnabled =", value, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledNotEqualTo(Boolean value) {
            addCriterion("IsLockoutEnabled <>", value, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledGreaterThan(Boolean value) {
            addCriterion("IsLockoutEnabled >", value, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsLockoutEnabled >=", value, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledLessThan(Boolean value) {
            addCriterion("IsLockoutEnabled <", value, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("IsLockoutEnabled <=", value, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledIn(List<Boolean> values) {
            addCriterion("IsLockoutEnabled in", values, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledNotIn(List<Boolean> values) {
            addCriterion("IsLockoutEnabled not in", values, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLockoutEnabled between", value1, value2, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andIslockoutenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLockoutEnabled not between", value1, value2, "islockoutenabled");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MobileNumber is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MobileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MobileNumber =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MobileNumber <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MobileNumber >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MobileNumber >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MobileNumber <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MobileNumber <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MobileNumber like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MobileNumber not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MobileNumber in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MobileNumber not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MobileNumber between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MobileNumber not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("PhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("PhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("PhoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("PhoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("PhoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("PhoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("PhoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("PhoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("PhoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("PhoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("PhoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("PhoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("PhoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("PhoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedIsNull() {
            addCriterion("IsPhoneNumberConfirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedIsNotNull() {
            addCriterion("IsPhoneNumberConfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedEqualTo(Boolean value) {
            addCriterion("IsPhoneNumberConfirmed =", value, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedNotEqualTo(Boolean value) {
            addCriterion("IsPhoneNumberConfirmed <>", value, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedGreaterThan(Boolean value) {
            addCriterion("IsPhoneNumberConfirmed >", value, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsPhoneNumberConfirmed >=", value, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedLessThan(Boolean value) {
            addCriterion("IsPhoneNumberConfirmed <", value, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsPhoneNumberConfirmed <=", value, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedIn(List<Boolean> values) {
            addCriterion("IsPhoneNumberConfirmed in", values, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedNotIn(List<Boolean> values) {
            addCriterion("IsPhoneNumberConfirmed not in", values, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsPhoneNumberConfirmed between", value1, value2, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsphonenumberconfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsPhoneNumberConfirmed not between", value1, value2, "isphonenumberconfirmed");
            return (Criteria) this;
        }

        public Criteria andSecuritystampIsNull() {
            addCriterion("SecurityStamp is null");
            return (Criteria) this;
        }

        public Criteria andSecuritystampIsNotNull() {
            addCriterion("SecurityStamp is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritystampEqualTo(String value) {
            addCriterion("SecurityStamp =", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampNotEqualTo(String value) {
            addCriterion("SecurityStamp <>", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampGreaterThan(String value) {
            addCriterion("SecurityStamp >", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampGreaterThanOrEqualTo(String value) {
            addCriterion("SecurityStamp >=", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampLessThan(String value) {
            addCriterion("SecurityStamp <", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampLessThanOrEqualTo(String value) {
            addCriterion("SecurityStamp <=", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampLike(String value) {
            addCriterion("SecurityStamp like", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampNotLike(String value) {
            addCriterion("SecurityStamp not like", value, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampIn(List<String> values) {
            addCriterion("SecurityStamp in", values, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampNotIn(List<String> values) {
            addCriterion("SecurityStamp not in", values, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampBetween(String value1, String value2) {
            addCriterion("SecurityStamp between", value1, value2, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andSecuritystampNotBetween(String value1, String value2) {
            addCriterion("SecurityStamp not between", value1, value2, "securitystamp");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledIsNull() {
            addCriterion("IsTwoFactorEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledIsNotNull() {
            addCriterion("IsTwoFactorEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledEqualTo(Boolean value) {
            addCriterion("IsTwoFactorEnabled =", value, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledNotEqualTo(Boolean value) {
            addCriterion("IsTwoFactorEnabled <>", value, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledGreaterThan(Boolean value) {
            addCriterion("IsTwoFactorEnabled >", value, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsTwoFactorEnabled >=", value, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledLessThan(Boolean value) {
            addCriterion("IsTwoFactorEnabled <", value, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("IsTwoFactorEnabled <=", value, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledIn(List<Boolean> values) {
            addCriterion("IsTwoFactorEnabled in", values, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledNotIn(List<Boolean> values) {
            addCriterion("IsTwoFactorEnabled not in", values, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("IsTwoFactorEnabled between", value1, value2, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andIstwofactorenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsTwoFactorEnabled not between", value1, value2, "istwofactorenabled");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("ClientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("ClientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("ClientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("ClientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("ClientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("ClientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("ClientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("ClientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("ClientId like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("ClientId not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("ClientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("ClientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("ClientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("ClientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientsecretIsNull() {
            addCriterion("ClientSecret is null");
            return (Criteria) this;
        }

        public Criteria andClientsecretIsNotNull() {
            addCriterion("ClientSecret is not null");
            return (Criteria) this;
        }

        public Criteria andClientsecretEqualTo(String value) {
            addCriterion("ClientSecret =", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotEqualTo(String value) {
            addCriterion("ClientSecret <>", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretGreaterThan(String value) {
            addCriterion("ClientSecret >", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretGreaterThanOrEqualTo(String value) {
            addCriterion("ClientSecret >=", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretLessThan(String value) {
            addCriterion("ClientSecret <", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretLessThanOrEqualTo(String value) {
            addCriterion("ClientSecret <=", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretLike(String value) {
            addCriterion("ClientSecret like", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotLike(String value) {
            addCriterion("ClientSecret not like", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretIn(List<String> values) {
            addCriterion("ClientSecret in", values, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotIn(List<String> values) {
            addCriterion("ClientSecret not in", values, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretBetween(String value1, String value2) {
            addCriterion("ClientSecret between", value1, value2, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotBetween(String value1, String value2) {
            addCriterion("ClientSecret not between", value1, value2, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberIsNull() {
            addCriterion("IdCardNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberIsNotNull() {
            addCriterion("IdCardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberEqualTo(String value) {
            addCriterion("IdCardNumber =", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotEqualTo(String value) {
            addCriterion("IdCardNumber <>", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberGreaterThan(String value) {
            addCriterion("IdCardNumber >", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IdCardNumber >=", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberLessThan(String value) {
            addCriterion("IdCardNumber <", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberLessThanOrEqualTo(String value) {
            addCriterion("IdCardNumber <=", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberLike(String value) {
            addCriterion("IdCardNumber like", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotLike(String value) {
            addCriterion("IdCardNumber not like", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberIn(List<String> values) {
            addCriterion("IdCardNumber in", values, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotIn(List<String> values) {
            addCriterion("IdCardNumber not in", values, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberBetween(String value1, String value2) {
            addCriterion("IdCardNumber between", value1, value2, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotBetween(String value1, String value2) {
            addCriterion("IdCardNumber not between", value1, value2, "idcardnumber");
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