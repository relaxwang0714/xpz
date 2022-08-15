package com.example.xpz.controller;

import com.example.xpz.service.DigitalGovernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalGovern")
public class DigitalGovernController {
    @Autowired
    DigitalGovernService digitalGovernService;
    @RequestMapping("/cunminManyidu")
    public String cunminManyidu(HttpServletRequest request){
        return digitalGovernService.selectCunminManyiduByVillageId(1);
    }
    @RequestMapping("/tingyuan")
    public String tingyuan(HttpServletRequest request){
        return digitalGovernService.selectTingyuanByVillageId(1);
    }
    @RequestMapping("/trashClassfication")
    public String trashClassfication(HttpServletRequest request){
        return digitalGovernService.selectTrashClassficationByVillageId(1);
    }
    @RequestMapping("/weishengBaojie")
    public String weishengBaojie(HttpServletRequest request){
        return digitalGovernService.selectWeishengBaojieByVillageId(1);
    }
    @RequestMapping("/weixinyuan")
    public String weixinyuan(HttpServletRequest request){
        return digitalGovernService.selectWeixinyuanByVillageId(1);
    }


}
