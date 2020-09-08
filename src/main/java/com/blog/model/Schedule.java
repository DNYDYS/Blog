package com.blog.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    @ApiModelProperty(value = "关联编号")
    private Long schId;

    @ApiModelProperty(value = "计划名称")
    private String schName;

    @ApiModelProperty(value = "计划内容")
    private String schText;

    @ApiModelProperty(value = "日记进度")
    private String schPlan;

    @ApiModelProperty(value = "计划预计开始时间")
    private Date schExpectStartTime;

    @ApiModelProperty(value = "计划预计结束时间")
    private Date schExpectEndTime;

    @ApiModelProperty(value = "计划实际开始时间")
    private Date schRealityStartTime;

    @ApiModelProperty(value = "计划实际结束时间")
    private Date schRealityEndTime;

    @ApiModelProperty(value = "创建人")
    private String createrUser;

    @ApiModelProperty(value = "修改人")
    private String updateUser;

    @ApiModelProperty(value = "创建时间")
    private Date createrTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除")
    private String isDeleted;

    @ApiModelProperty(value = "日记总结")
    private String schSummary;

    private static final long serialVersionUID = 1L;

    public Long getSchId() {
        return schId;
    }

    public void setSchId(Long schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText(String schText) {
        this.schText = schText;
    }

    public String getSchPlan() {
        return schPlan;
    }

    public void setSchPlan(String schPlan) {
        this.schPlan = schPlan;
    }

    public Date getSchExpectStartTime() {
        return schExpectStartTime;
    }

    public void setSchExpectStartTime(Date schExpectStartTime) {
        this.schExpectStartTime = schExpectStartTime;
    }

    public Date getSchExpectEndTime() {
        return schExpectEndTime;
    }

    public void setSchExpectEndTime(Date schExpectEndTime) {
        this.schExpectEndTime = schExpectEndTime;
    }

    public Date getSchRealityStartTime() {
        return schRealityStartTime;
    }

    public void setSchRealityStartTime(Date schRealityStartTime) {
        this.schRealityStartTime = schRealityStartTime;
    }

    public Date getSchRealityEndTime() {
        return schRealityEndTime;
    }

    public void setSchRealityEndTime(Date schRealityEndTime) {
        this.schRealityEndTime = schRealityEndTime;
    }

    public String getCreaterUser() {
        return createrUser;
    }

    public void setCreaterUser(String createrUser) {
        this.createrUser = createrUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getSchSummary() {
        return schSummary;
    }

    public void setSchSummary(String schSummary) {
        this.schSummary = schSummary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schId=").append(schId);
        sb.append(", schName=").append(schName);
        sb.append(", schText=").append(schText);
        sb.append(", schPlan=").append(schPlan);
        sb.append(", schExpectStartTime=").append(schExpectStartTime);
        sb.append(", schExpectEndTime=").append(schExpectEndTime);
        sb.append(", schRealityStartTime=").append(schRealityStartTime);
        sb.append(", schRealityEndTime=").append(schRealityEndTime);
        sb.append(", createrUser=").append(createrUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createrTime=").append(createrTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", schSummary=").append(schSummary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}