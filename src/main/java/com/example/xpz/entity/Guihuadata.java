package com.example.xpz.entity;

import java.util.Date;

public class Guihuadata {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private String guihuaServiceName;

    private String guihuaServiceAddress;

    private Long villageId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getGuihuaServiceName() {
        return guihuaServiceName;
    }

    public void setGuihuaServiceName(String guihuaServiceName) {
        this.guihuaServiceName = guihuaServiceName == null ? null : guihuaServiceName.trim();
    }

    public String getGuihuaServiceAddress() {
        return guihuaServiceAddress;
    }

    public void setGuihuaServiceAddress(String guihuaServiceAddress) {
        this.guihuaServiceAddress = guihuaServiceAddress == null ? null : guihuaServiceAddress.trim();
    }

    public Long getVillageId() {
        return villageId;
    }

    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }
}