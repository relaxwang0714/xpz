package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.data.relational.core.sql.In;

import java.util.Date;

public class Tingyuan {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private String huzhu;
    private String phone;
    private Integer star;
    private String cameraUrl;
    private Date age;
    private String address;
    private Integer villageId;

    private String shiliang;

    private String hh;

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

    public String getHuzhu() {
        return huzhu;
    }

    public void setHuzhu(String huzhu) {
        this.huzhu = huzhu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getCameraUrl() {
        return cameraUrl;
    }

    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
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

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang;
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public Tingyuan(Integer id, Date createTime, Date updateTime, String huzhu, String phone, Integer star, String cameraUrl, Date age, String address, Integer villageId, String shiliang, String hh) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.huzhu = huzhu;
        this.phone = phone;
        this.star = star;
        this.cameraUrl = cameraUrl;
        this.age = age;
        this.address = address;
        this.villageId = villageId;
        this.shiliang = shiliang;
        this.hh = hh;
    }
}
