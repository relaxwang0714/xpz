package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Agriculture {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;

    private String business;

    private String dianzhu;

    private String phone;

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

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getDianzhu() {
        return dianzhu;
    }

    public void setDianzhu(String dianzhu) {
        this.dianzhu = dianzhu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Agriculture(Integer id, Date createTime, Date updateTime, String business, String dianzhu, String phone, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.business = business;
        this.dianzhu = dianzhu;
        this.phone = phone;
        this.villageId = villageId;
    }
}
