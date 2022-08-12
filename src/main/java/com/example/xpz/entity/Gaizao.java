package com.example.xpz.entity;

public class Gaizao {
    private Integer gaizao;
    private Integer xinzeng;

    public Integer getGaizao() {
        return gaizao;
    }

    public void setGaizao(Integer gaizao) {
        this.gaizao = gaizao;
    }

    public Integer getXinzeng() {
        return xinzeng;
    }

    public void setXinzeng(Integer xinzeng) {
        this.xinzeng = xinzeng;
    }

    public Gaizao(Integer gaizao, Integer xinzeng) {
        this.gaizao = gaizao;
        this.xinzeng = xinzeng;
    }
}
