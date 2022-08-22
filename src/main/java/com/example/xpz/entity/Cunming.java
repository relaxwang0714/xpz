package com.example.xpz.entity;

import java.util.Date;

public class Cunming {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private Integer sex;

    private String idCard;

    private Integer huhao;

    private String address;

    private String mingzu;

    private String phone;

    private String education;

    private Integer dangyuanId;

    private Integer villageId;

    private Integer wanggeId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getHuhao() {
        return huhao;
    }

    public void setHuhao(Integer huhao) {
        this.huhao = huhao;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMingzu() {
        return mingzu;
    }

    public void setMingzu(String mingzu) {
        this.mingzu = mingzu == null ? null : mingzu.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getDangyuanId() {
        return dangyuanId;
    }

    public void setDangyuanId(Integer dangyuanId) {
        this.dangyuanId = dangyuanId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getWanggeId() {
        return wanggeId;
    }

    public void setWanggeId(Integer wanggeId) {
        this.wanggeId = wanggeId;
    }
}