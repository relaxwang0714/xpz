package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class WeishengBaojie {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private String name;
    private Integer is_luzhang;
    private String phone;
    private String traject;
    private Integer villageId;
    private String mc;

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

    public Integer getIs_luzhang() {
        return is_luzhang;
    }

    public void setIs_luzhang(Integer is_luzhang) {
        this.is_luzhang = is_luzhang;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTraject() {
        return traject;
    }

    public void setTraject(String traject) {
        this.traject = traject;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public WeishengBaojie(Integer id, Date createTime, Date updateTime, String name, Integer is_luzhang, String phone, String traject, Integer villageId, String mc) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.name = name;
        this.is_luzhang = is_luzhang;
        this.phone = phone;
        this.traject = traject;
        this.villageId = villageId;
        this.mc = mc;
    }
}
