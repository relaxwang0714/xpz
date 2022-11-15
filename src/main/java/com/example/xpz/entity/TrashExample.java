package com.example.xpz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrashExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrashExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andWushuiIsNull() {
            addCriterion("wushui is null");
            return (Criteria) this;
        }

        public Criteria andWushuiIsNotNull() {
            addCriterion("wushui is not null");
            return (Criteria) this;
        }

        public Criteria andWushuiEqualTo(Integer value) {
            addCriterion("wushui =", value, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiNotEqualTo(Integer value) {
            addCriterion("wushui <>", value, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiGreaterThan(Integer value) {
            addCriterion("wushui >", value, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiGreaterThanOrEqualTo(Integer value) {
            addCriterion("wushui >=", value, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiLessThan(Integer value) {
            addCriterion("wushui <", value, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiLessThanOrEqualTo(Integer value) {
            addCriterion("wushui <=", value, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiIn(List<Integer> values) {
            addCriterion("wushui in", values, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiNotIn(List<Integer> values) {
            addCriterion("wushui not in", values, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiBetween(Integer value1, Integer value2) {
            addCriterion("wushui between", value1, value2, "wushui");
            return (Criteria) this;
        }

        public Criteria andWushuiNotBetween(Integer value1, Integer value2) {
            addCriterion("wushui not between", value1, value2, "wushui");
            return (Criteria) this;
        }

        public Criteria andLajiIsNull() {
            addCriterion("laji is null");
            return (Criteria) this;
        }

        public Criteria andLajiIsNotNull() {
            addCriterion("laji is not null");
            return (Criteria) this;
        }

        public Criteria andLajiEqualTo(Integer value) {
            addCriterion("laji =", value, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiNotEqualTo(Integer value) {
            addCriterion("laji <>", value, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiGreaterThan(Integer value) {
            addCriterion("laji >", value, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiGreaterThanOrEqualTo(Integer value) {
            addCriterion("laji >=", value, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiLessThan(Integer value) {
            addCriterion("laji <", value, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiLessThanOrEqualTo(Integer value) {
            addCriterion("laji <=", value, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiIn(List<Integer> values) {
            addCriterion("laji in", values, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiNotIn(List<Integer> values) {
            addCriterion("laji not in", values, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiBetween(Integer value1, Integer value2) {
            addCriterion("laji between", value1, value2, "laji");
            return (Criteria) this;
        }

        public Criteria andLajiNotBetween(Integer value1, Integer value2) {
            addCriterion("laji not between", value1, value2, "laji");
            return (Criteria) this;
        }

        public Criteria andWushuiRateIsNull() {
            addCriterion("wushui_rate is null");
            return (Criteria) this;
        }

        public Criteria andWushuiRateIsNotNull() {
            addCriterion("wushui_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWushuiRateEqualTo(Integer value) {
            addCriterion("wushui_rate =", value, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateNotEqualTo(Integer value) {
            addCriterion("wushui_rate <>", value, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateGreaterThan(Integer value) {
            addCriterion("wushui_rate >", value, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("wushui_rate >=", value, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateLessThan(Integer value) {
            addCriterion("wushui_rate <", value, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateLessThanOrEqualTo(Integer value) {
            addCriterion("wushui_rate <=", value, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateIn(List<Integer> values) {
            addCriterion("wushui_rate in", values, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateNotIn(List<Integer> values) {
            addCriterion("wushui_rate not in", values, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateBetween(Integer value1, Integer value2) {
            addCriterion("wushui_rate between", value1, value2, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andWushuiRateNotBetween(Integer value1, Integer value2) {
            addCriterion("wushui_rate not between", value1, value2, "wushuiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateIsNull() {
            addCriterion("laji_rate is null");
            return (Criteria) this;
        }

        public Criteria andLajiRateIsNotNull() {
            addCriterion("laji_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLajiRateEqualTo(Integer value) {
            addCriterion("laji_rate =", value, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateNotEqualTo(Integer value) {
            addCriterion("laji_rate <>", value, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateGreaterThan(Integer value) {
            addCriterion("laji_rate >", value, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("laji_rate >=", value, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateLessThan(Integer value) {
            addCriterion("laji_rate <", value, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateLessThanOrEqualTo(Integer value) {
            addCriterion("laji_rate <=", value, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateIn(List<Integer> values) {
            addCriterion("laji_rate in", values, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateNotIn(List<Integer> values) {
            addCriterion("laji_rate not in", values, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateBetween(Integer value1, Integer value2) {
            addCriterion("laji_rate between", value1, value2, "lajiRate");
            return (Criteria) this;
        }

        public Criteria andLajiRateNotBetween(Integer value1, Integer value2) {
            addCriterion("laji_rate not between", value1, value2, "lajiRate");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
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