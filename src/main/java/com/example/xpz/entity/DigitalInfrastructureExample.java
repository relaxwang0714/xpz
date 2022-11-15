package com.example.xpz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalInfrastructureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DigitalInfrastructureExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Integer value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Integer value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Integer value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Integer value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Integer value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Integer> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Integer> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Integer value1, Integer value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andfourgCoverIsNull() {
            addCriterion("fourg_cover is null");
            return (Criteria) this;
        }

        public Criteria andfourgCoverIsNotNull() {
            addCriterion("fourg_cover is not null");
            return (Criteria) this;
        }

        public Criteria andfourgCoverEqualTo(Integer value) {
            addCriterion("fourg_cover =", value, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverNotEqualTo(Integer value) {
            addCriterion("fourg_cover <>", value, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverGreaterThan(Integer value) {
            addCriterion("fourg_cover >", value, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourg_cover >=", value, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverLessThan(Integer value) {
            addCriterion("fourg_cover <", value, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverLessThanOrEqualTo(Integer value) {
            addCriterion("fourg_cover <=", value, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverIn(List<Integer> values) {
            addCriterion("fourg_cover in", values, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverNotIn(List<Integer> values) {
            addCriterion("fourg_cover not in", values, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverBetween(Integer value1, Integer value2) {
            addCriterion("fourg_cover between", value1, value2, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andfourgCoverNotBetween(Integer value1, Integer value2) {
            addCriterion("fourg_cover not between", value1, value2, "fourgCover");
            return (Criteria) this;
        }

        public Criteria andBaseStationIsNull() {
            addCriterion("base_station is null");
            return (Criteria) this;
        }

        public Criteria andBaseStationIsNotNull() {
            addCriterion("base_station is not null");
            return (Criteria) this;
        }

        public Criteria andBaseStationEqualTo(Integer value) {
            addCriterion("base_station =", value, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationNotEqualTo(Integer value) {
            addCriterion("base_station <>", value, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationGreaterThan(Integer value) {
            addCriterion("base_station >", value, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_station >=", value, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationLessThan(Integer value) {
            addCriterion("base_station <", value, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationLessThanOrEqualTo(Integer value) {
            addCriterion("base_station <=", value, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationIn(List<Integer> values) {
            addCriterion("base_station in", values, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationNotIn(List<Integer> values) {
            addCriterion("base_station not in", values, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationBetween(Integer value1, Integer value2) {
            addCriterion("base_station between", value1, value2, "baseStation");
            return (Criteria) this;
        }

        public Criteria andBaseStationNotBetween(Integer value1, Integer value2) {
            addCriterion("base_station not between", value1, value2, "baseStation");
            return (Criteria) this;
        }

        public Criteria andInternetRateIsNull() {
            addCriterion("internet_rate is null");
            return (Criteria) this;
        }

        public Criteria andInternetRateIsNotNull() {
            addCriterion("internet_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInternetRateEqualTo(Integer value) {
            addCriterion("internet_rate =", value, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateNotEqualTo(Integer value) {
            addCriterion("internet_rate <>", value, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateGreaterThan(Integer value) {
            addCriterion("internet_rate >", value, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("internet_rate >=", value, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateLessThan(Integer value) {
            addCriterion("internet_rate <", value, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateLessThanOrEqualTo(Integer value) {
            addCriterion("internet_rate <=", value, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateIn(List<Integer> values) {
            addCriterion("internet_rate in", values, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateNotIn(List<Integer> values) {
            addCriterion("internet_rate not in", values, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateBetween(Integer value1, Integer value2) {
            addCriterion("internet_rate between", value1, value2, "internetRate");
            return (Criteria) this;
        }

        public Criteria andInternetRateNotBetween(Integer value1, Integer value2) {
            addCriterion("internet_rate not between", value1, value2, "internetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateIsNull() {
            addCriterion("hundred_internet_rate is null");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateIsNotNull() {
            addCriterion("hundred_internet_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateEqualTo(Integer value) {
            addCriterion("hundred_internet_rate =", value, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateNotEqualTo(Integer value) {
            addCriterion("hundred_internet_rate <>", value, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateGreaterThan(Integer value) {
            addCriterion("hundred_internet_rate >", value, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hundred_internet_rate >=", value, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateLessThan(Integer value) {
            addCriterion("hundred_internet_rate <", value, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateLessThanOrEqualTo(Integer value) {
            addCriterion("hundred_internet_rate <=", value, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateIn(List<Integer> values) {
            addCriterion("hundred_internet_rate in", values, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateNotIn(List<Integer> values) {
            addCriterion("hundred_internet_rate not in", values, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateBetween(Integer value1, Integer value2) {
            addCriterion("hundred_internet_rate between", value1, value2, "hundredInternetRate");
            return (Criteria) this;
        }

        public Criteria andHundredInternetRateNotBetween(Integer value1, Integer value2) {
            addCriterion("hundred_internet_rate not between", value1, value2, "hundredInternetRate");
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