package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class QicaiTianyuan {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;

    private String tianyuanName;

    private String zuowuTyep;

    private Integer zhandi;

    private String cameraUrl;

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

    public String getTianyuanName() {
        return tianyuanName;
    }

    public void setTianyuanName(String tianyuanName) {
        this.tianyuanName = tianyuanName;
    }

    public String getZuowuTyep() {
        return zuowuTyep;
    }

    public void setZuowuTyep(String zuowuTyep) {
        this.zuowuTyep = zuowuTyep;
    }

    public Integer getZhandi() {
        return zhandi;
    }

    public void setZhandi(Integer zhandi) {
        this.zhandi = zhandi;
    }


    public String getCameraUrl() {
        return cameraUrl;
    }

    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public QicaiTianyuan(Integer id, Date createTime, Date updateTime, String tianyuanName, String zuowuTyep, Integer zhandi, String cameraUrl, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.tianyuanName = tianyuanName;
        this.zuowuTyep = zuowuTyep;
        this.zhandi = zhandi;
        this.cameraUrl = cameraUrl;
        this.villageId = villageId;
    }
}
