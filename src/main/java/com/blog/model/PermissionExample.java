package com.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(Long value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(Long value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(Long value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(Long value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(Long value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<Long> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<Long> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(Long value1, Long value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(Long value1, Long value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNull() {
            addCriterion("per_name is null");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNotNull() {
            addCriterion("per_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerNameEqualTo(String value) {
            addCriterion("per_name =", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotEqualTo(String value) {
            addCriterion("per_name <>", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThan(String value) {
            addCriterion("per_name >", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThanOrEqualTo(String value) {
            addCriterion("per_name >=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThan(String value) {
            addCriterion("per_name <", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThanOrEqualTo(String value) {
            addCriterion("per_name <=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLike(String value) {
            addCriterion("per_name like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotLike(String value) {
            addCriterion("per_name not like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameIn(List<String> values) {
            addCriterion("per_name in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotIn(List<String> values) {
            addCriterion("per_name not in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameBetween(String value1, String value2) {
            addCriterion("per_name between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotBetween(String value1, String value2) {
            addCriterion("per_name not between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNull() {
            addCriterion("per_desc is null");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNotNull() {
            addCriterion("per_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPerDescEqualTo(String value) {
            addCriterion("per_desc =", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotEqualTo(String value) {
            addCriterion("per_desc <>", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThan(String value) {
            addCriterion("per_desc >", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThanOrEqualTo(String value) {
            addCriterion("per_desc >=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThan(String value) {
            addCriterion("per_desc <", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThanOrEqualTo(String value) {
            addCriterion("per_desc <=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLike(String value) {
            addCriterion("per_desc like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotLike(String value) {
            addCriterion("per_desc not like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescIn(List<String> values) {
            addCriterion("per_desc in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotIn(List<String> values) {
            addCriterion("per_desc not in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescBetween(String value1, String value2) {
            addCriterion("per_desc between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotBetween(String value1, String value2) {
            addCriterion("per_desc not between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andCreaterUserIsNull() {
            addCriterion("creater_user is null");
            return (Criteria) this;
        }

        public Criteria andCreaterUserIsNotNull() {
            addCriterion("creater_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterUserEqualTo(String value) {
            addCriterion("creater_user =", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserNotEqualTo(String value) {
            addCriterion("creater_user <>", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserGreaterThan(String value) {
            addCriterion("creater_user >", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserGreaterThanOrEqualTo(String value) {
            addCriterion("creater_user >=", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserLessThan(String value) {
            addCriterion("creater_user <", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserLessThanOrEqualTo(String value) {
            addCriterion("creater_user <=", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserLike(String value) {
            addCriterion("creater_user like", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserNotLike(String value) {
            addCriterion("creater_user not like", value, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserIn(List<String> values) {
            addCriterion("creater_user in", values, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserNotIn(List<String> values) {
            addCriterion("creater_user not in", values, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserBetween(String value1, String value2) {
            addCriterion("creater_user between", value1, value2, "createrUser");
            return (Criteria) this;
        }

        public Criteria andCreaterUserNotBetween(String value1, String value2) {
            addCriterion("creater_user not between", value1, value2, "createrUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("creater_time not between", value1, value2, "createrTime");
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

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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