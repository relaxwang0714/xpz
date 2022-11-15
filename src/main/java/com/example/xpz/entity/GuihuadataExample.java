package com.example.xpz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuihuadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuihuadataExample() {
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

        public Criteria andGuihuaServiceNameIsNull() {
            addCriterion("guihua_service_name is null");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameIsNotNull() {
            addCriterion("guihua_service_name is not null");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameEqualTo(String value) {
            addCriterion("guihua_service_name =", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameNotEqualTo(String value) {
            addCriterion("guihua_service_name <>", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameGreaterThan(String value) {
            addCriterion("guihua_service_name >", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("guihua_service_name >=", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameLessThan(String value) {
            addCriterion("guihua_service_name <", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameLessThanOrEqualTo(String value) {
            addCriterion("guihua_service_name <=", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameLike(String value) {
            addCriterion("guihua_service_name like", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameNotLike(String value) {
            addCriterion("guihua_service_name not like", value, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameIn(List<String> values) {
            addCriterion("guihua_service_name in", values, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameNotIn(List<String> values) {
            addCriterion("guihua_service_name not in", values, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameBetween(String value1, String value2) {
            addCriterion("guihua_service_name between", value1, value2, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceNameNotBetween(String value1, String value2) {
            addCriterion("guihua_service_name not between", value1, value2, "guihuaServiceName");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressIsNull() {
            addCriterion("guihua_service_address is null");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressIsNotNull() {
            addCriterion("guihua_service_address is not null");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressEqualTo(String value) {
            addCriterion("guihua_service_address =", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressNotEqualTo(String value) {
            addCriterion("guihua_service_address <>", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressGreaterThan(String value) {
            addCriterion("guihua_service_address >", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("guihua_service_address >=", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressLessThan(String value) {
            addCriterion("guihua_service_address <", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressLessThanOrEqualTo(String value) {
            addCriterion("guihua_service_address <=", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressLike(String value) {
            addCriterion("guihua_service_address like", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressNotLike(String value) {
            addCriterion("guihua_service_address not like", value, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressIn(List<String> values) {
            addCriterion("guihua_service_address in", values, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressNotIn(List<String> values) {
            addCriterion("guihua_service_address not in", values, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressBetween(String value1, String value2) {
            addCriterion("guihua_service_address between", value1, value2, "guihuaServiceAddress");
            return (Criteria) this;
        }

        public Criteria andGuihuaServiceAddressNotBetween(String value1, String value2) {
            addCriterion("guihua_service_address not between", value1, value2, "guihuaServiceAddress");
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

        public Criteria andVillageIdEqualTo(Long value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Long value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Long value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Long value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Long value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Long> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Long> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Long value1, Long value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Long value1, Long value2) {
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