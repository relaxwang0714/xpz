package com.example.xpz.entity;

import java.util.Date;

public class ZichanKeshi {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String fangwu;

    private String chengzuPeople;

    private String phone;

    private Integer area;

    private Integer isGuishu;

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

    public String getFangwu() {
        return fangwu;
    }

    public void setFangwu(String fangwu) {
        this.fangwu = fangwu == null ? null : fangwu.trim();
    }

    public String getChengzuPeople() {
        return chengzuPeople;
    }

    public void setChengzuPeople(String chengzuPeople) {
        this.chengzuPeople = chengzuPeople == null ? null : chengzuPeople.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getIsGuishu() {
        return isGuishu;
    }

    public void setIsGuishu(Integer isGuishu) {
        this.isGuishu = isGuishu;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}