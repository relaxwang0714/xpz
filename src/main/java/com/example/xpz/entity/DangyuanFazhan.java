package com.example.xpz.entity;

import java.util.Date;

public class DangyuanFazhan {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Integer villageId;

    private Integer inParty;

    private Integer jijiPeople;

    private Integer fazhanPeople;

    private Integer yubeiPeople;

    private Integer year;

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

    public Integer getInParty() {
        return inParty;
    }

    public void setInParty(Integer inParty) {
        this.inParty = inParty;
    }

    public Integer getJijiPeople() {
        return jijiPeople;
    }

    public void setJijiPeople(Integer jijiPeople) {
        this.jijiPeople = jijiPeople;
    }

    public Integer getFazhanPeople() {
        return fazhanPeople;
    }

    public void setFazhanPeople(Integer fazhanPeople) {
        this.fazhanPeople = fazhanPeople;
    }

    public Integer getYubeiPeople() {
        return yubeiPeople;
    }

    public void setYubeiPeople(Integer yubeiPeople) {
        this.yubeiPeople = yubeiPeople;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}