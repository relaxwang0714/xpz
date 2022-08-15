package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class CunminManyidu {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss+08:00")
    private Date updateTime;
    private Integer lajiFenlei;
    private Integer cunrongCunmao;
    private Integer yingjiJiuzhu;
    private Integer qinglianZaixian;
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

    public Integer getLajiFenlei() {
        return lajiFenlei;
    }

    public void setLajiFenlei(Integer lajiFenlei) {
        this.lajiFenlei = lajiFenlei;
    }

    public Integer getCunrongCunmao() {
        return cunrongCunmao;
    }

    public void setCunrongCunmao(Integer cunrongCunmao) {
        this.cunrongCunmao = cunrongCunmao;
    }

    public Integer getYingjiJiuzhu() {
        return yingjiJiuzhu;
    }

    public void setYingjiJiuzhu(Integer yingjiJiuzhu) {
        this.yingjiJiuzhu = yingjiJiuzhu;
    }

    public Integer getQinglianZaixian() {
        return qinglianZaixian;
    }

    public void setQinglianZaixian(Integer qinglianZaixian) {
        this.qinglianZaixian = qinglianZaixian;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public CunminManyidu(Integer id, Date createTime, Date updateTime, Integer lajiFenlei, Integer cunrongCunmao, Integer yingjiJiuzhu, Integer qinglianZaixian, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lajiFenlei = lajiFenlei;
        this.cunrongCunmao = cunrongCunmao;
        this.yingjiJiuzhu = yingjiJiuzhu;
        this.qinglianZaixian = qinglianZaixian;
        this.villageId = villageId;
    }

}
