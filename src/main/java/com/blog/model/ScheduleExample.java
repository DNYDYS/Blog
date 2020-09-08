package com.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andSchIdIsNull() {
            addCriterion("sch_id is null");
            return (Criteria) this;
        }

        public Criteria andSchIdIsNotNull() {
            addCriterion("sch_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchIdEqualTo(Long value) {
            addCriterion("sch_id =", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotEqualTo(Long value) {
            addCriterion("sch_id <>", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThan(Long value) {
            addCriterion("sch_id >", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sch_id >=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThan(Long value) {
            addCriterion("sch_id <", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThanOrEqualTo(Long value) {
            addCriterion("sch_id <=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdIn(List<Long> values) {
            addCriterion("sch_id in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotIn(List<Long> values) {
            addCriterion("sch_id not in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdBetween(Long value1, Long value2) {
            addCriterion("sch_id between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotBetween(Long value1, Long value2) {
            addCriterion("sch_id not between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNull() {
            addCriterion("sch_name is null");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNotNull() {
            addCriterion("sch_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchNameEqualTo(String value) {
            addCriterion("sch_name =", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotEqualTo(String value) {
            addCriterion("sch_name <>", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThan(String value) {
            addCriterion("sch_name >", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_name >=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThan(String value) {
            addCriterion("sch_name <", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThanOrEqualTo(String value) {
            addCriterion("sch_name <=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLike(String value) {
            addCriterion("sch_name like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotLike(String value) {
            addCriterion("sch_name not like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameIn(List<String> values) {
            addCriterion("sch_name in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotIn(List<String> values) {
            addCriterion("sch_name not in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameBetween(String value1, String value2) {
            addCriterion("sch_name between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotBetween(String value1, String value2) {
            addCriterion("sch_name not between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchTextIsNull() {
            addCriterion("sch_text is null");
            return (Criteria) this;
        }

        public Criteria andSchTextIsNotNull() {
            addCriterion("sch_text is not null");
            return (Criteria) this;
        }

        public Criteria andSchTextEqualTo(String value) {
            addCriterion("sch_text =", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextNotEqualTo(String value) {
            addCriterion("sch_text <>", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextGreaterThan(String value) {
            addCriterion("sch_text >", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextGreaterThanOrEqualTo(String value) {
            addCriterion("sch_text >=", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextLessThan(String value) {
            addCriterion("sch_text <", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextLessThanOrEqualTo(String value) {
            addCriterion("sch_text <=", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextLike(String value) {
            addCriterion("sch_text like", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextNotLike(String value) {
            addCriterion("sch_text not like", value, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextIn(List<String> values) {
            addCriterion("sch_text in", values, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextNotIn(List<String> values) {
            addCriterion("sch_text not in", values, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextBetween(String value1, String value2) {
            addCriterion("sch_text between", value1, value2, "schText");
            return (Criteria) this;
        }

        public Criteria andSchTextNotBetween(String value1, String value2) {
            addCriterion("sch_text not between", value1, value2, "schText");
            return (Criteria) this;
        }

        public Criteria andSchPlanIsNull() {
            addCriterion("sch_plan is null");
            return (Criteria) this;
        }

        public Criteria andSchPlanIsNotNull() {
            addCriterion("sch_plan is not null");
            return (Criteria) this;
        }

        public Criteria andSchPlanEqualTo(String value) {
            addCriterion("sch_plan =", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanNotEqualTo(String value) {
            addCriterion("sch_plan <>", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanGreaterThan(String value) {
            addCriterion("sch_plan >", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanGreaterThanOrEqualTo(String value) {
            addCriterion("sch_plan >=", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanLessThan(String value) {
            addCriterion("sch_plan <", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanLessThanOrEqualTo(String value) {
            addCriterion("sch_plan <=", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanLike(String value) {
            addCriterion("sch_plan like", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanNotLike(String value) {
            addCriterion("sch_plan not like", value, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanIn(List<String> values) {
            addCriterion("sch_plan in", values, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanNotIn(List<String> values) {
            addCriterion("sch_plan not in", values, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanBetween(String value1, String value2) {
            addCriterion("sch_plan between", value1, value2, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchPlanNotBetween(String value1, String value2) {
            addCriterion("sch_plan not between", value1, value2, "schPlan");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeIsNull() {
            addCriterion("sch_expect_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeIsNotNull() {
            addCriterion("sch_expect_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeEqualTo(Date value) {
            addCriterion("sch_expect_start_time =", value, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeNotEqualTo(Date value) {
            addCriterion("sch_expect_start_time <>", value, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeGreaterThan(Date value) {
            addCriterion("sch_expect_start_time >", value, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sch_expect_start_time >=", value, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeLessThan(Date value) {
            addCriterion("sch_expect_start_time <", value, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("sch_expect_start_time <=", value, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeIn(List<Date> values) {
            addCriterion("sch_expect_start_time in", values, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeNotIn(List<Date> values) {
            addCriterion("sch_expect_start_time not in", values, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeBetween(Date value1, Date value2) {
            addCriterion("sch_expect_start_time between", value1, value2, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("sch_expect_start_time not between", value1, value2, "schExpectStartTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeIsNull() {
            addCriterion("sch_expect_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeIsNotNull() {
            addCriterion("sch_expect_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeEqualTo(Date value) {
            addCriterion("sch_expect_end_time =", value, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeNotEqualTo(Date value) {
            addCriterion("sch_expect_end_time <>", value, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeGreaterThan(Date value) {
            addCriterion("sch_expect_end_time >", value, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sch_expect_end_time >=", value, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeLessThan(Date value) {
            addCriterion("sch_expect_end_time <", value, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("sch_expect_end_time <=", value, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeIn(List<Date> values) {
            addCriterion("sch_expect_end_time in", values, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeNotIn(List<Date> values) {
            addCriterion("sch_expect_end_time not in", values, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeBetween(Date value1, Date value2) {
            addCriterion("sch_expect_end_time between", value1, value2, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchExpectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("sch_expect_end_time not between", value1, value2, "schExpectEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeIsNull() {
            addCriterion("sch_reality_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeIsNotNull() {
            addCriterion("sch_reality_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeEqualTo(Date value) {
            addCriterion("sch_reality_start_time =", value, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeNotEqualTo(Date value) {
            addCriterion("sch_reality_start_time <>", value, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeGreaterThan(Date value) {
            addCriterion("sch_reality_start_time >", value, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sch_reality_start_time >=", value, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeLessThan(Date value) {
            addCriterion("sch_reality_start_time <", value, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("sch_reality_start_time <=", value, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeIn(List<Date> values) {
            addCriterion("sch_reality_start_time in", values, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeNotIn(List<Date> values) {
            addCriterion("sch_reality_start_time not in", values, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeBetween(Date value1, Date value2) {
            addCriterion("sch_reality_start_time between", value1, value2, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("sch_reality_start_time not between", value1, value2, "schRealityStartTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeIsNull() {
            addCriterion("sch_reality_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeIsNotNull() {
            addCriterion("sch_reality_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeEqualTo(Date value) {
            addCriterion("sch_reality_end_time =", value, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeNotEqualTo(Date value) {
            addCriterion("sch_reality_end_time <>", value, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeGreaterThan(Date value) {
            addCriterion("sch_reality_end_time >", value, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sch_reality_end_time >=", value, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeLessThan(Date value) {
            addCriterion("sch_reality_end_time <", value, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("sch_reality_end_time <=", value, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeIn(List<Date> values) {
            addCriterion("sch_reality_end_time in", values, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeNotIn(List<Date> values) {
            addCriterion("sch_reality_end_time not in", values, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeBetween(Date value1, Date value2) {
            addCriterion("sch_reality_end_time between", value1, value2, "schRealityEndTime");
            return (Criteria) this;
        }

        public Criteria andSchRealityEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("sch_reality_end_time not between", value1, value2, "schRealityEndTime");
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