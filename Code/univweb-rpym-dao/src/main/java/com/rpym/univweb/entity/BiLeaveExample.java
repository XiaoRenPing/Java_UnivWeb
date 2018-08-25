package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BiLeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiLeaveExample() {
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

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andApplyuseridIsNull() {
            addCriterion("ApplyUserId is null");
            return (Criteria) this;
        }

        public Criteria andApplyuseridIsNotNull() {
            addCriterion("ApplyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andApplyuseridEqualTo(Long value) {
            addCriterion("ApplyUserId =", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotEqualTo(Long value) {
            addCriterion("ApplyUserId <>", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridGreaterThan(Long value) {
            addCriterion("ApplyUserId >", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("ApplyUserId >=", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridLessThan(Long value) {
            addCriterion("ApplyUserId <", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridLessThanOrEqualTo(Long value) {
            addCriterion("ApplyUserId <=", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridIn(List<Long> values) {
            addCriterion("ApplyUserId in", values, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotIn(List<Long> values) {
            addCriterion("ApplyUserId not in", values, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridBetween(Long value1, Long value2) {
            addCriterion("ApplyUserId between", value1, value2, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotBetween(Long value1, Long value2) {
            addCriterion("ApplyUserId not between", value1, value2, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyusernameIsNull() {
            addCriterion("ApplyUserName is null");
            return (Criteria) this;
        }

        public Criteria andApplyusernameIsNotNull() {
            addCriterion("ApplyUserName is not null");
            return (Criteria) this;
        }

        public Criteria andApplyusernameEqualTo(String value) {
            addCriterion("ApplyUserName =", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotEqualTo(String value) {
            addCriterion("ApplyUserName <>", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameGreaterThan(String value) {
            addCriterion("ApplyUserName >", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyUserName >=", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameLessThan(String value) {
            addCriterion("ApplyUserName <", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameLessThanOrEqualTo(String value) {
            addCriterion("ApplyUserName <=", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameLike(String value) {
            addCriterion("ApplyUserName like", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotLike(String value) {
            addCriterion("ApplyUserName not like", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameIn(List<String> values) {
            addCriterion("ApplyUserName in", values, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotIn(List<String> values) {
            addCriterion("ApplyUserName not in", values, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameBetween(String value1, String value2) {
            addCriterion("ApplyUserName between", value1, value2, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotBetween(String value1, String value2) {
            addCriterion("ApplyUserName not between", value1, value2, "applyusername");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridIsNull() {
            addCriterion("ReceiveUserId is null");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridIsNotNull() {
            addCriterion("ReceiveUserId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridEqualTo(Long value) {
            addCriterion("ReceiveUserId =", value, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridNotEqualTo(Long value) {
            addCriterion("ReceiveUserId <>", value, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridGreaterThan(Long value) {
            addCriterion("ReceiveUserId >", value, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("ReceiveUserId >=", value, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridLessThan(Long value) {
            addCriterion("ReceiveUserId <", value, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridLessThanOrEqualTo(Long value) {
            addCriterion("ReceiveUserId <=", value, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridIn(List<Long> values) {
            addCriterion("ReceiveUserId in", values, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridNotIn(List<Long> values) {
            addCriterion("ReceiveUserId not in", values, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridBetween(Long value1, Long value2) {
            addCriterion("ReceiveUserId between", value1, value2, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveuseridNotBetween(Long value1, Long value2) {
            addCriterion("ReceiveUserId not between", value1, value2, "receiveuserid");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameIsNull() {
            addCriterion("ReceiveUserName is null");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameIsNotNull() {
            addCriterion("ReceiveUserName is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameEqualTo(String value) {
            addCriterion("ReceiveUserName =", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameNotEqualTo(String value) {
            addCriterion("ReceiveUserName <>", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameGreaterThan(String value) {
            addCriterion("ReceiveUserName >", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiveUserName >=", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameLessThan(String value) {
            addCriterion("ReceiveUserName <", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameLessThanOrEqualTo(String value) {
            addCriterion("ReceiveUserName <=", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameLike(String value) {
            addCriterion("ReceiveUserName like", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameNotLike(String value) {
            addCriterion("ReceiveUserName not like", value, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameIn(List<String> values) {
            addCriterion("ReceiveUserName in", values, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameNotIn(List<String> values) {
            addCriterion("ReceiveUserName not in", values, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameBetween(String value1, String value2) {
            addCriterion("ReceiveUserName between", value1, value2, "receiveusername");
            return (Criteria) this;
        }

        public Criteria andReceiveusernameNotBetween(String value1, String value2) {
            addCriterion("ReceiveUserName not between", value1, value2, "receiveusername");
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

        public Criteria andApprovetimeIsNull() {
            addCriterion("ApproveTime is null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNotNull() {
            addCriterion("ApproveTime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeEqualTo(Date value) {
            addCriterion("ApproveTime =", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotEqualTo(Date value) {
            addCriterion("ApproveTime <>", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThan(Date value) {
            addCriterion("ApproveTime >", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApproveTime >=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThan(Date value) {
            addCriterion("ApproveTime <", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThanOrEqualTo(Date value) {
            addCriterion("ApproveTime <=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIn(List<Date> values) {
            addCriterion("ApproveTime in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotIn(List<Date> values) {
            addCriterion("ApproveTime not in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeBetween(Date value1, Date value2) {
            addCriterion("ApproveTime between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotBetween(Date value1, Date value2) {
            addCriterion("ApproveTime not between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("TaskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TaskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("TaskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("TaskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("TaskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("TaskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("TaskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("TaskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("TaskId like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("TaskId not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("TaskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("TaskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("TaskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("TaskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNull() {
            addCriterion("ProcessInstanceId is null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNotNull() {
            addCriterion("ProcessInstanceId is not null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidEqualTo(String value) {
            addCriterion("ProcessInstanceId =", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotEqualTo(String value) {
            addCriterion("ProcessInstanceId <>", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThan(String value) {
            addCriterion("ProcessInstanceId >", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessInstanceId >=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThan(String value) {
            addCriterion("ProcessInstanceId <", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThanOrEqualTo(String value) {
            addCriterion("ProcessInstanceId <=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLike(String value) {
            addCriterion("ProcessInstanceId like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotLike(String value) {
            addCriterion("ProcessInstanceId not like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIn(List<String> values) {
            addCriterion("ProcessInstanceId in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotIn(List<String> values) {
            addCriterion("ProcessInstanceId not in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidBetween(String value1, String value2) {
            addCriterion("ProcessInstanceId between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotBetween(String value1, String value2) {
            addCriterion("ProcessInstanceId not between", value1, value2, "processinstanceid");
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