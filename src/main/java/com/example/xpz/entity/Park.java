package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Park {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date upDateTime;

    private String stopArea;

    private String responsePeople;

    private String phone;

    private Integer leave;

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

    public Date getUpDateTime() {
        return upDateTime;
    }

    public void setUpDateTime(Date upDateTime) {
        this.upDateTime = upDateTime;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getStopArea() {
        return stopArea;
    }

    public void setStopArea(String stopArea) {
        this.stopArea = stopArea;
    }

    public String getResponsePeople() {
        return responsePeople;
    }

    public void setResponsePeople(String responsePeople) {
        this.responsePeople = responsePeople;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        this.leave = leave;
    }

    public Park(Integer id, Date createTime, Date upDateTime, String stopArea, String responsePeople, String phone, Integer leave, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.upDateTime = upDateTime;
        this.stopArea = stopArea;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.leave = leave;
        this.villageId = villageId;
    }
}
