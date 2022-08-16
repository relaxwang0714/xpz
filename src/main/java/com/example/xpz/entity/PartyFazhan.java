package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PartyFazhan {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer villageId;

    private Integer inParty;

    private Integer jijiPeople;

    private Integer fazhanPeople;

    private Integer yubeiPeople;

    private Integer year;

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

    public PartyFazhan(Integer id, Date createTime, Date updateTime, Integer villageId, Integer inParty, Integer jijiPeople, Integer fazhanPeople, Integer yubeiPeople, Integer year) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.villageId = villageId;
        this.inParty = inParty;
        this.jijiPeople = jijiPeople;
        this.fazhanPeople = fazhanPeople;
        this.yubeiPeople = yubeiPeople;
        this.year = year;
    }
}
