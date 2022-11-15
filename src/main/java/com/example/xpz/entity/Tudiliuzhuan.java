package com.example.xpz.entity;

import java.util.Date;

public class Tudiliuzhuan {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Long tudiLiuzhuan;

    private Long tudiLiuzhuanRate;

    private Integer villageId;

    private String year;

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

    public Long getTudiLiuzhuan() {
        return tudiLiuzhuan;
    }

    public void setTudiLiuzhuan(Long tudiLiuzhuan) {
        this.tudiLiuzhuan = tudiLiuzhuan;
    }

    public Long getTudiLiuzhuanRate() {
        return tudiLiuzhuanRate;
    }

    public void setTudiLiuzhuanRate(Long tudiLiuzhuanRate) {
        this.tudiLiuzhuanRate = tudiLiuzhuanRate;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }
}