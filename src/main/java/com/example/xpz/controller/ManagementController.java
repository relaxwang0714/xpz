package com.example.xpz.controller;

import com.example.xpz.entity.ConstructionList;
import com.example.xpz.entity.Currentdata;
import com.example.xpz.entity.Design;
import com.example.xpz.entity.Guihuadata;
import com.example.xpz.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/management")
public class ManagementController {
    @Autowired
    ManagementService managementService;
    @GetMapping("/design")
    public String designSelect(HttpServletRequest request){
        return managementService.selectDesign();
    }
    @PutMapping("/design/{id}")
    public String designUpdate(HttpServletRequest request, @PathVariable("id")Long id, @RequestBody Design design){
        return managementService.updateDesign(id, design);
    }
    @PostMapping("/design")
    public String designInsert(HttpServletRequest request,@RequestBody Design design){
        return managementService.insertDesign(design);
    }
    @DeleteMapping("/design/{id}")
    public String designDelete(HttpServletRequest request,@PathVariable("id") Long id){
        return managementService.deleteDesign(id);
    }
    @GetMapping("/current")
    public String currentSelect(HttpServletRequest request){
        return managementService.selectCurrentdata();
    }
    @PostMapping("/current")
    public String currentInsert(HttpServletRequest request, @RequestBody Currentdata currentdata){
        return managementService.insertCurrentdata(currentdata);
    }
    @PutMapping("/current/{id}")
    public String currentUpdate(HttpServletRequest request,@RequestBody Currentdata currentdata,@PathVariable("id")Integer id){
        return managementService.updateCurrentdata(id,currentdata);
    }
    @DeleteMapping("/current/{id}")
    public String currentDelete(HttpServletRequest request, @PathVariable("id")Integer id){
        return managementService.deleteCurrentdata(id);
    }
    @GetMapping("/guihua")
    public String guihuaSelect(HttpServletRequest request){
        return managementService.selectGuihuadata();
    }
    @PostMapping("/guihua")
    public String guihuaInsert(HttpServletRequest request,@RequestBody Guihuadata guihuadata){
        return managementService.insertGuihuadata(guihuadata);
    }
    @PutMapping("/guihua/{id}")
    public String guihuaUpdate(HttpServletRequest request, @PathVariable("id")Long id, @RequestBody Guihuadata guihuadata){
        return managementService.updateGuihuadata(id,guihuadata);
    }
    @DeleteMapping("/guihua/{id}")
    public String guihuaDelete(HttpServletRequest request,@PathVariable("id")Long id){
        return managementService.deleteGuihuadata(id);
    }
    @GetMapping("/constrution")
    public String construtionSelect(HttpServletRequest request){
        return managementService.selectConstructionlist();
    }
    @PostMapping("/constrution")
    public String construtionInsert(HttpServletRequest request, @RequestBody ConstructionList constructionlist){
        return managementService.insertConstructionlist(constructionlist);
    }
    @PutMapping("/constrution/{id}")
    public String construtionUpdate(HttpServletRequest request ,@PathVariable("id") Long id, @RequestBody ConstructionList constructionlist){
        return managementService.updateConstructionlist(id,constructionlist);
    }
    @DeleteMapping("/constrution/{id}")
    public String construtionDelete(HttpServletRequest request,@PathVariable("id")Long id){
        return managementService.deleteConstructionlist(id);
    }
//    @GetMapping("/yujin")
//    public String yujinSelect(HttpServletRequest request){
//        return managementService.selectCountyujinByByVillageId(1);
//    }
//
//    @GetMapping("/gaizao")
//    public String gaizaoSelect(HttpServletRequest request){
//        return managementService.selectCountGaizaoByByVillageId(1);
//    }
//    @PutMapping("/gaizao")
//    public String gaizaoUpdate(HttpServletRequest request){
//        return managementService.selectCountGaizaoByByVillageId(1);
//    }
//
//    @PostMapping("/gaizao")
//    public String gaizaoInsert(HttpServletRequest request){
//        return managementService.selectCountGaizaoByByVillageId(1);
//    }
//
//    @DeleteMapping("/gaizao")
//    public String gaizaoDelete(HttpServletRequest request){
//        return managementService.selectCountGaizaoByByVillageId(1);
//    }

}
