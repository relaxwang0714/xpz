package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Facility {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;

    private Date updateTime;

    private String facilityType;

    private String facilityName;

    private String responsePeople;

    private String phone;

    private String shiliang;

    private Integer villageId;

    private String panoUrl;

    public String getPanoUrl() {
        return panoUrl;
    }

    public void setPanoUrl(String panoUrl) {
        this.panoUrl = panoUrl;
    }

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

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getResponsePeople() {
        return responsePeople;
    }

    public void setResponsePeople(String responsePeople) {
        this.responsePeople = responsePeople;
    }

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Facility(Integer id, Date createTime, Date updateTime, String facilityType, String facilityName, String responsePeople, String phone, String shiliang, Integer villageId, String panoUrl) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.facilityType = facilityType;
        this.facilityName = facilityName;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.shiliang = shiliang;
        this.villageId = villageId;
        this.panoUrl = panoUrl;
    }
}
