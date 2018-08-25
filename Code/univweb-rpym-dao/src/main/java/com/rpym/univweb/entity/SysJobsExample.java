package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysJobsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysJobsExample() {
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

        public Criteria andJobnameIsNull() {
            addCriterion("JobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobclassIsNull() {
            addCriterion("JobClass is null");
            return (Criteria) this;
        }

        public Criteria andJobclassIsNotNull() {
            addCriterion("JobClass is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassEqualTo(String value) {
            addCriterion("JobClass =", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotEqualTo(String value) {
            addCriterion("JobClass <>", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassGreaterThan(String value) {
            addCriterion("JobClass >", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassGreaterThanOrEqualTo(String value) {
            addCriterion("JobClass >=", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassLessThan(String value) {
            addCriterion("JobClass <", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassLessThanOrEqualTo(String value) {
            addCriterion("JobClass <=", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassLike(String value) {
            addCriterion("JobClass like", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotLike(String value) {
            addCriterion("JobClass not like", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassIn(List<String> values) {
            addCriterion("JobClass in", values, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotIn(List<String> values) {
            addCriterion("JobClass not in", values, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassBetween(String value1, String value2) {
            addCriterion("JobClass between", value1, value2, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotBetween(String value1, String value2) {
            addCriterion("JobClass not between", value1, value2, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNull() {
            addCriterion("JobDesc is null");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNotNull() {
            addCriterion("JobDesc is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescEqualTo(String value) {
            addCriterion("JobDesc =", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotEqualTo(String value) {
            addCriterion("JobDesc <>", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThan(String value) {
            addCriterion("JobDesc >", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThanOrEqualTo(String value) {
            addCriterion("JobDesc >=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThan(String value) {
            addCriterion("JobDesc <", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThanOrEqualTo(String value) {
            addCriterion("JobDesc <=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLike(String value) {
            addCriterion("JobDesc like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotLike(String value) {
            addCriterion("JobDesc not like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescIn(List<String> values) {
            addCriterion("JobDesc in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotIn(List<String> values) {
            addCriterion("JobDesc not in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescBetween(String value1, String value2) {
            addCriterion("JobDesc between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotBetween(String value1, String value2) {
            addCriterion("JobDesc not between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobargsIsNull() {
            addCriterion("JobArgs is null");
            return (Criteria) this;
        }

        public Criteria andJobargsIsNotNull() {
            addCriterion("JobArgs is not null");
            return (Criteria) this;
        }

        public Criteria andJobargsEqualTo(String value) {
            addCriterion("JobArgs =", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsNotEqualTo(String value) {
            addCriterion("JobArgs <>", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsGreaterThan(String value) {
            addCriterion("JobArgs >", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsGreaterThanOrEqualTo(String value) {
            addCriterion("JobArgs >=", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsLessThan(String value) {
            addCriterion("JobArgs <", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsLessThanOrEqualTo(String value) {
            addCriterion("JobArgs <=", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsLike(String value) {
            addCriterion("JobArgs like", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsNotLike(String value) {
            addCriterion("JobArgs not like", value, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsIn(List<String> values) {
            addCriterion("JobArgs in", values, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsNotIn(List<String> values) {
            addCriterion("JobArgs not in", values, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsBetween(String value1, String value2) {
            addCriterion("JobArgs between", value1, value2, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobargsNotBetween(String value1, String value2) {
            addCriterion("JobArgs not between", value1, value2, "jobargs");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNull() {
            addCriterion("JobStatus is null");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNotNull() {
            addCriterion("JobStatus is not null");
            return (Criteria) this;
        }

        public Criteria andJobstatusEqualTo(String value) {
            addCriterion("JobStatus =", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotEqualTo(String value) {
            addCriterion("JobStatus <>", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThan(String value) {
            addCriterion("JobStatus >", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThanOrEqualTo(String value) {
            addCriterion("JobStatus >=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThan(String value) {
            addCriterion("JobStatus <", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThanOrEqualTo(String value) {
            addCriterion("JobStatus <=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLike(String value) {
            addCriterion("JobStatus like", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotLike(String value) {
            addCriterion("JobStatus not like", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusIn(List<String> values) {
            addCriterion("JobStatus in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotIn(List<String> values) {
            addCriterion("JobStatus not in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusBetween(String value1, String value2) {
            addCriterion("JobStatus between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotBetween(String value1, String value2) {
            addCriterion("JobStatus not between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobcronIsNull() {
            addCriterion("JobCron is null");
            return (Criteria) this;
        }

        public Criteria andJobcronIsNotNull() {
            addCriterion("JobCron is not null");
            return (Criteria) this;
        }

        public Criteria andJobcronEqualTo(String value) {
            addCriterion("JobCron =", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronNotEqualTo(String value) {
            addCriterion("JobCron <>", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronGreaterThan(String value) {
            addCriterion("JobCron >", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronGreaterThanOrEqualTo(String value) {
            addCriterion("JobCron >=", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronLessThan(String value) {
            addCriterion("JobCron <", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronLessThanOrEqualTo(String value) {
            addCriterion("JobCron <=", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronLike(String value) {
            addCriterion("JobCron like", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronNotLike(String value) {
            addCriterion("JobCron not like", value, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronIn(List<String> values) {
            addCriterion("JobCron in", values, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronNotIn(List<String> values) {
            addCriterion("JobCron not in", values, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronBetween(String value1, String value2) {
            addCriterion("JobCron between", value1, value2, "jobcron");
            return (Criteria) this;
        }

        public Criteria andJobcronNotBetween(String value1, String value2) {
            addCriterion("JobCron not between", value1, value2, "jobcron");
            return (Criteria) this;
        }

        public Criteria andNodestatusIsNull() {
            addCriterion("NodeStatus is null");
            return (Criteria) this;
        }

        public Criteria andNodestatusIsNotNull() {
            addCriterion("NodeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNodestatusEqualTo(String value) {
            addCriterion("NodeStatus =", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusNotEqualTo(String value) {
            addCriterion("NodeStatus <>", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusGreaterThan(String value) {
            addCriterion("NodeStatus >", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusGreaterThanOrEqualTo(String value) {
            addCriterion("NodeStatus >=", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusLessThan(String value) {
            addCriterion("NodeStatus <", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusLessThanOrEqualTo(String value) {
            addCriterion("NodeStatus <=", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusLike(String value) {
            addCriterion("NodeStatus like", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusNotLike(String value) {
            addCriterion("NodeStatus not like", value, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusIn(List<String> values) {
            addCriterion("NodeStatus in", values, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusNotIn(List<String> values) {
            addCriterion("NodeStatus not in", values, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusBetween(String value1, String value2) {
            addCriterion("NodeStatus between", value1, value2, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodestatusNotBetween(String value1, String value2) {
            addCriterion("NodeStatus not between", value1, value2, "nodestatus");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNull() {
            addCriterion("NodeIp is null");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNotNull() {
            addCriterion("NodeIp is not null");
            return (Criteria) this;
        }

        public Criteria andNodeipEqualTo(String value) {
            addCriterion("NodeIp =", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotEqualTo(String value) {
            addCriterion("NodeIp <>", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThan(String value) {
            addCriterion("NodeIp >", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThanOrEqualTo(String value) {
            addCriterion("NodeIp >=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThan(String value) {
            addCriterion("NodeIp <", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThanOrEqualTo(String value) {
            addCriterion("NodeIp <=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLike(String value) {
            addCriterion("NodeIp like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotLike(String value) {
            addCriterion("NodeIp not like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipIn(List<String> values) {
            addCriterion("NodeIp in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotIn(List<String> values) {
            addCriterion("NodeIp not in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipBetween(String value1, String value2) {
            addCriterion("NodeIp between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotBetween(String value1, String value2) {
            addCriterion("NodeIp not between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andTrycountIsNull() {
            addCriterion("TryCount is null");
            return (Criteria) this;
        }

        public Criteria andTrycountIsNotNull() {
            addCriterion("TryCount is not null");
            return (Criteria) this;
        }

        public Criteria andTrycountEqualTo(Short value) {
            addCriterion("TryCount =", value, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountNotEqualTo(Short value) {
            addCriterion("TryCount <>", value, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountGreaterThan(Short value) {
            addCriterion("TryCount >", value, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountGreaterThanOrEqualTo(Short value) {
            addCriterion("TryCount >=", value, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountLessThan(Short value) {
            addCriterion("TryCount <", value, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountLessThanOrEqualTo(Short value) {
            addCriterion("TryCount <=", value, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountIn(List<Short> values) {
            addCriterion("TryCount in", values, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountNotIn(List<Short> values) {
            addCriterion("TryCount not in", values, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountBetween(Short value1, Short value2) {
            addCriterion("TryCount between", value1, value2, "trycount");
            return (Criteria) this;
        }

        public Criteria andTrycountNotBetween(Short value1, Short value2) {
            addCriterion("TryCount not between", value1, value2, "trycount");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeIsNull() {
            addCriterion("NextTryTime is null");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeIsNotNull() {
            addCriterion("NextTryTime is not null");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeEqualTo(Date value) {
            addCriterion("NextTryTime =", value, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeNotEqualTo(Date value) {
            addCriterion("NextTryTime <>", value, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeGreaterThan(Date value) {
            addCriterion("NextTryTime >", value, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NextTryTime >=", value, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeLessThan(Date value) {
            addCriterion("NextTryTime <", value, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeLessThanOrEqualTo(Date value) {
            addCriterion("NextTryTime <=", value, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeIn(List<Date> values) {
            addCriterion("NextTryTime in", values, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeNotIn(List<Date> values) {
            addCriterion("NextTryTime not in", values, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeBetween(Date value1, Date value2) {
            addCriterion("NextTryTime between", value1, value2, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andNexttrytimeNotBetween(Date value1, Date value2) {
            addCriterion("NextTryTime not between", value1, value2, "nexttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeIsNull() {
            addCriterion("LastTryTime is null");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeIsNotNull() {
            addCriterion("LastTryTime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeEqualTo(Date value) {
            addCriterion("LastTryTime =", value, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeNotEqualTo(Date value) {
            addCriterion("LastTryTime <>", value, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeGreaterThan(Date value) {
            addCriterion("LastTryTime >", value, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastTryTime >=", value, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeLessThan(Date value) {
            addCriterion("LastTryTime <", value, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeLessThanOrEqualTo(Date value) {
            addCriterion("LastTryTime <=", value, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeIn(List<Date> values) {
            addCriterion("LastTryTime in", values, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeNotIn(List<Date> values) {
            addCriterion("LastTryTime not in", values, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeBetween(Date value1, Date value2) {
            addCriterion("LastTryTime between", value1, value2, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andLasttrytimeNotBetween(Date value1, Date value2) {
            addCriterion("LastTryTime not between", value1, value2, "lasttrytime");
            return (Criteria) this;
        }

        public Criteria andIsabandonedIsNull() {
            addCriterion("IsAbandoned is null");
            return (Criteria) this;
        }

        public Criteria andIsabandonedIsNotNull() {
            addCriterion("IsAbandoned is not null");
            return (Criteria) this;
        }

        public Criteria andIsabandonedEqualTo(Boolean value) {
            addCriterion("IsAbandoned =", value, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedNotEqualTo(Boolean value) {
            addCriterion("IsAbandoned <>", value, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedGreaterThan(Boolean value) {
            addCriterion("IsAbandoned >", value, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsAbandoned >=", value, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedLessThan(Boolean value) {
            addCriterion("IsAbandoned <", value, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsAbandoned <=", value, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedIn(List<Boolean> values) {
            addCriterion("IsAbandoned in", values, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedNotIn(List<Boolean> values) {
            addCriterion("IsAbandoned not in", values, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAbandoned between", value1, value2, "isabandoned");
            return (Criteria) this;
        }

        public Criteria andIsabandonedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAbandoned not between", value1, value2, "isabandoned");
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

        public Criteria andExceptionmessageIsNull() {
            addCriterion("ExceptionMessage is null");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageIsNotNull() {
            addCriterion("ExceptionMessage is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageEqualTo(String value) {
            addCriterion("ExceptionMessage =", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageNotEqualTo(String value) {
            addCriterion("ExceptionMessage <>", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageGreaterThan(String value) {
            addCriterion("ExceptionMessage >", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageGreaterThanOrEqualTo(String value) {
            addCriterion("ExceptionMessage >=", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageLessThan(String value) {
            addCriterion("ExceptionMessage <", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageLessThanOrEqualTo(String value) {
            addCriterion("ExceptionMessage <=", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageLike(String value) {
            addCriterion("ExceptionMessage like", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageNotLike(String value) {
            addCriterion("ExceptionMessage not like", value, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageIn(List<String> values) {
            addCriterion("ExceptionMessage in", values, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageNotIn(List<String> values) {
            addCriterion("ExceptionMessage not in", values, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageBetween(String value1, String value2) {
            addCriterion("ExceptionMessage between", value1, value2, "exceptionmessage");
            return (Criteria) this;
        }

        public Criteria andExceptionmessageNotBetween(String value1, String value2) {
            addCriterion("ExceptionMessage not between", value1, value2, "exceptionmessage");
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