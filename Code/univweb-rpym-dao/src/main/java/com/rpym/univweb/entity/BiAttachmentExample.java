package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BiAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiAttachmentExample() {
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

        public Criteria andOwnertypeIsNull() {
            addCriterion("OwnerType is null");
            return (Criteria) this;
        }

        public Criteria andOwnertypeIsNotNull() {
            addCriterion("OwnerType is not null");
            return (Criteria) this;
        }

        public Criteria andOwnertypeEqualTo(Long value) {
            addCriterion("OwnerType =", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeNotEqualTo(Long value) {
            addCriterion("OwnerType <>", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeGreaterThan(Long value) {
            addCriterion("OwnerType >", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeGreaterThanOrEqualTo(Long value) {
            addCriterion("OwnerType >=", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeLessThan(Long value) {
            addCriterion("OwnerType <", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeLessThanOrEqualTo(Long value) {
            addCriterion("OwnerType <=", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeIn(List<Long> values) {
            addCriterion("OwnerType in", values, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeNotIn(List<Long> values) {
            addCriterion("OwnerType not in", values, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeBetween(Long value1, Long value2) {
            addCriterion("OwnerType between", value1, value2, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeNotBetween(Long value1, Long value2) {
            addCriterion("OwnerType not between", value1, value2, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("OwnerId is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("OwnerId is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Long value) {
            addCriterion("OwnerId =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Long value) {
            addCriterion("OwnerId <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Long value) {
            addCriterion("OwnerId >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Long value) {
            addCriterion("OwnerId >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Long value) {
            addCriterion("OwnerId <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Long value) {
            addCriterion("OwnerId <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Long> values) {
            addCriterion("OwnerId in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Long> values) {
            addCriterion("OwnerId not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Long value1, Long value2) {
            addCriterion("OwnerId between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Long value1, Long value2) {
            addCriterion("OwnerId not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("Path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("Path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("Path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("Path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("Path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("Path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("Path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("Path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("Path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("Path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("Path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("Path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("Path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("Path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andBussinessidIsNull() {
            addCriterion("BussinessId is null");
            return (Criteria) this;
        }

        public Criteria andBussinessidIsNotNull() {
            addCriterion("BussinessId is not null");
            return (Criteria) this;
        }

        public Criteria andBussinessidEqualTo(String value) {
            addCriterion("BussinessId =", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotEqualTo(String value) {
            addCriterion("BussinessId <>", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidGreaterThan(String value) {
            addCriterion("BussinessId >", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidGreaterThanOrEqualTo(String value) {
            addCriterion("BussinessId >=", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidLessThan(String value) {
            addCriterion("BussinessId <", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidLessThanOrEqualTo(String value) {
            addCriterion("BussinessId <=", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidLike(String value) {
            addCriterion("BussinessId like", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotLike(String value) {
            addCriterion("BussinessId not like", value, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidIn(List<String> values) {
            addCriterion("BussinessId in", values, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotIn(List<String> values) {
            addCriterion("BussinessId not in", values, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidBetween(String value1, String value2) {
            addCriterion("BussinessId between", value1, value2, "bussinessid");
            return (Criteria) this;
        }

        public Criteria andBussinessidNotBetween(String value1, String value2) {
            addCriterion("BussinessId not between", value1, value2, "bussinessid");
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