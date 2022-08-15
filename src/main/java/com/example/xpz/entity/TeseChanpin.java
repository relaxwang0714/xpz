package com.example.xpz.entity;

import java.util.Date;

public class TeseChanpin {
    private Integer id;
    private Date createTime;
    private Date updateTime;
    private String picUrl;
    private String picName;
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

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public TeseChanpin(Integer id, Date createTime, Date updateTime, String picUrl, String picName, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.picUrl = picUrl;
        this.picName = picName;
        this.villageId = villageId;
    }
}
