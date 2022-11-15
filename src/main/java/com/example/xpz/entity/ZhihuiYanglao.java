package com.example.xpz.entity;

import java.util.Date;

public class ZhihuiYanglao {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String oldpeopleName;

    private Integer age;

    private String phone;

    private Integer isAlert;

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

    public String getOldpeopleName() {
        return oldpeopleName;
    }

    public void setOldpeopleName(String oldpeopleName) {
        this.oldpeopleName = oldpeopleName == null ? null : oldpeopleName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Integer isAlert) {
        this.isAlert = isAlert;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}