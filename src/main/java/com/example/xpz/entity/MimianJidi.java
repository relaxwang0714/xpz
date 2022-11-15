package com.example.xpz.entity;

import java.util.Date;

public class MimianJidi {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String jidi;

    private Integer jidiId;

    private String responsePeople;

    private String phone;

    private Integer villageId;

    private String shiliang;

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

    public String getJidi() {
        return jidi;
    }

    public void setJidi(String jidi) {
        this.jidi = jidi == null ? null : jidi.trim();
    }

    public Integer getJidiId() {
        return jidiId;
    }

    public void setJidiId(Integer jidiId) {
        this.jidiId = jidiId;
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

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang == null ? null : shiliang.trim();
    }
}