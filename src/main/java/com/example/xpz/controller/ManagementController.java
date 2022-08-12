package com.example.xpz.controller;

import com.example.xpz.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/management")
public class ManagementController {
    @Autowired
    ManagementService managementService;
    @RequestMapping("/design")
    public String design(HttpServletRequest request){
        return managementService.selectDesignByByVillageId(1);
    }
    @RequestMapping("/current")
    public String current(HttpServletRequest request){
        return managementService.selectCurrentByByVillageId(1);
    }
    @RequestMapping("/guihua")
    public String guihua(HttpServletRequest request){
        return managementService.selectGuihuaByByVillageId(1);
    }
    @RequestMapping("/constrution")
    public String constrution(HttpServletRequest request){
        return managementService.selectConstructionByByVillageId(1);
    }
    @RequestMapping("/yujin")
    public String yujin(HttpServletRequest request){
        return managementService.selectCountyujinByByVillageId(1);
    }
    @RequestMapping("/gaizao")
    public String gaizao(HttpServletRequest request){
        return managementService.selectCountGaizaoByByVillageId(1);
    }

}
