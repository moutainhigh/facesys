package com.ss.facesys.data.resource.common.web;

import com.ss.request.Pagination;
import com.ss.valide.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
* 离线视频
* @author chao
* @create 2020/2/7
* @email lishuangchao@ss-cas.com
**/
@Table(name = "cw_base_offline_video")
public class OfflineVideoVO extends Pagination {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "{offlineVideo.id.empty}", groups = {APIEditGroup.class, APIDeltGroup.class, APIGetsGroup.class, APIOpStatusGroup.class})
    private Integer id;
    private String deviceId;
    @NotBlank(message = "{offlineVideo.name.empty}", groups = {APIAddGroup.class})
    private String name;
    private String depositUrl;
    @NotNull(message = "{offlineVideo.uploadModeCode.empty}", groups = {APIAddGroup.class})
    private Integer uploadModeCode;
    private String uploadUrl;
    private String format;
    private String remark;
    @NotBlank(message = "{offlineVideo.orgId.empty}", groups = {APIAddGroup.class, APIEditGroup.class})
    private String orgId;
    private String createUserId;
    private String createTime;
    private Integer status;
    @Transient
    private String orgName;
    @Transient
    private String createUserName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepositUrl() {
        return depositUrl;
    }

    public void setDepositUrl(String depositUrl) {
        this.depositUrl = depositUrl;
    }

    public Integer getUploadModeCode() {
        return uploadModeCode;
    }

    public void setUploadModeCode(Integer uploadModeCode) {
        this.uploadModeCode = uploadModeCode;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}