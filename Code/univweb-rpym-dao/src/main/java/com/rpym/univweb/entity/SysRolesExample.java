package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRolesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRolesExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andDisplaynameIsNull() {
            addCriterion("DisplayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("DisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("DisplayName =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("DisplayName <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("DisplayName >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayName >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("DisplayName <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("DisplayName <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("DisplayName like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("DisplayName not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("DisplayName in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("DisplayName not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("DisplayName between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("DisplayName not between", value1, value2, "displayname");
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

        public Criteria andIsstaticIsNull() {
            addCriterion("IsStatic is null");
            return (Criteria) this;
        }

        public Criteria andIsstaticIsNotNull() {
            addCriterion("IsStatic is not null");
            return (Criteria) this;
        }

        public Criteria andIsstaticEqualTo(Boolean value) {
            addCriterion("IsStatic =", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotEqualTo(Boolean value) {
            addCriterion("IsStatic <>", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticGreaterThan(Boolean value) {
            addCriterion("IsStatic >", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsStatic >=", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticLessThan(Boolean value) {
            addCriterion("IsStatic <", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticLessThanOrEqualTo(Boolean value) {
            addCriterion("IsStatic <=", value, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticIn(List<Boolean> values) {
            addCriterion("IsStatic in", values, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotIn(List<Boolean> values) {
            addCriterion("IsStatic not in", values, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticBetween(Boolean value1, Boolean value2) {
            addCriterion("IsStatic between", value1, value2, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsstaticNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsStatic not between", value1, value2, "isstatic");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("IsDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("IsDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Boolean value) {
            addCriterion("IsDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Boolean value) {
            addCriterion("IsDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Boolean value) {
            addCriterion("IsDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Boolean value) {
            addCriterion("IsDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Boolean> values) {
            addCriterion("IsDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Boolean> values) {
            addCriterion("IsDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault not between", value1, value2, "isdefault");
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