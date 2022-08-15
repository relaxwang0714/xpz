package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Weixinyuan {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;
    private String name;
    private String phone;
    private String weixinyuan;
    private String profile;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixinyuan() {
        return weixinyuan;
    }

    public void setWeixinyuan(String weixinyuan) {
        this.weixinyuan = weixinyuan;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Weixinyuan(Integer id, Date createTime, Date updateTime, String name, String phone, String weixinyuan, String profile, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.name = name;
        this.phone = phone;
        this.weixinyuan = weixinyuan;
        this.profile = profile;
        this.villageId = villageId;
    }
}
