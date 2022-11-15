package com.example.xpz.entity;

public class TingyuanWithBLOBs extends Tingyuan {
    private String cameraUrl;

    private String shiliang;

    public String getCameraUrl() {
        return cameraUrl;
    }

    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl == null ? null : cameraUrl.trim();
    }

    public String getShiliang() {
        return shiliang;
    }

    public void setShiliang(String shiliang) {
        this.shiliang = shiliang == null ? null : shiliang.trim();
    }
}