package com.example.xpz.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LaodongliIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LaodongliIncomeExample() {
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

        public Criteria andSiyinIncomeIsNull() {
            addCriterion("siyin_income is null");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeIsNotNull() {
            addCriterion("siyin_income is not null");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeEqualTo(BigDecimal value) {
            addCriterion("siyin_income =", value, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeNotEqualTo(BigDecimal value) {
            addCriterion("siyin_income <>", value, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeGreaterThan(BigDecimal value) {
            addCriterion("siyin_income >", value, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("siyin_income >=", value, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeLessThan(BigDecimal value) {
            addCriterion("siyin_income <", value, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("siyin_income <=", value, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeIn(List<BigDecimal> values) {
            addCriterion("siyin_income in", values, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeNotIn(List<BigDecimal> values) {
            addCriterion("siyin_income not in", values, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("siyin_income between", value1, value2, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andSiyinIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("siyin_income not between", value1, value2, "siyinIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeIsNull() {
            addCriterion("qiye_income is null");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeIsNotNull() {
            addCriterion("qiye_income is not null");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeEqualTo(BigDecimal value) {
            addCriterion("qiye_income =", value, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeNotEqualTo(BigDecimal value) {
            addCriterion("qiye_income <>", value, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeGreaterThan(BigDecimal value) {
            addCriterion("qiye_income >", value, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qiye_income >=", value, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeLessThan(BigDecimal value) {
            addCriterion("qiye_income <", value, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qiye_income <=", value, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeIn(List<BigDecimal> values) {
            addCriterion("qiye_income in", values, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeNotIn(List<BigDecimal> values) {
            addCriterion("qiye_income not in", values, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qiye_income between", value1, value2, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andQiyeIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qiye_income not between", value1, value2, "qiyeIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeIsNull() {
            addCriterion("nongcun_income is null");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeIsNotNull() {
            addCriterion("nongcun_income is not null");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeEqualTo(BigDecimal value) {
            addCriterion("nongcun_income =", value, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeNotEqualTo(BigDecimal value) {
            addCriterion("nongcun_income <>", value, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeGreaterThan(BigDecimal value) {
            addCriterion("nongcun_income >", value, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nongcun_income >=", value, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeLessThan(BigDecimal value) {
            addCriterion("nongcun_income <", value, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nongcun_income <=", value, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeIn(List<BigDecimal> values) {
            addCriterion("nongcun_income in", values, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeNotIn(List<BigDecimal> values) {
            addCriterion("nongcun_income not in", values, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nongcun_income between", value1, value2, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andNongcunIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nongcun_income not between", value1, value2, "nongcunIncome");
            return (Criteria) this;
        }

        public Criteria andJiduIsNull() {
            addCriterion("jidu is null");
            return (Criteria) this;
        }

        public Criteria andJiduIsNotNull() {
            addCriterion("jidu is not null");
            return (Criteria) this;
        }

        public Criteria andJiduEqualTo(Integer value) {
            addCriterion("jidu =", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotEqualTo(Integer value) {
            addCriterion("jidu <>", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduGreaterThan(Integer value) {
            addCriterion("jidu >", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduGreaterThanOrEqualTo(Integer value) {
            addCriterion("jidu >=", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLessThan(Integer value) {
            addCriterion("jidu <", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLessThanOrEqualTo(Integer value) {
            addCriterion("jidu <=", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduIn(List<Integer> values) {
            addCriterion("jidu in", values, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotIn(List<Integer> values) {
            addCriterion("jidu not in", values, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduBetween(Integer value1, Integer value2) {
            addCriterion("jidu between", value1, value2, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotBetween(Integer value1, Integer value2) {
            addCriterion("jidu not between", value1, value2, "jidu");
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