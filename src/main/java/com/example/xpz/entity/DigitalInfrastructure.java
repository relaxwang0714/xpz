package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DigitalInfrastructure {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer villageId;

    private Integer FourGCover;

    private Integer BaseStation;

    private Integer internetRate;

    private Integer hundredInternetRate;

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

    public Integer getFourGCover() {
        return FourGCover;
    }

    public void setFourGCover(Integer fourGCover) {
        FourGCover = fourGCover;
    }

    public Integer getBaseStation() {
        return BaseStation;
    }

    public void setBaseStation(Integer baseStation) {
        BaseStation = baseStation;
    }

    public Integer getInternetRate() {
        return internetRate;
    }

    public void setInternetRate(Integer internetRate) {
        this.internetRate = internetRate;
    }

    public Integer getHundredInternetRate() {
        return hundredInternetRate;
    }

    public void setHundredInternetRate(Integer hundredInternetRate) {
        this.hundredInternetRate = hundredInternetRate;
    }

    public DigitalInfrastructure(Integer id, Date createTime, Date updateTime, Integer villageId, Integer fourGCover, Integer baseStation, Integer internetRate, Integer hundredInternetRate) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.villageId = villageId;
        FourGCover = fourGCover;
        BaseStation = baseStation;
        this.internetRate = internetRate;
        this.hundredInternetRate = hundredInternetRate;
    }
}
