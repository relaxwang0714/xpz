package com.example.xpz.entity;

import java.util.Date;

public class Fangwu {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Integer huhao;

    private Integer type;

    private String shp;

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

    public Integer getHuhao() {
        return huhao;
    }

    public void setHuhao(Integer huhao) {
        this.huhao = huhao;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getShp() {
        return shp;
    }

    public void setShp(String shp) {
        this.shp = shp == null ? null : shp.trim();
    }
}