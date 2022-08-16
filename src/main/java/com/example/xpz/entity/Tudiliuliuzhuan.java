package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class Tudiliuliuzhuan {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private BigDecimal tudi_liuzhuan;
    private BigDecimal tudi_liuzhuan_rate;
    private Integer villageId;
    private String year;

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

    public BigDecimal getTudi_liuzhuan() {
        return tudi_liuzhuan;
    }

    public void setTudi_liuzhuan(BigDecimal tudi_liuzhuan) {
        this.tudi_liuzhuan = tudi_liuzhuan;
    }

    public BigDecimal getTudi_liuzhuan_rate() {
        return tudi_liuzhuan_rate;
    }

    public void setTudi_liuzhuan_rate(BigDecimal tudi_liuzhuan_rate) {
        this.tudi_liuzhuan_rate = tudi_liuzhuan_rate;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Tudiliuliuzhuan(Integer id, Date createTime, Date updateTime, BigDecimal tudi_liuzhuan, BigDecimal tudi_liuzhuan_rate, Integer villageId, String year) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.tudi_liuzhuan = tudi_liuzhuan;
        this.tudi_liuzhuan_rate = tudi_liuzhuan_rate;
        this.villageId = villageId;
        this.year = year;
    }
}
