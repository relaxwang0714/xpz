package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Design {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String designServiceName;

    private String designServiceAddress;

    private String longitude;

    private String latitude;

    private Integer height;

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

    public String getDesignServiceName() {
        return designServiceName;
    }

    public void setDesignServiceName(String designServiceName) {
        this.designServiceName = designServiceName;
    }

    public String getDesignServiceAddress() {
        return designServiceAddress;
    }

    public void setDesignServiceAddress(String designServiceAddress) {
        this.designServiceAddress = designServiceAddress;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Design(Integer id, Date createTime, Date updateTime, String designServiceName, String designServiceAddress, String longitude, String latitude, Integer height, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.designServiceName = designServiceName;
        this.designServiceAddress = designServiceAddress;
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
        this.villageId = villageId;
    }
}
