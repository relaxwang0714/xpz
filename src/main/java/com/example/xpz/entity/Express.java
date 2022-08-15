package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.data.relational.core.sql.In;

import java.util.Date;

public class Express {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;

    private String name;

    private String responsePeople;

    private String phone;

    private String address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Express(Integer id, Date createTime, Date updateTime, String name, String responsePeople, String phone, String address, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.name = name;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.address = address;
        this.villageId = villageId;
    }
}
