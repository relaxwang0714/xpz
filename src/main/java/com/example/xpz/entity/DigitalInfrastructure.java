package com.example.xpz.entity;

import java.util.Date;

public class DigitalInfrastructure {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Integer villageId;

    private Integer fourgCover;

    private Integer baseStation;

    private Integer internetRate;

    private Integer hundredInternetRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getfourgCover() {
        return fourgCover;
    }

    public void setfourgCover(Integer fourgCover) {
        this.fourgCover = fourgCover;
    }

    public Integer getBaseStation() {
        return baseStation;
    }

    public void setBaseStation(Integer baseStation) {
        this.baseStation = baseStation;
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
}