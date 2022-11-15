package com.example.xpz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CunMingManyiduExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CunMingManyiduExample() {
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

        public Criteria andLajiFenleiIsNull() {
            addCriterion("laji_fenlei is null");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiIsNotNull() {
            addCriterion("laji_fenlei is not null");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiEqualTo(Integer value) {
            addCriterion("laji_fenlei =", value, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiNotEqualTo(Integer value) {
            addCriterion("laji_fenlei <>", value, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiGreaterThan(Integer value) {
            addCriterion("laji_fenlei >", value, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiGreaterThanOrEqualTo(Integer value) {
            addCriterion("laji_fenlei >=", value, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiLessThan(Integer value) {
            addCriterion("laji_fenlei <", value, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiLessThanOrEqualTo(Integer value) {
            addCriterion("laji_fenlei <=", value, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiIn(List<Integer> values) {
            addCriterion("laji_fenlei in", values, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiNotIn(List<Integer> values) {
            addCriterion("laji_fenlei not in", values, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiBetween(Integer value1, Integer value2) {
            addCriterion("laji_fenlei between", value1, value2, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andLajiFenleiNotBetween(Integer value1, Integer value2) {
            addCriterion("laji_fenlei not between", value1, value2, "lajiFenlei");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoIsNull() {
            addCriterion("cunrong_cunmao is null");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoIsNotNull() {
            addCriterion("cunrong_cunmao is not null");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoEqualTo(Integer value) {
            addCriterion("cunrong_cunmao =", value, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoNotEqualTo(Integer value) {
            addCriterion("cunrong_cunmao <>", value, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoGreaterThan(Integer value) {
            addCriterion("cunrong_cunmao >", value, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cunrong_cunmao >=", value, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoLessThan(Integer value) {
            addCriterion("cunrong_cunmao <", value, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoLessThanOrEqualTo(Integer value) {
            addCriterion("cunrong_cunmao <=", value, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoIn(List<Integer> values) {
            addCriterion("cunrong_cunmao in", values, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoNotIn(List<Integer> values) {
            addCriterion("cunrong_cunmao not in", values, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoBetween(Integer value1, Integer value2) {
            addCriterion("cunrong_cunmao between", value1, value2, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andCunrongCunmaoNotBetween(Integer value1, Integer value2) {
            addCriterion("cunrong_cunmao not between", value1, value2, "cunrongCunmao");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuIsNull() {
            addCriterion("yingji_jiuzhu is null");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuIsNotNull() {
            addCriterion("yingji_jiuzhu is not null");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuEqualTo(Integer value) {
            addCriterion("yingji_jiuzhu =", value, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuNotEqualTo(Integer value) {
            addCriterion("yingji_jiuzhu <>", value, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuGreaterThan(Integer value) {
            addCriterion("yingji_jiuzhu >", value, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("yingji_jiuzhu >=", value, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuLessThan(Integer value) {
            addCriterion("yingji_jiuzhu <", value, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuLessThanOrEqualTo(Integer value) {
            addCriterion("yingji_jiuzhu <=", value, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuIn(List<Integer> values) {
            addCriterion("yingji_jiuzhu in", values, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuNotIn(List<Integer> values) {
            addCriterion("yingji_jiuzhu not in", values, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuBetween(Integer value1, Integer value2) {
            addCriterion("yingji_jiuzhu between", value1, value2, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andYingjiJiuzhuNotBetween(Integer value1, Integer value2) {
            addCriterion("yingji_jiuzhu not between", value1, value2, "yingjiJiuzhu");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianIsNull() {
            addCriterion("qinglian_zaixian is null");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianIsNotNull() {
            addCriterion("qinglian_zaixian is not null");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianEqualTo(Integer value) {
            addCriterion("qinglian_zaixian =", value, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianNotEqualTo(Integer value) {
            addCriterion("qinglian_zaixian <>", value, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianGreaterThan(Integer value) {
            addCriterion("qinglian_zaixian >", value, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianGreaterThanOrEqualTo(Integer value) {
            addCriterion("qinglian_zaixian >=", value, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianLessThan(Integer value) {
            addCriterion("qinglian_zaixian <", value, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianLessThanOrEqualTo(Integer value) {
            addCriterion("qinglian_zaixian <=", value, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianIn(List<Integer> values) {
            addCriterion("qinglian_zaixian in", values, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianNotIn(List<Integer> values) {
            addCriterion("qinglian_zaixian not in", values, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianBetween(Integer value1, Integer value2) {
            addCriterion("qinglian_zaixian between", value1, value2, "qinglianZaixian");
            return (Criteria) this;
        }

        public Criteria andQinglianZaixianNotBetween(Integer value1, Integer value2) {
            addCriterion("qinglian_zaixian not between", value1, value2, "qinglianZaixian");
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