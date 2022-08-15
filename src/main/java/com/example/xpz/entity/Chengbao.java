package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.data.relational.core.sql.In;

import java.util.Date;

public class Chengbao {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;
    private String chengbaoPeople;
    private String phone;
    private Integer area;
    private String address;
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

    public String getChengbaoPeople() {
        return chengbaoPeople;
    }

    public void setChengbaoPeople(String chengbaoPeople) {
        this.chengbaoPeople = chengbaoPeople;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Chengbao(Integer id, Date createTime, Date updateTime, String chengbaoPeople, String phone, Integer area, String address, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.chengbaoPeople = chengbaoPeople;
        this.phone = phone;
        this.area = area;
        this.address = address;
        this.villageId = villageId;
    }
}
