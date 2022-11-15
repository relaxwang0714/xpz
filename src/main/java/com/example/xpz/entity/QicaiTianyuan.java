package com.example.xpz.entity;

import java.util.Date;

public class QicaiTianyuan {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String tianyuanName;

    private String zuowuType;

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
        this.tianyuanName = tianyuanName == null ? null : tianyuanName.trim();
    }

    public String getZuowuType() {
        return zuowuType;
    }

    public void setZuowuType(String zuowuType) {
        this.zuowuType = zuowuType == null ? null : zuowuType.trim();
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
        this.cameraUrl = cameraUrl == null ? null : cameraUrl.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}