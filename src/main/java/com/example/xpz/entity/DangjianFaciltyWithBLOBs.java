package com.example.xpz.entity;

public class DangjianFaciltyWithBLOBs extends DangjianFacilty {
    private String shiliang;

    private String panoUrl;

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang == null ? null : shiliang.trim();
    }

    public String getPanoUrl() {
        return panoUrl;
    }

    public void setPanoUrl(String panoUrl) {
        this.panoUrl = panoUrl == null ? null : panoUrl.trim();
    }
}