package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class TravelProgram {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String jindianName;

    private String responsePeople;

    private String phone;

    private Integer villageId;

    private Integer fangwenliang;

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

    public String getJindianName() {
        return jindianName;
    }

    public void setJindianName(String jindianName) {
        this.jindianName = jindianName;
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

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getFangwenliang() {
        return fangwenliang;
    }

    public void setFangwenliang(Integer fangwenliang) {
        this.fangwenliang = fangwenliang;
    }

    public TravelProgram(Integer id, Date createTime, Date updateTime, String jindianName, String responsePeople, String phone, Integer villageId, Integer fangwenliang) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.jindianName = jindianName;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.villageId = villageId;
        this.fangwenliang = fangwenliang;
    }
}
