package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PeopleStructure {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer zeroEighteen;

    private Integer nighteenThirtyfive;

    private Integer thirtyfiveSixtyfive;

    private Integer sixtyfiveEightyfive;

    private Integer overEightyfive;

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

    public Integer getZeroEighteen() {
        return zeroEighteen;
    }

    public void setZeroEighteen(Integer zeroEighteen) {
        this.zeroEighteen = zeroEighteen;
    }

    public Integer getNighteenThirtyfive() {
        return nighteenThirtyfive;
    }

    public void setNighteenThirtyfive(Integer nighteenThirtyfive) {
        this.nighteenThirtyfive = nighteenThirtyfive;
    }

    public Integer getThirtyfiveSixtyfive() {
        return thirtyfiveSixtyfive;
    }

    public void setThirtyfiveSixtyfive(Integer thirtyfiveSixtyfive) {
        this.thirtyfiveSixtyfive = thirtyfiveSixtyfive;
    }

    public Integer getSixtyfiveEightyfive() {
        return sixtyfiveEightyfive;
    }

    public void setSixtyfiveEightyfive(Integer sixtyfiveEightyfive) {
        this.sixtyfiveEightyfive = sixtyfiveEightyfive;
    }

    public Integer getOverEightyfive() {
        return overEightyfive;
    }

    public void setOverEightyfive(Integer overEightyfive) {
        this.overEightyfive = overEightyfive;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public PeopleStructure(Integer id, Date createTime, Date updateTime, Integer zeroEighteen, Integer nighteenThirtyfive, Integer thirtyfiveSixtyfive, Integer sixtyfiveEightyfive, Integer overEightyfive, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.zeroEighteen = zeroEighteen;
        this.nighteenThirtyfive = nighteenThirtyfive;
        this.thirtyfiveSixtyfive = thirtyfiveSixtyfive;
        this.sixtyfiveEightyfive = sixtyfiveEightyfive;
        this.overEightyfive = overEightyfive;
        this.villageId = villageId;
    }
}
