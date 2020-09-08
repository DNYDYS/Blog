package com.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyNoteExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Long value) {
            addCriterion("note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Long value) {
            addCriterion("note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Long value) {
            addCriterion("note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Long value) {
            addCriterion("note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Long value) {
            addCriterion("note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Long> values) {
            addCriterion("note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Long> values) {
            addCriterion("note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Long value1, Long value2) {
            addCriterion("note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Long value1, Long value2) {
            addCriterion("note_id not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteNameIsNull() {
            addCriterion("note_name is null");
            return (Criteria) this;
        }

        public Criteria andNoteNameIsNotNull() {
            addCriterion("note_name is not null");
            return (Criteria) this;
        }

        public Criteria andNoteNameEqualTo(String value) {
            addCriterion("note_name =", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotEqualTo(String value) {
            addCriterion("note_name <>", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameGreaterThan(String value) {
            addCriterion("note_name >", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameGreaterThanOrEqualTo(String value) {
            addCriterion("note_name >=", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameLessThan(String value) {
            addCriterion("note_name <", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameLessThanOrEqualTo(String value) {
            addCriterion("note_name <=", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameLike(String value) {
            addCriterion("note_name like", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotLike(String value) {
            addCriterion("note_name not like", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameIn(List<String> values) {
            addCriterion("note_name in", values, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotIn(List<String> values) {
            addCriterion("note_name not in", values, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameBetween(String value1, String value2) {
            addCriterion("note_name between", value1, value2, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotBetween(String value1, String value2) {
            addCriterion("note_name not between", value1, value2, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteUrlIsNull() {
            addCriterion("note_url is null");
            return (Criteria) this;
        }

        public Criteria andNoteUrlIsNotNull() {
            addCriterion("note_url is not null");
            return (Criteria) this;
        }

        public Criteria andNoteUrlEqualTo(String value) {
            addCriterion("note_url =", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlNotEqualTo(String value) {
            addCriterion("note_url <>", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlGreaterThan(String value) {
            addCriterion("note_url >", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlGreaterThanOrEqualTo(String value) {
            addCriterion("note_url >=", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlLessThan(String value) {
            addCriterion("note_url <", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlLessThanOrEqualTo(String value) {
            addCriterion("note_url <=", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlLike(String value) {
            addCriterion("note_url like", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlNotLike(String value) {
            addCriterion("note_url not like", value, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlIn(List<String> values) {
            addCriterion("note_url in", values, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlNotIn(List<String> values) {
            addCriterion("note_url not in", values, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlBetween(String value1, String value2) {
            addCriterion("note_url between", value1, value2, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteUrlNotBetween(String value1, String value2) {
            addCriterion("note_url not between", value1, value2, "noteUrl");
            return (Criteria) this;
        }

        public Criteria andNoteDescIsNull() {
            addCriterion("note_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoteDescIsNotNull() {
            addCriterion("note_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoteDescEqualTo(String value) {
            addCriterion("note_desc =", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescNotEqualTo(String value) {
            addCriterion("note_desc <>", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescGreaterThan(String value) {
            addCriterion("note_desc >", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescGreaterThanOrEqualTo(String value) {
            addCriterion("note_desc >=", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescLessThan(String value) {
            addCriterion("note_desc <", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescLessThanOrEqualTo(String value) {
            addCriterion("note_desc <=", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescLike(String value) {
            addCriterion("note_desc like", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescNotLike(String value) {
            addCriterion("note_desc not like", value, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescIn(List<String> values) {
            addCriterion("note_desc in", values, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescNotIn(List<String> values) {
            addCriterion("note_desc not in", values, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescBetween(String value1, String value2) {
            addCriterion("note_desc between", value1, value2, "noteDesc");
            return (Criteria) this;
        }

        public Criteria andNoteDescNotBetween(String value1, String value2) {
            addCriterion("note_desc not between", value1, value2, "noteDesc");
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