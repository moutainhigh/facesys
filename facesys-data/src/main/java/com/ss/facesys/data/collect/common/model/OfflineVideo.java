package com.ss.facesys.data.collect.common.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 离线视频
 *
 * @author chao
 * @create 2020/2/7
 * @email lishuangchao@ss-cas.com
 **/
@Table(name = "cw_base_offline_video")
public class OfflineVideo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    @Column(name = "device_id")
    private String deviceId;
    private String name;
    @Column(name = "deposit_url")
    private String depositUrl;
    @Column(name = "upload_mode")
    private Integer uploadModeCode;
    @Column(name = "upload_url")
    private String uploadUrl;
    private String format;
    private String remark;
    @Column(name = "org_id")
    private String orgId;
    @Column(name = "create_user_id")
    private String createUserId;
    @Column(name = "create_time")
    private String createTime;
    private Integer status;
    @Transient
    private String orgName;
    @Transient
    private String createUserName;
    @Transient
    private String statusName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
