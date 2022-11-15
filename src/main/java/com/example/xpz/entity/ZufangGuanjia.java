package com.example.xpz.entity;

import java.util.Date;

public class ZufangGuanjia {
    private Integer id;

    private Date createTime;

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
        this.huzhuName = huzhuName == null ? null : huzhuName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}