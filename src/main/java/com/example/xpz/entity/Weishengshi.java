package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Weishengshi {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;

    private String address;

    private String responsePeople;

    private String phone;

    private Integer villageId;

    private String shiliang;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang;
    }

    public Weishengshi(Integer id, Date createTime, Date updateTime, String address, String responsePeople, String phone, Integer villageId, String shiliang) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.address = address;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.villageId = villageId;
        this.shiliang = shiliang;
    }
}
