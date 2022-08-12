package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class guihuaData {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;

    private String guihuaServiceName;

    private String guihuaServiceAddress;

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

    public String getGuihuaServiceName() {
        return guihuaServiceName;
    }

    public void setGuihuaServiceName(String guihuaServiceName) {
        this.guihuaServiceName = guihuaServiceName;
    }

    public String getGuihuaServiceAddress() {
        return guihuaServiceAddress;
    }

    public void setGuihuaServiceAddress(String guihuaServiceAddress) {
        this.guihuaServiceAddress = guihuaServiceAddress;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public guihuaData(Integer id, Date createTime, Date updateTime, String guihuaServiceName, String guihuaServiceAddress, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.guihuaServiceName = guihuaServiceName;
        this.guihuaServiceAddress = guihuaServiceAddress;
        this.villageId = villageId;
    }
}
