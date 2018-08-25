package com.rpym.univweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BiAuditlogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiAuditlogsExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMethodnameIsNull() {
            addCriterion("MethodName is null");
            return (Criteria) this;
        }

        public Criteria andMethodnameIsNotNull() {
            addCriterion("MethodName is not null");
            return (Criteria) this;
        }

        public Criteria andMethodnameEqualTo(String value) {
            addCriterion("MethodName =", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotEqualTo(String value) {
            addCriterion("MethodName <>", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameGreaterThan(String value) {
            addCriterion("MethodName >", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("MethodName >=", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLessThan(String value) {
            addCriterion("MethodName <", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLessThanOrEqualTo(String value) {
            addCriterion("MethodName <=", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLike(String value) {
            addCriterion("MethodName like", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotLike(String value) {
            addCriterion("MethodName not like", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameIn(List<String> values) {
            addCriterion("MethodName in", values, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotIn(List<String> values) {
            addCriterion("MethodName not in", values, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameBetween(String value1, String value2) {
            addCriterion("MethodName between", value1, value2, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotBetween(String value1, String value2) {
            addCriterion("MethodName not between", value1, value2, "methodname");
            return (Criteria) this;
        }

        public Criteria andParametersIsNull() {
            addCriterion("Parameters is null");
            return (Criteria) this;
        }

        public Criteria andParametersIsNotNull() {
            addCriterion("Parameters is not null");
            return (Criteria) this;
        }

        public Criteria andParametersEqualTo(String value) {
            addCriterion("Parameters =", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotEqualTo(String value) {
            addCriterion("Parameters <>", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersGreaterThan(String value) {
            addCriterion("Parameters >", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersGreaterThanOrEqualTo(String value) {
            addCriterion("Parameters >=", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLessThan(String value) {
            addCriterion("Parameters <", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLessThanOrEqualTo(String value) {
            addCriterion("Parameters <=", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLike(String value) {
            addCriterion("Parameters like", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotLike(String value) {
            addCriterion("Parameters not like", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersIn(List<String> values) {
            addCriterion("Parameters in", values, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotIn(List<String> values) {
            addCriterion("Parameters not in", values, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersBetween(String value1, String value2) {
            addCriterion("Parameters between", value1, value2, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotBetween(String value1, String value2) {
            addCriterion("Parameters not between", value1, value2, "parameters");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeIsNull() {
            addCriterion("ExecutionTime is null");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeIsNotNull() {
            addCriterion("ExecutionTime is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeEqualTo(Date value) {
            addCriterion("ExecutionTime =", value, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeNotEqualTo(Date value) {
            addCriterion("ExecutionTime <>", value, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeGreaterThan(Date value) {
            addCriterion("ExecutionTime >", value, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExecutionTime >=", value, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeLessThan(Date value) {
            addCriterion("ExecutionTime <", value, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeLessThanOrEqualTo(Date value) {
            addCriterion("ExecutionTime <=", value, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeIn(List<Date> values) {
            addCriterion("ExecutionTime in", values, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeNotIn(List<Date> values) {
            addCriterion("ExecutionTime not in", values, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeBetween(Date value1, Date value2) {
            addCriterion("ExecutionTime between", value1, value2, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiontimeNotBetween(Date value1, Date value2) {
            addCriterion("ExecutionTime not between", value1, value2, "executiontime");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationIsNull() {
            addCriterion("ExecutionDuration is null");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationIsNotNull() {
            addCriterion("ExecutionDuration is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationEqualTo(Integer value) {
            addCriterion("ExecutionDuration =", value, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationNotEqualTo(Integer value) {
            addCriterion("ExecutionDuration <>", value, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationGreaterThan(Integer value) {
            addCriterion("ExecutionDuration >", value, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExecutionDuration >=", value, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationLessThan(Integer value) {
            addCriterion("ExecutionDuration <", value, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationLessThanOrEqualTo(Integer value) {
            addCriterion("ExecutionDuration <=", value, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationIn(List<Integer> values) {
            addCriterion("ExecutionDuration in", values, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationNotIn(List<Integer> values) {
            addCriterion("ExecutionDuration not in", values, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationBetween(Integer value1, Integer value2) {
            addCriterion("ExecutionDuration between", value1, value2, "executionduration");
            return (Criteria) this;
        }

        public Criteria andExecutiondurationNotBetween(Integer value1, Integer value2) {
            addCriterion("ExecutionDuration not between", value1, value2, "executionduration");
            return (Criteria) this;
        }

        public Criteria andClientipaddressIsNull() {
            addCriterion("ClientIpAddress is null");
            return (Criteria) this;
        }

        public Criteria andClientipaddressIsNotNull() {
            addCriterion("ClientIpAddress is not null");
            return (Criteria) this;
        }

        public Criteria andClientipaddressEqualTo(String value) {
            addCriterion("ClientIpAddress =", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressNotEqualTo(String value) {
            addCriterion("ClientIpAddress <>", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressGreaterThan(String value) {
            addCriterion("ClientIpAddress >", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ClientIpAddress >=", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressLessThan(String value) {
            addCriterion("ClientIpAddress <", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressLessThanOrEqualTo(String value) {
            addCriterion("ClientIpAddress <=", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressLike(String value) {
            addCriterion("ClientIpAddress like", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressNotLike(String value) {
            addCriterion("ClientIpAddress not like", value, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressIn(List<String> values) {
            addCriterion("ClientIpAddress in", values, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressNotIn(List<String> values) {
            addCriterion("ClientIpAddress not in", values, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressBetween(String value1, String value2) {
            addCriterion("ClientIpAddress between", value1, value2, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientipaddressNotBetween(String value1, String value2) {
            addCriterion("ClientIpAddress not between", value1, value2, "clientipaddress");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("ClientName is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("ClientName is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("ClientName =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("ClientName <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("ClientName >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClientName >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("ClientName <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("ClientName <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("ClientName like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("ClientName not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("ClientName in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("ClientName not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("ClientName between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("ClientName not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("Response is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("Response is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            addCriterion("Response =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            addCriterion("Response <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            addCriterion("Response >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            addCriterion("Response >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            addCriterion("Response <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            addCriterion("Response <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            addCriterion("Response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            addCriterion("Response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(List<String> values) {
            addCriterion("Response in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(List<String> values) {
            addCriterion("Response not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("Response between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("Response not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andApioperationIsNull() {
            addCriterion("ApiOperation is null");
            return (Criteria) this;
        }

        public Criteria andApioperationIsNotNull() {
            addCriterion("ApiOperation is not null");
            return (Criteria) this;
        }

        public Criteria andApioperationEqualTo(String value) {
            addCriterion("ApiOperation =", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationNotEqualTo(String value) {
            addCriterion("ApiOperation <>", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationGreaterThan(String value) {
            addCriterion("ApiOperation >", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationGreaterThanOrEqualTo(String value) {
            addCriterion("ApiOperation >=", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationLessThan(String value) {
            addCriterion("ApiOperation <", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationLessThanOrEqualTo(String value) {
            addCriterion("ApiOperation <=", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationLike(String value) {
            addCriterion("ApiOperation like", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationNotLike(String value) {
            addCriterion("ApiOperation not like", value, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationIn(List<String> values) {
            addCriterion("ApiOperation in", values, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationNotIn(List<String> values) {
            addCriterion("ApiOperation not in", values, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationBetween(String value1, String value2) {
            addCriterion("ApiOperation between", value1, value2, "apioperation");
            return (Criteria) this;
        }

        public Criteria andApioperationNotBetween(String value1, String value2) {
            addCriterion("ApiOperation not between", value1, value2, "apioperation");
            return (Criteria) this;
        }

        public Criteria andUrlidIsNull() {
            addCriterion("UrlId is null");
            return (Criteria) this;
        }

        public Criteria andUrlidIsNotNull() {
            addCriterion("UrlId is not null");
            return (Criteria) this;
        }

        public Criteria andUrlidEqualTo(Long value) {
            addCriterion("UrlId =", value, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidNotEqualTo(Long value) {
            addCriterion("UrlId <>", value, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidGreaterThan(Long value) {
            addCriterion("UrlId >", value, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidGreaterThanOrEqualTo(Long value) {
            addCriterion("UrlId >=", value, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidLessThan(Long value) {
            addCriterion("UrlId <", value, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidLessThanOrEqualTo(Long value) {
            addCriterion("UrlId <=", value, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidIn(List<Long> values) {
            addCriterion("UrlId in", values, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidNotIn(List<Long> values) {
            addCriterion("UrlId not in", values, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidBetween(Long value1, Long value2) {
            addCriterion("UrlId between", value1, value2, "urlid");
            return (Criteria) this;
        }

        public Criteria andUrlidNotBetween(Long value1, Long value2) {
            addCriterion("UrlId not between", value1, value2, "urlid");
            return (Criteria) this;
        }

        public Criteria andUseragentidIsNull() {
            addCriterion("UserAgentId is null");
            return (Criteria) this;
        }

        public Criteria andUseragentidIsNotNull() {
            addCriterion("UserAgentId is not null");
            return (Criteria) this;
        }

        public Criteria andUseragentidEqualTo(Long value) {
            addCriterion("UserAgentId =", value, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidNotEqualTo(Long value) {
            addCriterion("UserAgentId <>", value, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidGreaterThan(Long value) {
            addCriterion("UserAgentId >", value, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidGreaterThanOrEqualTo(Long value) {
            addCriterion("UserAgentId >=", value, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidLessThan(Long value) {
            addCriterion("UserAgentId <", value, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidLessThanOrEqualTo(Long value) {
            addCriterion("UserAgentId <=", value, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidIn(List<Long> values) {
            addCriterion("UserAgentId in", values, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidNotIn(List<Long> values) {
            addCriterion("UserAgentId not in", values, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidBetween(Long value1, Long value2) {
            addCriterion("UserAgentId between", value1, value2, "useragentid");
            return (Criteria) this;
        }

        public Criteria andUseragentidNotBetween(Long value1, Long value2) {
            addCriterion("UserAgentId not between", value1, value2, "useragentid");
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