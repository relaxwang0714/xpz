package com.example.xpz.controller;

import com.example.xpz.service.DigitalIndustryService;
import com.example.xpz.service.DigitalServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalServices")
public class DigitalServicesController {
    @Autowired
    DigitalServicesService digitalServicesService;

    @RequestMapping("/dangAn")
    public String dangAn(HttpServletRequest request){
        return digitalServicesService.selectDangAnByVillageId(1);
    }
    @RequestMapping("/education")
    public String education(HttpServletRequest request){
        return digitalServicesService.selectEducationByVillageId(1);
    }
    @RequestMapping("/express")
    public String express(HttpServletRequest request){
        return digitalServicesService.selectExpressByVillageId(1);
    }
    @RequestMapping("/weishengshi")
    public String weishengshi(HttpServletRequest request){
        return digitalServicesService.selectWeishengshiByVillageId(1);
    }
    @RequestMapping("/neighbor")
    public String neighbor(HttpServletRequest request){
        return digitalServicesService.selectNeighborByVillageId(1);
    }
    @RequestMapping("/neighborFengcai")
    public String neighborFengcai(HttpServletRequest request){
        return digitalServicesService.selectNeighborFengcaiByVillageId(1);
    }
    @RequestMapping("/park")
    public String park(HttpServletRequest request){
        return digitalServicesService.selectParkByVillageId(1);
    }
    @RequestMapping("/yanglao")
    public String yanglao(HttpServletRequest request){
        return digitalServicesService.selectYanglaoByVillageId(1);
    }

}
