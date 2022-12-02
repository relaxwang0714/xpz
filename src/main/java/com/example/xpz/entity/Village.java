package com.example.xpz.entity;

import java.util.Date;

public class Village {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private String profile;

    private Long collectiveIncome;

    private Long averageIncome;

    private Long averageIncomeRate;

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public Long getCollectiveIncome() {
        return collectiveIncome;
    }

    public void setCollectiveIncome(Long collectiveIncome) {
        this.collectiveIncome = collectiveIncome;
    }

    public Long getAverageIncome() {
        return averageIncome;
    }

    public void setAverageIncome(Long averageIncome) {
        this.averageIncome = averageIncome;
    }

    public Long getAverageIncomeRate() {
        return averageIncomeRate;
    }

    public void setAverageIncomeRate(Long averageIncomeRate) {
        this.averageIncomeRate = averageIncomeRate;
    }
}