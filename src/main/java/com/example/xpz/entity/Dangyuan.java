package com.example.xpz.entity;

import java.util.Date;

public class Dangyuan {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String idCard;

    private String huhao;

    private String birth;

    private Date jointime;

    private String dzb;

    private Integer sex;

    private Integer wanggeId;

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getHuhao() {
        return huhao;
    }

    public void setHuhao(String huhao) {
        this.huhao = huhao == null ? null : huhao.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public String getDzb() {
        return dzb;
    }

    public void setDzb(String dzb) {
        this.dzb = dzb == null ? null : dzb.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getWanggeId() {
        return wanggeId;
    }

    public void setWanggeId(Integer wanggeId) {
        this.wanggeId = wanggeId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}