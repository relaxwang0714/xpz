package com.example.xpz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZichanKeshiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZichanKeshiExample() {
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

        public Criteria andFangwuIsNull() {
            addCriterion("fangwu is null");
            return (Criteria) this;
        }

        public Criteria andFangwuIsNotNull() {
            addCriterion("fangwu is not null");
            return (Criteria) this;
        }

        public Criteria andFangwuEqualTo(String value) {
            addCriterion("fangwu =", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuNotEqualTo(String value) {
            addCriterion("fangwu <>", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuGreaterThan(String value) {
            addCriterion("fangwu >", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuGreaterThanOrEqualTo(String value) {
            addCriterion("fangwu >=", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuLessThan(String value) {
            addCriterion("fangwu <", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuLessThanOrEqualTo(String value) {
            addCriterion("fangwu <=", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuLike(String value) {
            addCriterion("fangwu like", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuNotLike(String value) {
            addCriterion("fangwu not like", value, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuIn(List<String> values) {
            addCriterion("fangwu in", values, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuNotIn(List<String> values) {
            addCriterion("fangwu not in", values, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuBetween(String value1, String value2) {
            addCriterion("fangwu between", value1, value2, "fangwu");
            return (Criteria) this;
        }

        public Criteria andFangwuNotBetween(String value1, String value2) {
            addCriterion("fangwu not between", value1, value2, "fangwu");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleIsNull() {
            addCriterion("chengzu_people is null");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleIsNotNull() {
            addCriterion("chengzu_people is not null");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleEqualTo(String value) {
            addCriterion("chengzu_people =", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleNotEqualTo(String value) {
            addCriterion("chengzu_people <>", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleGreaterThan(String value) {
            addCriterion("chengzu_people >", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("chengzu_people >=", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleLessThan(String value) {
            addCriterion("chengzu_people <", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleLessThanOrEqualTo(String value) {
            addCriterion("chengzu_people <=", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleLike(String value) {
            addCriterion("chengzu_people like", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleNotLike(String value) {
            addCriterion("chengzu_people not like", value, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleIn(List<String> values) {
            addCriterion("chengzu_people in", values, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleNotIn(List<String> values) {
            addCriterion("chengzu_people not in", values, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleBetween(String value1, String value2) {
            addCriterion("chengzu_people between", value1, value2, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andChengzuPeopleNotBetween(String value1, String value2) {
            addCriterion("chengzu_people not between", value1, value2, "chengzuPeople");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIsGuishuIsNull() {
            addCriterion("is_guishu is null");
            return (Criteria) this;
        }

        public Criteria andIsGuishuIsNotNull() {
            addCriterion("is_guishu is not null");
            return (Criteria) this;
        }

        public Criteria andIsGuishuEqualTo(Integer value) {
            addCriterion("is_guishu =", value, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuNotEqualTo(Integer value) {
            addCriterion("is_guishu <>", value, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuGreaterThan(Integer value) {
            addCriterion("is_guishu >", value, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_guishu >=", value, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuLessThan(Integer value) {
            addCriterion("is_guishu <", value, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuLessThanOrEqualTo(Integer value) {
            addCriterion("is_guishu <=", value, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuIn(List<Integer> values) {
            addCriterion("is_guishu in", values, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuNotIn(List<Integer> values) {
            addCriterion("is_guishu not in", values, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuBetween(Integer value1, Integer value2) {
            addCriterion("is_guishu between", value1, value2, "isGuishu");
            return (Criteria) this;
        }

        public Criteria andIsGuishuNotBetween(Integer value1, Integer value2) {
            addCriterion("is_guishu not between", value1, value2, "isGuishu");
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