package com.example.xpz.entity;

import java.util.Date;

public class WeishengBaojie {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private Integer isLuzhang;

    private String phone;

    private Integer villageId;

    private String mc;

    private String traject;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getIsLuzhang() {
        return isLuzhang;
    }

    public void setIsLuzhang(Integer isLuzhang) {
        this.isLuzhang = isLuzhang;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
        this.mc = mc == null ? null : mc.trim();
    }

    public String getTraject() {
        return traject;
    }

    public void setTraject(String traject) {
        this.traject = traject == null ? null : traject.trim();
    }
}