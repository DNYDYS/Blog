package com.blog.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class Diary implements Serializable {
    @ApiModelProperty(value = "日记编号")
    private Long dirId;

    @ApiModelProperty(value = "日记标题")
    private String dirTitle;

    @ApiModelProperty(value = "日记内容")
    private String dirContext;

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
    private String dirSummmary;

    private static final long serialVersionUID = 1L;

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public String getDirTitle() {
        return dirTitle;
    }

    public void setDirTitle(String dirTitle) {
        this.dirTitle = dirTitle;
    }

    public String getDirContext() {
        return dirContext;
    }

    public void setDirContext(String dirContext) {
        this.dirContext = dirContext;
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

    public String getDirSummmary() {
        return dirSummmary;
    }

    public void setDirSummmary(String dirSummmary) {
        this.dirSummmary = dirSummmary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dirId=").append(dirId);
        sb.append(", dirTitle=").append(dirTitle);
        sb.append(", dirContext=").append(dirContext);
        sb.append(", createrUser=").append(createrUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createrTime=").append(createrTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", dirSummmary=").append(dirSummmary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
