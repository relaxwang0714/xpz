package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Country {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String profile;

    private BigDecimal collectiveIncome;

    private BigDecimal averageIncome;

    private BigDecimal averageIncomeRate;

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public BigDecimal getCollectiveIncome() {
        return collectiveIncome;
    }

    public void setCollectiveIncome(BigDecimal collectiveIncome) {
        this.collectiveIncome = collectiveIncome;
    }

    public BigDecimal getAverageIncome() {
        return averageIncome;
    }

    public void setAverageIncome(BigDecimal averageIncome) {
        this.averageIncome = averageIncome;
    }

    public BigDecimal getAverageIncomeRate() {
        return averageIncomeRate;
    }

    public void setAverageIncomeRate(BigDecimal averageIncomeRate) {
        this.averageIncomeRate = averageIncomeRate;
    }

    public Country(Integer id, Date createTime, Date updateTime, String profile, BigDecimal collectiveIncome, BigDecimal averageIncome, BigDecimal averageIncomeRate) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.profile = profile;
        this.collectiveIncome = collectiveIncome;
        this.averageIncome = averageIncome;
        this.averageIncomeRate = averageIncomeRate;
    }
}
