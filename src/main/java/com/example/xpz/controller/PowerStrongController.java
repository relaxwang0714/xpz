package com.example.xpz.controller;

import com.example.xpz.service.PowerStrongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/powerStrong")
public class PowerStrongController {
    @Autowired
    PowerStrongService powerStrongService;
    @RequestMapping("/zufangGuan")
    public String zufangGuan(HttpServletRequest request){
        return powerStrongService.selectZufangGuanjiaByVillageId(1);
    }
    @RequestMapping("/zichanKeshi")
    public String zichanKeshi(HttpServletRequest request){
        return powerStrongService.selectZichanKeshiByVillageId(1);
    }
    @RequestMapping("/chengbao")
    public String chengbao(HttpServletRequest request){
        return powerStrongService.selectChengbaoByVillageId(1);
    }
    @RequestMapping("/chuangke")
    public String chuangke(HttpServletRequest request){
        return powerStrongService.selectChuangkeByVillageId(1);
    }
    @RequestMapping("/chuangyeProgram")
    public String chuangyeProgram(HttpServletRequest request){
        return powerStrongService.selectChuangyeProgramByVillageId(1);
    }

    @RequestMapping("/laodongliIncome")
    public String laodongliIncome(HttpServletRequest request){
        return powerStrongService.selectLaodongliIncomeByVillageId(1);
    }
    @RequestMapping("/ziyuanShouru")
    public String ziyuanShouru(HttpServletRequest request){
        return powerStrongService.selectZiyuanShouruByVillageId(1);
    }
    @RequestMapping("/teseChanpin")
    public String teseChanpin(HttpServletRequest request){
        return powerStrongService.selectTeseChanpinByVillageId(1);
    }
    @RequestMapping("/tudiliuliuzhuan")
    public String tudiliuliuzhuan(HttpServletRequest request){
        return powerStrongService.selectTudiliuliuzhuanByVillageId(1);
    }




}
