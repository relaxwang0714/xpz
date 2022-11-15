package com.example.xpz.controller;

import com.example.xpz.entity.*;
import com.example.xpz.service.DigitalIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalIndustry")
public class DigitalIndustryController {
    @Autowired
    DigitalIndustryService digitalIndustryService;

    @GetMapping("/digitalFactory")
    public String digitalFactorySelect(HttpServletRequest request){
        return digitalIndustryService.selectDigitalFactory();
    }
    @PutMapping("/digitalFactory/{id}")
    public String digitalFactoryUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody DigitalFactory digitalFactory){
        return digitalIndustryService.updateDigitalFactory(id,digitalFactory);
    }
    @PostMapping("/digitalFactory")
    public String digitalFactoryInsert(HttpServletRequest request,@RequestBody DigitalFactory digitalFactory){
        return digitalIndustryService.insertDigitalFactory(digitalFactory);
    }
    @DeleteMapping("/digitalFactory/{id}")
    public String digitalFactoryDelete(HttpServletRequest request, @PathVariable("id")Integer id){
        return digitalIndustryService.deleteDigitalFactory(id);
    }
    @GetMapping("/qicaiTianyuan")
    public String qicaiTianyuanSelect(HttpServletRequest request){
        return digitalIndustryService.selectQicaiTianyuan();
    }
    @PutMapping("/qicaiTianyuan/{id}")
    public String qicaiTianyuanUpdate(HttpServletRequest request,@PathVariable("id")Integer id, @RequestBody QicaiTianyuan qicaiTianyuan){
        return digitalIndustryService.updateQicaiTianyuan(id,qicaiTianyuan);
    }
    @PostMapping("/qicaiTianyuan")
    public String qicaiTianyuanInsert(HttpServletRequest request, @RequestBody QicaiTianyuan qicaiTianyuan){
        return digitalIndustryService.insertQicaiTianyuan(qicaiTianyuan);
    }
    @DeleteMapping("/qicaiTianyuan/{id}")
    public String qicaiTianyuanDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalIndustryService.deleteQicaiTianyuan(id);
    }
    @GetMapping("/mimianJidi")
    public String mimianJidiSelect(HttpServletRequest request){
        return digitalIndustryService.selectMimianJidi();
    }
    @PostMapping("/mimianJidi")
    public String mimianJidiInsert(HttpServletRequest request, @RequestBody MimianJidi mimianJidi){
        return digitalIndustryService.insertMimianJidi(mimianJidi);
    }
    @PutMapping("/mimianJidi/{id}")
    public String mimianJidiUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody MimianJidi mimianJidi){
        return digitalIndustryService.updateMimianJidi(id,mimianJidi);
    }
    @DeleteMapping("/mimianJidi/{id}")
    public String mimianJidiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalIndustryService.deleteMimianJidi(id);
    }
    @GetMapping("/chanyeJianshe")
    public String chanyeJianshe(HttpServletRequest request){
        return digitalIndustryService.selectChanyeJianshe();
    }
    @PutMapping("/chanyeJianshe/{id}")
    public String chanyeJiansheUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody ChanyeJianshe chanyeJianshe){
        return digitalIndustryService.updateChanyeJianshe(id,chanyeJianshe);
    }
    @PostMapping("/chanyeJianshe")
    public String chanyeJiansheInsert(HttpServletRequest request,@RequestBody ChanyeJianshe chanyeJianshe){
        return digitalIndustryService.insertChanyeJianshe(chanyeJianshe);
    }
    @DeleteMapping("/chanyeJianshe/{id}")
    public String chanyeJiansheDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalIndustryService.deleteChanyeJianshe(id);
    }
    @GetMapping("/travelProgram")
    public String travelProgramSelect(HttpServletRequest request){
        return digitalIndustryService.selectLvyouXiangmu();
    }
    @PutMapping("/travelProgram/{id}")
    public String travelProgramUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody LvyouXiangmu lvyouXiangmu){
        return digitalIndustryService.updateLvyouXiangmu(id,lvyouXiangmu);
    }
    @PostMapping("/travelProgram")
    public String travelProgramInsert(HttpServletRequest request,@RequestBody LvyouXiangmu lvyouXiangmu){
        return digitalIndustryService.insertLvyouXiangmu(lvyouXiangmu);
    }
    @DeleteMapping("/travelProgram/{id}")
    public String travelProgramDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalIndustryService.deleteAgriculture(id);
    }

    @GetMapping("/agriculture")
    public String agricultureSelect(HttpServletRequest request){
        return digitalIndustryService.selectAgriculture();
    }
    @PutMapping("/agriculture/{id}")
    public String agricultureUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody Agriculture agriculture){
        return digitalIndustryService.updateAgriculture(id,agriculture);
    }
    @PostMapping("/agriculture")
    public String agricultureInsert(HttpServletRequest request,@RequestBody Agriculture agriculture){
        return digitalIndustryService.insertAgriculture(agriculture);
    }
    @DeleteMapping("/agriculture/{id}")
    public String agricultureDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalIndustryService.deleteAgriculture(id);
    }

}
