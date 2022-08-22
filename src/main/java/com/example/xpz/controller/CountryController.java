package com.example.xpz.controller;

import com.example.xpz.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("/fangwu")
    public String fangwu(HttpServletRequest request) {
        return countryService.selectFangwuByVillageId(1);
    }
    @RequestMapping("/cunming/{huhao}")
    public String fangwu(HttpServletRequest request, @PathVariable("huhao") Integer huhao) {
        return countryService.selectCunmingByHuhao(1,huhao);
    }
    @RequestMapping("/dangyuan/{huhao}")
    public String fangwu(HttpServletRequest request, @PathVariable("huhao")String huhao) {
        return countryService.selectDangyuanByHuhao(1,huhao);
    }
    @RequestMapping("/environment")
    public String environment(HttpServletRequest request) {
        return countryService.selectEnvironmentByVillageId(1);
    }
}
