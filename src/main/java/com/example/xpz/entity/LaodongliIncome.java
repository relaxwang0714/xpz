package com.example.xpz.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class LaodongliIncome {
        private Integer id;
        @JSONField(format="yyyy-MM-dd HH:mm:ss")
        private Date createTime;
        @JSONField(format="yyyy-MM-dd HH:mm:ss")
        private Date updateTime;
        private BigDecimal siyinIncome;
        private BigDecimal qiyeIncome;
        private BigDecimal nongcunIncome;
        private Integer jidu;
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

        public BigDecimal getSiyinIncome() {
                return siyinIncome;
        }

        public void setSiyinIncome(BigDecimal siyinIncome) {
                this.siyinIncome = siyinIncome;
        }

        public BigDecimal getQiyeIncome() {
                return qiyeIncome;
        }

        public void setQiyeIncome(BigDecimal qiyeIncome) {
                this.qiyeIncome = qiyeIncome;
        }

        public BigDecimal getNongcunIncome() {
                return nongcunIncome;
        }

        public void setNongcunIncome(BigDecimal nongcunIncome) {
                this.nongcunIncome = nongcunIncome;
        }

        public Integer getJidu() {
                return jidu;
        }

        public void setJidu(Integer jidu) {
                this.jidu = jidu;
        }

        public Integer getVillageId() {
                return villageId;
        }

        public void setVillageId(Integer villageId) {
                this.villageId = villageId;
        }

        public LaodongliIncome(Integer id, Date createTime, Date updateTime, BigDecimal siyinIncome, BigDecimal qiyeIncome, BigDecimal nongcunIncome, Integer jidu, Integer villageId) {
                this.id = id;
                this.createTime = createTime;
                this.updateTime = updateTime;
                this.siyinIncome = siyinIncome;
                this.qiyeIncome = qiyeIncome;
                this.nongcunIncome = nongcunIncome;
                this.jidu = jidu;
                this.villageId = villageId;
        }
}
