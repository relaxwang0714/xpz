package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class ZiyuanShouru {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private BigDecimal jumingIncome;
    private BigDecimal fangchanIncome;
    private BigDecimal tudiIncome;
    private Integer jidu;
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

    public BigDecimal getJumingIncome() {
        return jumingIncome;
    }

    public void setJumingIncome(BigDecimal jumingIncome) {
        this.jumingIncome = jumingIncome;
    }

    public BigDecimal getFangchanIncome() {
        return fangchanIncome;
    }

    public void setFangchanIncome(BigDecimal fangchanIncome) {
        this.fangchanIncome = fangchanIncome;
    }

    public BigDecimal getTudiIncome() {
        return tudiIncome;
    }

    public void setTudiIncome(BigDecimal tudiIncome) {
        this.tudiIncome = tudiIncome;
    }

    public Integer getJidu() {
        return jidu;
    }

    public void setJidu(Integer jidu) {
        this.jidu = jidu;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public ZiyuanShouru(Integer id, Date createTime, Date updateTime, BigDecimal jumingIncome, BigDecimal fangchanIncome, BigDecimal tudiIncome, Integer jidu, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.jumingIncome = jumingIncome;
        this.fangchanIncome = fangchanIncome;
        this.tudiIncome = tudiIncome;
        this.jidu = jidu;
        this.villageId = villageId;
    }
}
