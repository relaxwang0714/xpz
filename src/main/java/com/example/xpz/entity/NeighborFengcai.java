package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class NeighborFengcai {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date upDateTime;

    private Integer villageId;

    private String mp4Url;

    private String mp4Name;

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

    public Date getUpDateTime() {
        return upDateTime;
    }

    public void setUpDateTime(Date upDateTime) {
        this.upDateTime = upDateTime;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getMp4Url() {
        return mp4Url;
    }

    public void setMp4Url(String mp4Url) {
        this.mp4Url = mp4Url;
    }

    public String getMp4Name() {
        return mp4Name;
    }

    public void setMp4Name(String mp4Name) {
        this.mp4Name = mp4Name;
    }

    public NeighborFengcai(Integer id, Date createTime, Date upDateTime, Integer villageId, String mp4Url, String mp4Name) {
        this.id = id;
        this.createTime = createTime;
        this.upDateTime = upDateTime;
        this.villageId = villageId;
        this.mp4Url = mp4Url;
        this.mp4Name = mp4Name;
    }
}
