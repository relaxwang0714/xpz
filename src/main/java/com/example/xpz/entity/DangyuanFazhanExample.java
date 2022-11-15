package com.example.xpz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangyuanFazhanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DangyuanFazhanExample() {
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

        public Criteria andInPartyIsNull() {
            addCriterion("in_party is null");
            return (Criteria) this;
        }

        public Criteria andInPartyIsNotNull() {
            addCriterion("in_party is not null");
            return (Criteria) this;
        }

        public Criteria andInPartyEqualTo(Integer value) {
            addCriterion("in_party =", value, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyNotEqualTo(Integer value) {
            addCriterion("in_party <>", value, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyGreaterThan(Integer value) {
            addCriterion("in_party >", value, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_party >=", value, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyLessThan(Integer value) {
            addCriterion("in_party <", value, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyLessThanOrEqualTo(Integer value) {
            addCriterion("in_party <=", value, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyIn(List<Integer> values) {
            addCriterion("in_party in", values, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyNotIn(List<Integer> values) {
            addCriterion("in_party not in", values, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyBetween(Integer value1, Integer value2) {
            addCriterion("in_party between", value1, value2, "inParty");
            return (Criteria) this;
        }

        public Criteria andInPartyNotBetween(Integer value1, Integer value2) {
            addCriterion("in_party not between", value1, value2, "inParty");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleIsNull() {
            addCriterion("jiji_people is null");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleIsNotNull() {
            addCriterion("jiji_people is not null");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleEqualTo(Integer value) {
            addCriterion("jiji_people =", value, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleNotEqualTo(Integer value) {
            addCriterion("jiji_people <>", value, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleGreaterThan(Integer value) {
            addCriterion("jiji_people >", value, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiji_people >=", value, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleLessThan(Integer value) {
            addCriterion("jiji_people <", value, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("jiji_people <=", value, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleIn(List<Integer> values) {
            addCriterion("jiji_people in", values, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleNotIn(List<Integer> values) {
            addCriterion("jiji_people not in", values, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleBetween(Integer value1, Integer value2) {
            addCriterion("jiji_people between", value1, value2, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andJijiPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("jiji_people not between", value1, value2, "jijiPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleIsNull() {
            addCriterion("fazhan_people is null");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleIsNotNull() {
            addCriterion("fazhan_people is not null");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleEqualTo(Integer value) {
            addCriterion("fazhan_people =", value, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleNotEqualTo(Integer value) {
            addCriterion("fazhan_people <>", value, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleGreaterThan(Integer value) {
            addCriterion("fazhan_people >", value, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("fazhan_people >=", value, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleLessThan(Integer value) {
            addCriterion("fazhan_people <", value, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("fazhan_people <=", value, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleIn(List<Integer> values) {
            addCriterion("fazhan_people in", values, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleNotIn(List<Integer> values) {
            addCriterion("fazhan_people not in", values, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleBetween(Integer value1, Integer value2) {
            addCriterion("fazhan_people between", value1, value2, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andFazhanPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("fazhan_people not between", value1, value2, "fazhanPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleIsNull() {
            addCriterion("yubei_people is null");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleIsNotNull() {
            addCriterion("yubei_people is not null");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleEqualTo(Integer value) {
            addCriterion("yubei_people =", value, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleNotEqualTo(Integer value) {
            addCriterion("yubei_people <>", value, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleGreaterThan(Integer value) {
            addCriterion("yubei_people >", value, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("yubei_people >=", value, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleLessThan(Integer value) {
            addCriterion("yubei_people <", value, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("yubei_people <=", value, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleIn(List<Integer> values) {
            addCriterion("yubei_people in", values, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleNotIn(List<Integer> values) {
            addCriterion("yubei_people not in", values, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleBetween(Integer value1, Integer value2) {
            addCriterion("yubei_people between", value1, value2, "yubeiPeople");
            return (Criteria) this;
        }

        public Criteria andYubeiPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("yubei_people not between", value1, value2, "yubeiPeople");
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