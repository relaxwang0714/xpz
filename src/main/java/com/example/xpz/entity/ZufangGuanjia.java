package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ZufangGuanjia {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private String huzhuName;
    private String address;
    private Integer isChuzu;
    private String phone;
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

    public String getHuzhuName() {
        return huzhuName;
    }

    public void setHuzhuName(String huzhuName) {
        this.huzhuName = huzhuName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsChuzu() {
        return isChuzu;
    }

    public void setIsChuzu(Integer isChuzu) {
        this.isChuzu = isChuzu;
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

    public ZufangGuanjia(Integer id, Date createTime, Date updateTime, String huzhuName, String address, Integer isChuzu, String phone, Integer villageId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.huzhuName = huzhuName;
        this.address = address;
        this.isChuzu = isChuzu;
        this.phone = phone;
        this.villageId = villageId;
    }
}
