package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class trash {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer wushui;

    private Integer laji;

    private Integer wushuiRate;

    private Integer lajiRate;

    private Integer villageId;

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

    public Integer getWushui() {
        return wushui;
    }

    public void setWushui(Integer wushui) {
        this.wushui = wushui;
    }

    public Integer getLaji() {
        return laji;
    }

    public void setLaji(Integer laji) {
        this.laji = laji;
    }

    public Integer getWushuiRate() {
        return wushuiRate;
    }

    public void setWushuiRate(Integer wushuiRate) {
        this.wushuiRate = wushuiRate;
    }

    public Integer getLajiRate() {
        return lajiRate;
    }

    public void setLajiRate(Integer lajiRate) {
        this.lajiRate = lajiRate;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public trash(Integer id, Date createTime, Date updateTime, Integer wushui, Integer laji, Integer wushuiRate, Integer lajiRate, Integer villageId, Integer year) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.wushui = wushui;
        this.laji = laji;
        this.wushuiRate = wushuiRate;
        this.lajiRate = lajiRate;
        this.villageId = villageId;
        this.year = year;

    }
}
