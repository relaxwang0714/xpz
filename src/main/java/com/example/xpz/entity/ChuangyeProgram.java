package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ChuangyeProgram {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;
    private Integer chuangkeId;
    private String programName;
    private String phone;
    private Integer villageId;
    private String name;

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

    public Integer getChuangkeId() {
        return chuangkeId;
    }

    public void setChuangkeId(Integer chuangkeId) {
        this.chuangkeId = chuangkeId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChuangyeProgram(Integer id, Date createTime, Date updateTime, Integer chuangkeId, String programName, String phone, Integer villageId, String name) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.chuangkeId = chuangkeId;
        this.programName = programName;
        this.phone = phone;
        this.villageId = villageId;
        this.name = name;
    }
}
