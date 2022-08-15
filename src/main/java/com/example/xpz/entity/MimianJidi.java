package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class MimianJidi {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;

    private String jidi;

    private Integer jidiId;

    private String responsePeople;

    private String phone;

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

    public String getJidi() {
        return jidi;
    }

    public void setJidi(String jidi) {
        this.jidi = jidi;
    }

    public Integer getJidiId() {
        return jidiId;
    }

    public void setJidiId(Integer jidiId) {
        this.jidiId = jidiId;
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

    public MimianJidi(Integer id, Date createTime, Date updateTime, String jidi, Integer jidiId, String responsePeople, String phone, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.jidi = jidi;
        this.jidiId = jidiId;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.villageId = villageId;
    }
}
