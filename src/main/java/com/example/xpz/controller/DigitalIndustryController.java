package com.example.xpz.controller;

import com.example.xpz.service.DigitalIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalIndustry")
public class DigitalIndustryController {
    @Autowired
    DigitalIndustryService digitalIndustryService;

    @RequestMapping("/digitalFactory")
    public String digitalFactory(HttpServletRequest request){
        return digitalIndustryService.selectDigitalFactoryByVillageId(1);
    }
    @RequestMapping("/qicaiTianyuan")
    public String qicaiTianyuan(HttpServletRequest request){
        return digitalIndustryService.selectQicaiTianyuanByVillageId(1);
    }
    @RequestMapping("/mimianJidi")
    public String mimianJidi(HttpServletRequest request){
        return digitalIndustryService.selectMimianJidiByVillageId(1);
    }
    @RequestMapping("/chanyeJianshe")
    public String chanyeJianshe(HttpServletRequest request){
        return digitalIndustryService.selectChanyeJiansheByVillageId(1);
    }
    @RequestMapping("/travelProgram")
    public String travelProgram(HttpServletRequest request){
        return digitalIndustryService.selectTravelProgramByVillageId(1);
    }
    @RequestMapping("/agriculture")
    public String agriculture(HttpServletRequest request){
        return digitalIndustryService.selectAgricultureByVillageId(1);
    }

}
