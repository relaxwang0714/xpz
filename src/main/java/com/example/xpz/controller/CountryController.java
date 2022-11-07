package com.example.xpz.controller;

import com.example.xpz.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Country")
public class CountryController {
    @Autowired
    CountryService countryService;
    @GetMapping("/overview")
    public String overview(HttpServletRequest request) {
        return countryService.selectByPrimaryKey(1);
}
    @GetMapping("/peopleStructure")
    public String peopleStructure(HttpServletRequest request) {
        return countryService.selectPeopleStructureByVillageId(1);
    }
    @GetMapping("/style")
    public String style(HttpServletRequest request){
        return countryService.selectStyleByVillageId(1);
    }
    @GetMapping("/culture")
    public String culture(HttpServletRequest request) {
        return countryService.selectPlaceByVillageId(1);
    }
    @GetMapping("/Digital")
    public String place(HttpServletRequest request) {
        return countryService.selectDigitalByVillageId(1);
    }
    @GetMapping("/feiyi")
    public String feiyi(HttpServletRequest request) {
        return countryService.selectFeiyiByVillageId(1);
    }
    @GetMapping("/fangwu")
    public String fangwu(HttpServletRequest request) {
        return countryService.selectFangwuByVillageId(1);
    }
    @GetMapping("/cunming/{huhao}")
    public String fangwu(HttpServletRequest request, @PathVariable("huhao") Integer huhao) {
        return countryService.selectCunmingByHuhao(1,huhao);
    }
    @GetMapping("/dangyuan/{huhao}")
    public String fangwu(HttpServletRequest request, @PathVariable("huhao")String huhao) {
        return countryService.selectDangyuanByHuhao(1,huhao);
    }
    @GetMapping("/environment")
    public String environment(HttpServletRequest request) {
        return countryService.selectEnvironmentByVillageId(1);
    }
}
