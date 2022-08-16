package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class VillageManagement {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer villageId;

    private Integer programId;

    private String programArea;

    private String responsePeople;

    private String phone;

    private Integer carmeraId;

    private Integer isDelay;

    private Integer isNew;

    public Integer getIsDelay() {
        return isDelay;
    }

    public void setIsDelay(Integer isDelay) {
        this.isDelay = isDelay;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
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

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getProgramArea() {
        return programArea;
    }

    public void setProgramArea(String programArea) {
        this.programArea = programArea;
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

    public Integer getCarmeraId() {
        return carmeraId;
    }

    public void setCarmeraId(Integer carmeraId) {
        this.carmeraId = carmeraId;
    }

    public VillageManagement(Integer id, Date createTime, Date updateTime, Integer villageId, Integer programId, String programArea, String responsePeople, String phone, Integer carmeraId, Integer isDelay, Integer isNew) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.villageId = villageId;
        this.programId = programId;
        this.programArea = programArea;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.carmeraId = carmeraId;
        this.isDelay = isDelay;
        this.isNew = isNew;
    }
}
