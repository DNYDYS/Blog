package com.blog.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    @ApiModelProperty(value = "账户编号")
    private Long accId;

    @ApiModelProperty(value = "账号")
    private String accName;

    @ApiModelProperty(value = "密码")
    private String accPwd;

    @ApiModelProperty(value = "用户住址")
    private String accIp;

    @ApiModelProperty(value = "登录时间")
    private Date accLoginTime;

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

    private static final long serialVersionUID = 1L;

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccPwd() {
        return accPwd;
    }

    public void setAccPwd(String accPwd) {
        this.accPwd = accPwd;
    }

    public String getAccIp() {
        return accIp;
    }

    public void setAccIp(String accIp) {
        this.accIp = accIp;
    }

    public Date getAccLoginTime() {
        return accLoginTime;
    }

    public void setAccLoginTime(Date accLoginTime) {
        this.accLoginTime = accLoginTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accId=").append(accId);
        sb.append(", accName=").append(accName);
        sb.append(", accPwd=").append(accPwd);
        sb.append(", accIp=").append(accIp);
        sb.append(", accLoginTime=").append(accLoginTime);
        sb.append(", createrUser=").append(createrUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", createrTime=").append(createrTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}