package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class DigitalFactory {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String factoryName;

    private String responsePeople;

    private String phone;

    private String cameraUrl;

    private Integer village_id;

    private String shiliang;

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

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getResponsePeople() {
        return responsePeople;
    }

    public void setResponsePeople(String responsePeople) {
        this.responsePeople = responsePeople;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCameraUrl() {
        return cameraUrl;
    }

    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl;
    }

    public Integer getVillage_id() {
        return village_id;
    }

    public void setVillage_id(Integer village_id) {
        this.village_id = village_id;
    }

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang;
    }

    public DigitalFactory(Integer id, Date createTime, Date updateTime, String factoryName, String responsePeople, String phone, String cameraUrl, Integer village_id, String shiliang) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.factoryName = factoryName;
        this.responsePeople = responsePeople;
        this.phone = phone;
        this.cameraUrl = cameraUrl;
        this.village_id = village_id;
        this.shiliang = shiliang;
    }
}
