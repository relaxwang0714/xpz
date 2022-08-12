package com.example.xpz.controller;

import com.example.xpz.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Country")
public class CountryController {
    @Autowired
    CountryService countryService;
    @RequestMapping("/overview")
    public String overview(HttpServletRequest request) {
        return countryService.selectByPrimaryKey(1);
}
    @RequestMapping("/peopleStructure")
    public String peopleStructure(HttpServletRequest request) {
        return countryService.selectPeopleStructureByVillageId(1);
    }
    @RequestMapping("/style")
    public String style(HttpServletRequest request){
        return countryService.selectStyleByVillageId(1);
    }
    @RequestMapping("/culture")
    public String culture(HttpServletRequest request) {
        return countryService.selectPlaceByVillageId(1);
    }
    @RequestMapping("/Digital")
    public String place(HttpServletRequest request) {
        return countryService.selectDigitalByVillageId(1);
    }
    @RequestMapping("/feiyi")
    public String feiyi(HttpServletRequest request) {
        return countryService.selectFeiyiByVillageId(1);
    }
    @RequestMapping("/environment")
    public String environment(HttpServletRequest request) {
        return countryService.selectEnvironmentByVillageId(1);
    }
}
