package com.example.xpz.controller;

import com.example.xpz.entity.*;
import com.example.xpz.service.DigitalIndustryService;
import com.example.xpz.service.DigitalServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalServices")
public class DigitalServicesController {
    @Autowired
    DigitalServicesService digitalServicesService;

    @GetMapping("/dangAn")
    public String danganSelect(HttpServletRequest request){
        return digitalServicesService.selectDangan();
    }
    @PutMapping("/dangAn/{id}")
    public String danganUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Dangan dangan){
        return digitalServicesService.updateDangan(id, dangan);
    }
    @PostMapping("/dangAn")
    public String danganInsert(HttpServletRequest request,@RequestBody Dangan dangan){
        return digitalServicesService.insertDangan(dangan);
    }
    @DeleteMapping("/dangAn/{id}")
    public String danganDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalServicesService.deleteDangan(id);
    }
    @GetMapping("/education")
    public String educationSelect(HttpServletRequest request){
        return digitalServicesService.selectEducation();
    }
    @PutMapping("/education/{id}")
    public String educationUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Education education){
        return digitalServicesService.updateEducation(id,education);
    }
    @PostMapping("/education")
    public String educationInsert(HttpServletRequest request, @RequestBody Education education){
        return digitalServicesService.insertEducation(education);
    }
    @DeleteMapping("/education/{id}")
    public String educationDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalServicesService.deleteEducation(id);
    }
    @GetMapping("/express")
    public String expressSelect(HttpServletRequest request){
        return digitalServicesService.selectKuaidi();
    }
    @PutMapping("/express")
    public String expressUpdate(HttpServletRequest request, @PathVariable("id")Long id, @RequestBody Kuaidi kuaidi){
        return digitalServicesService.updateKuaidi(id,kuaidi);
    }
    @PostMapping("/express")
    public String expressInsert(HttpServletRequest request,@RequestBody Kuaidi kuaidi){
        return digitalServicesService.insertKuaidi(kuaidi);
    }
    @DeleteMapping("/express")
    public String expressDelete(HttpServletRequest request,@PathVariable("id")Long id){
        return digitalServicesService.deleteKuaidi(id);
    }
    @GetMapping("/weishengshi")
    public String weishengshiSelect(HttpServletRequest request){
        return digitalServicesService.selectWeishengshi();
    }
    @PutMapping("/weishengshi")
    public String weishengshiUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Weishengshi weishengshi){
        return digitalServicesService.updateWeishengshi(id,weishengshi);
    }
    @PostMapping("/weishengshi")
    public String weishengshiInsert(HttpServletRequest request,@RequestBody Weishengshi weishengshi){
        return digitalServicesService.insertWeishengshi(weishengshi);
    }
    @DeleteMapping("/weishengshi")
    public String weishengshiDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalServicesService.deleteWeishengshi(id);
    }
    @GetMapping("/neighbor")
    public String neighborSelect(HttpServletRequest request){
        return digitalServicesService.selectNeighbour();
    }
    @PutMapping("/neighbor")
    public String neighborUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Neighbour neighbour){
        return digitalServicesService.updateNeighbour(id,neighbour);
    }
    @PostMapping("/neighbor")
    public String neighborInsert(HttpServletRequest request,@RequestBody Neighbour neighbour){
        return digitalServicesService.insertNeighbour(neighbour);
    }
    @DeleteMapping("/neighbor")
    public String neighborDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalServicesService.deleteNeighbour(id);
    }
    @GetMapping("/neighborFengcai")
    public String neighborFengcaiSelect(HttpServletRequest request){
        return digitalServicesService.selectNeighbourfengcai();
    }
    @PutMapping("/neighborFengcai")
    public String neighborFengcaiUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody Neighbourfengcai neighbourfengcai){
        return digitalServicesService.updateNeighbourfengcai(id,neighbourfengcai);
    }
    @PostMapping("/neighborFengcai")
    public String neighborFengcaiInsert(HttpServletRequest request,@RequestBody Neighbourfengcai neighbourfengcai){
        return digitalServicesService.insertNeighbourfengcai(neighbourfengcai);
    }
    @DeleteMapping("/neighborFengcai")
    public String neighborFengcaiDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalServicesService.deleteNeighbour(id);
    }
    @GetMapping("/park")
    public String parkSelect(HttpServletRequest request){
        return digitalServicesService.selectPark();
    }
    @PutMapping("/park")
    public String parkUpdate(HttpServletRequest request,@PathVariable("id")Long id,@RequestBody Park park){
        return digitalServicesService.updatePark(id,park);
    }
    @PostMapping("/park")
    public String parkInsert(HttpServletRequest request,@RequestBody Park park){
        return digitalServicesService.insertPark(park);
    }
    @DeleteMapping("/park")
    public String parkDelete(HttpServletRequest request,@PathVariable("id")Long id){
        return digitalServicesService.deletePark(id);
    }
    @GetMapping("/yanglao")
    public String yanglaoSelect(HttpServletRequest request){
        return digitalServicesService.selectZhihuiYanglao();
    }
    @PutMapping("/yanglao")
    public String yanglaoUpdate(HttpServletRequest request,@PathVariable("id")Integer id,@RequestBody ZhihuiYanglao zhihuiYanglao){
        return digitalServicesService.updateZhihuiYanglao(id,zhihuiYanglao);
    }
    @PostMapping("/yanglao")
    public String yanglaoInsert(HttpServletRequest request,@RequestBody ZhihuiYanglao zhihuiYanglao){
        return digitalServicesService.insertZhihuiYanglao(zhihuiYanglao);
    }
    @DeleteMapping("/yanglao")
    public String yanglaoDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalServicesService.deleteZhihuiYanglao(id);
    }


}
