package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class currentData {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTIme;

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

    public Date getUpdateTIme() {
        return updateTIme;
    }

    public void setUpdateTIme(Date updateTIme) {
        this.updateTIme = updateTIme;
    }

    public String getCurrentServiceName() {
        return currentServiceName;
    }

    public void setCurrentServiceName(String currentServiceName) {
        this.currentServiceName = currentServiceName;
    }

    public String getCurrentServiceAddress() {
        return currentServiceAddress;
    }

    public void setCurrentServiceAddress(String currentServiceAddress) {
        this.currentServiceAddress = currentServiceAddress;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public currentData(Integer id, Date createTime, Date updateTIme, String currentServiceName, String currentServiceAddress, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTIme = updateTIme;
        this.currentServiceName = currentServiceName;
        this.currentServiceAddress = currentServiceAddress;
        this.villageId = villageId;
    }
}
