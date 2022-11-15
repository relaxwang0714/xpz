package com.example.xpz.entity;

import java.util.Date;

public class LvyouXiangmu {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String jindianName;

    private String responsePeople;

    private String phone;

    private Integer villageId;

    private Integer fangwenliang;

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

    public String getJindianName() {
        return jindianName;
    }

    public void setJindianName(String jindianName) {
        this.jindianName = jindianName == null ? null : jindianName.trim();
    }

    public String getResponsePeople() {
        return responsePeople;
    }

    public void setResponsePeople(String responsePeople) {
        this.responsePeople = responsePeople == null ? null : responsePeople.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getFangwenliang() {
        return fangwenliang;
    }

    public void setFangwenliang(Integer fangwenliang) {
        this.fangwenliang = fangwenliang;
    }
}