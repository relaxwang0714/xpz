package com.example.xpz.entity;

import java.util.Date;

public class ChanyeJianshe {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer chejian;

    private Integer shengchanxian;

    private Integer area;

    private Integer year;

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

    public Integer getChejian() {
        return chejian;
    }

    public void setChejian(Integer chejian) {
        this.chejian = chejian;
    }

    public Integer getShengchanxian() {
        return shengchanxian;
    }

    public void setShengchanxian(Integer shengchanxian) {
        this.shengchanxian = shengchanxian;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}