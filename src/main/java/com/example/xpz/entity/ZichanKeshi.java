package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ZichanKeshi {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;
    private String fangwu;
    private String chengzuPeople;
    private String phone;
    private Integer area;
    private Integer guishu;
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
        this.fangwu = fangwu;
    }

    public String getChengzuPeople() {
        return chengzuPeople;
    }

    public void setChengzuPeople(String chengzuPeople) {
        this.chengzuPeople = chengzuPeople;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getGuishu() {
        return guishu;
    }

    public void setGuishu(Integer guishu) {
        this.guishu = guishu;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public ZichanKeshi(Integer id, Date createTime, Date updateTime, String fangwu, String chengzuPeople, String phone, Integer area, Integer guishu, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.fangwu = fangwu;
        this.chengzuPeople = chengzuPeople;
        this.phone = phone;
        this.area = area;
        this.guishu = guishu;
        this.villageId = villageId;
    }
}
