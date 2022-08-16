package com.example.xpz.entity;



import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Zichan {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer villageId;

    private Integer collectiveIncome;

    private Integer averageIncome;

    private Integer collectiveIncomeRate;

    private Integer averageIncomeRate;

    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Integer getCollectiveIncome() {
        return collectiveIncome;
    }

    public void setCollectiveIncome(Integer collectiveIncome) {
        this.collectiveIncome = collectiveIncome;
    }

    public Integer getAverageIncome() {
        return averageIncome;
    }

    public void setAverageIncome(Integer averageIncome) {
        this.averageIncome = averageIncome;
    }

    public Integer getCollectiveIncomeRate() {
        return collectiveIncomeRate;
    }

    public void setCollectiveIncomeRate(Integer collectiveIncomeRate) {
        this.collectiveIncomeRate = collectiveIncomeRate;
    }

    public Integer getAverageIncomeRate() {
        return averageIncomeRate;
    }

    public void setAverageIncomeRate(Integer averageIncomeRate) {
        this.averageIncomeRate = averageIncomeRate;
    }

    public Zichan(Integer id, Date createTime, Date updateTime, Integer villageId, Integer collectiveIncome, Integer averageIncome, Integer collectiveIncomeRate, Integer averageIncomeRate, Integer year) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.villageId = villageId;
        this.collectiveIncome = collectiveIncome;
        this.averageIncome = averageIncome;
        this.collectiveIncomeRate = collectiveIncomeRate;
        this.averageIncomeRate = averageIncomeRate;
        this.year = year;
    }
}
