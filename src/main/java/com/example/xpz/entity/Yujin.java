package com.example.xpz.entity;

public class Yujin {
    private Integer normal;

    private Integer warn;

    private Integer lag;

    public Integer getNormal() {
        return normal;
    }

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    public Integer getWarn() {
        return warn;
    }

    public void setWarn(Integer warn) {
        this.warn = warn;
    }

    public Integer getLag() {
        return lag;
    }

    public void setLag(Integer lag) {
        this.lag = lag;
    }

    public Yujin(Integer normal, Integer warn, Integer lag) {
        this.normal = normal;
        this.warn = warn;
        this.lag = lag;
    }
}
