package com.example.xpz.controller;

import com.example.xpz.service.DigitalIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalIndustry")
public class DigitalIndustryController {
    @Autowired
    DigitalIndustryService digitalIndustryService;

    @GetMapping("/digitalFactory")
    public String digitalFactory(HttpServletRequest request){
        return digitalIndustryService.selectDigitalFactoryByVillageId(1);
    }
    @GetMapping("/qicaiTianyuan")
    public String qicaiTianyuan(HttpServletRequest request){
        return digitalIndustryService.selectQicaiTianyuanByVillageId(1);
    }
    @GetMapping("/mimianJidi")
    public String mimianJidi(HttpServletRequest request){
        return digitalIndustryService.selectMimianJidiByVillageId(1);
    }
    @GetMapping("/chanyeJianshe")
    public String chanyeJianshe(HttpServletRequest request){
        return digitalIndustryService.selectChanyeJiansheByVillageId(1);
    }
    @GetMapping("/travelProgram")
    public String travelProgram(HttpServletRequest request){
        return digitalIndustryService.selectTravelProgramByVillageId(1);
    }
    @GetMapping("/agriculture")
    public String agriculture(HttpServletRequest request){
        return digitalIndustryService.selectAgricultureByVillageId(1);
    }

}
