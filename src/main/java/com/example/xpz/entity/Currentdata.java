package com.example.xpz.entity;

import java.util.Date;

public class Currentdata {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String currentServiceName;

    private String currentServiceAddress;

    private Integer villageId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCurrentServiceName() {
        return currentServiceName;
    }

    public void setCurrentServiceName(String currentServiceName) {
        this.currentServiceName = currentServiceName == null ? null : currentServiceName.trim();
    }

    public String getCurrentServiceAddress() {
        return currentServiceAddress;
    }

    public void setCurrentServiceAddress(String currentServiceAddress) {
        this.currentServiceAddress = currentServiceAddress == null ? null : currentServiceAddress.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}