package com.example.xpz.entity;

import java.util.Date;

public class Design {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private String designServiceName;

    private String designServiceAddress;

    private String longitude;

    private String latitude;

    private Integer height;

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

    public String getDesignServiceName() {
        return designServiceName;
    }

    public void setDesignServiceName(String designServiceName) {
        this.designServiceName = designServiceName == null ? null : designServiceName.trim();
    }

    public String getDesignServiceAddress() {
        return designServiceAddress;
    }

    public void setDesignServiceAddress(String designServiceAddress) {
        this.designServiceAddress = designServiceAddress == null ? null : designServiceAddress.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}