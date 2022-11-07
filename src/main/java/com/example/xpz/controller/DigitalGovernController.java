package com.example.xpz.controller;

import com.example.xpz.service.DigitalGovernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalGovern")
public class DigitalGovernController {
    @Autowired
    DigitalGovernService digitalGovernService;
    @GetMapping("/cunminManyidu")
    public String cunminManyidu(HttpServletRequest request){
        return digitalGovernService.selectCunminManyiduByVillageId(1);
    }
    @GetMapping("/tingyuan")
    public String tingyuan(HttpServletRequest request){
        return digitalGovernService.selectTingyuanByVillageId(1);
    }
    @GetMapping("/trashClassfication")
    public String trashClassfication(HttpServletRequest request){
        return digitalGovernService.selectTrashClassficationByVillageId(1);
    }
    @GetMapping("/weishengBaojie/{isLuzhang}")
    public String weishengBaojie(HttpServletRequest request, @PathVariable("isLuzhang")Integer isLuzhang){
        return digitalGovernService.selectWeishengBaojieByVillageId(1,isLuzhang);
    }
    @GetMapping("/weixinyuan")
    public String weixinyuan(HttpServletRequest request){
        return digitalGovernService.selectWeixinyuanByVillageId(1);
    }


}
