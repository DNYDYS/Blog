package com.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAccIdIsNull() {
            addCriterion("acc_id is null");
            return (Criteria) this;
        }

        public Criteria andAccIdIsNotNull() {
            addCriterion("acc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccIdEqualTo(Long value) {
            addCriterion("acc_id =", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotEqualTo(Long value) {
            addCriterion("acc_id <>", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThan(Long value) {
            addCriterion("acc_id >", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThanOrEqualTo(Long value) {
            addCriterion("acc_id >=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThan(Long value) {
            addCriterion("acc_id <", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThanOrEqualTo(Long value) {
            addCriterion("acc_id <=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdIn(List<Long> values) {
            addCriterion("acc_id in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotIn(List<Long> values) {
            addCriterion("acc_id not in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdBetween(Long value1, Long value2) {
            addCriterion("acc_id between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotBetween(Long value1, Long value2) {
            addCriterion("acc_id not between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccNameIsNull() {
            addCriterion("acc_name is null");
            return (Criteria) this;
        }

        public Criteria andAccNameIsNotNull() {
            addCriterion("acc_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccNameEqualTo(String value) {
            addCriterion("acc_name =", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotEqualTo(String value) {
            addCriterion("acc_name <>", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameGreaterThan(String value) {
            addCriterion("acc_name >", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameGreaterThanOrEqualTo(String value) {
            addCriterion("acc_name >=", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameLessThan(String value) {
            addCriterion("acc_name <", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameLessThanOrEqualTo(String value) {
            addCriterion("acc_name <=", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameLike(String value) {
            addCriterion("acc_name like", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotLike(String value) {
            addCriterion("acc_name not like", value, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameIn(List<String> values) {
            addCriterion("acc_name in", values, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotIn(List<String> values) {
            addCriterion("acc_name not in", values, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameBetween(String value1, String value2) {
            addCriterion("acc_name between", value1, value2, "accName");
            return (Criteria) this;
        }

        public Criteria andAccNameNotBetween(String value1, String value2) {
            addCriterion("acc_name not between", value1, value2, "accName");
            return (Criteria) this;
        }

        public Criteria andAccPwdIsNull() {
            addCriterion("acc_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAccPwdIsNotNull() {
            addCriterion("acc_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAccPwdEqualTo(String value) {
            addCriterion("acc_pwd =", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotEqualTo(String value) {
            addCriterion("acc_pwd <>", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdGreaterThan(String value) {
            addCriterion("acc_pwd >", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdGreaterThanOrEqualTo(String value) {
            addCriterion("acc_pwd >=", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLessThan(String value) {
            addCriterion("acc_pwd <", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLessThanOrEqualTo(String value) {
            addCriterion("acc_pwd <=", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLike(String value) {
            addCriterion("acc_pwd like", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotLike(String value) {
            addCriterion("acc_pwd not like", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdIn(List<String> values) {
            addCriterion("acc_pwd in", values, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotIn(List<String> values) {
            addCriterion("acc_pwd not in", values, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdBetween(String value1, String value2) {
            addCriterion("acc_pwd between", value1, value2, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotBetween(String value1, String value2) {
            addCriterion("acc_pwd not between", value1, value2, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccIpIsNull() {
            addCriterion("acc_ip is null");
            return (Criteria) this;
        }

        public Criteria andAccIpIsNotNull() {
            addCriterion("acc_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAccIpEqualTo(String value) {
            addCriterion("acc_ip =", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpNotEqualTo(String value) {
            addCriterion("acc_ip <>", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpGreaterThan(String value) {
            addCriterion("acc_ip >", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpGreaterThanOrEqualTo(String value) {
            addCriterion("acc_ip >=", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpLessThan(String value) {
            addCriterion("acc_ip <", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpLessThanOrEqualTo(String value) {
            addCriterion("acc_ip <=", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpLike(String value) {
            addCriterion("acc_ip like", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpNotLike(String value) {
            addCriterion("acc_ip not like", value, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpIn(List<String> values) {
            addCriterion("acc_ip in", values, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpNotIn(List<String> values) {
            addCriterion("acc_ip not in", values, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpBetween(String value1, String value2) {
            addCriterion("acc_ip between", value1, value2, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccIpNotBetween(String value1, String value2) {
            addCriterion("acc_ip not between", value1, value2, "accIp");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeIsNull() {
            addCriterion("acc_login_time is null");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeIsNotNull() {
            addCriterion("acc_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeEqualTo(Date value) {
            addCriterion("acc_login_time =", value, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeNotEqualTo(Date value) {
            addCriterion("acc_login_time <>", value, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeGreaterThan(Date value) {
            addCriterion("acc_login_time >", value, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("acc_login_time >=", value, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeLessThan(Date value) {
            addCriterion("acc_login_time <", value, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("acc_login_time <=", value, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeIn(List<Date> values) {
            addCriterion("acc_login_time in", values, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeNotIn(List<Date> values) {
            addCriterion("acc_login_time not in", values, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeBetween(Date value1, Date value2) {
            addCriterion("acc_login_time between", value1, value2, "accLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("acc_login_time not between", value1, value2, "accLoginTime");
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