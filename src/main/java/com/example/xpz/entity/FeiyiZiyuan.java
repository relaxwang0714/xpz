package com.example.xpz.entity;

import java.util.Date;

public class FeiyiZiyuan {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private String mp4Url;

    private String mp4Name;

    private Integer villageId;

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

    public String getMp4Url() {
        return mp4Url;
    }

    public void setMp4Url(String mp4Url) {
        this.mp4Url = mp4Url == null ? null : mp4Url.trim();
    }

    public String getMp4Name() {
        return mp4Name;
    }

    public void setMp4Name(String mp4Name) {
        this.mp4Name = mp4Name == null ? null : mp4Name.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}