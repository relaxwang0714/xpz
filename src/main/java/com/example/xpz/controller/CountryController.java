package com.example.xpz.controller;

import com.example.xpz.entity.*;
import com.example.xpz.service.CountryService;
import org.apache.ibatis.annotations.Delete;
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
    public String overviewSelect(HttpServletRequest request) {
        return countryService.selectVillage(1L);
}
//    @PostMapping("/overview")
//    public String overviewInsert(HttpServletRequest request) {
//        return countryService.selectByPrimaryKey(1);
//    }
//    @PutMapping("/overview")
//    public String overviewUpdate(HttpServletRequest request) {
//        return countryService.selectByPrimaryKey(1);
//    }
//    @DeleteMapping("/overview")
//    public String overviewDelete(HttpServletRequest request) {
//        return countryService.selectByPrimaryKey(1);
//    }
    @GetMapping("/peopleStructure")
    public String peopleStructureSelect(HttpServletRequest request) {
        return countryService.selectPeopleStructure();
    }
    @PostMapping("/peopleStructure")
    public String peopleStructureInsert(HttpServletRequest request, @RequestBody PeopleStructure peopleStructure) {
        return countryService.insertPeopleStructure(peopleStructure);
    }
    @PutMapping("/peopleStructure/{id}")
    public String peopleStructureUpdate(HttpServletRequest request,@PathVariable("id")Long id,@RequestBody PeopleStructure peopleStructure) {
        return countryService.updatePeopleStructure(id,peopleStructure);
    }
    @DeleteMapping("/peopleStructure/{id}")
    public String peopleStructureDelete(HttpServletRequest request,@PathVariable("id")Long id) {
        return countryService.deletePeopleStructure(id);
    }
    @GetMapping("/style")
    public String styleSelect(HttpServletRequest request){
        return countryService.selectStyle();
    }
    @PutMapping("/style/{id}")
    public String styleUpdate(HttpServletRequest request, @PathVariable("id")Long id, @RequestBody Style style){
        return countryService.updateStyle(id,style);
    }
    @PostMapping("/style")
    public String styleInsert(HttpServletRequest request,@RequestBody Style style){
        return countryService.insertStyle(style);
    }
    @DeleteMapping("/style/{id}")
    public String styleDelete(HttpServletRequest request,@PathVariable("id") Long id){
        return countryService.deleteStyle(id);
    }
    @GetMapping("/culture")
    public String cultureSelect(HttpServletRequest request) {
        return countryService.selectVillageCulture();
    }
    @PutMapping("/culture/{id}")
    public String cultureUpdate(HttpServletRequest request,@PathVariable("id") Long id,@RequestBody VillageCulture villageCulture) {
        return countryService.updateVillageCulture(id,villageCulture);
    }
//    @PostMapping("/culture")
//    public String cultureInsert(HttpServletRequest request) {
//        return countryService.insertVillageCulture();
//    }
//    @DeleteMapping("/culture")
//    public String cultureDelete(HttpServletRequest request) {
//        return countryService.selectPlaceByVillageId(1);
//    }
    @GetMapping("/DigitalInfrastructure")
    public String digitalInfrastructureSelect(HttpServletRequest request) {
        return countryService.selectDigitalInfrastructure();
    }
    @PostMapping("/DigitalInfrastructure")
    public String digitalInfrastructureInsert(HttpServletRequest request, @RequestBody DigitalInfrastructure digitalInfrastructure) {
        return countryService.insertDigitalInfrastructure(digitalInfrastructure);
    }
    @PutMapping("/DigitalInfrastructure/{id}")
    public String digitalInfrastructureUpdate(HttpServletRequest request, @PathVariable("id") Long id, @RequestBody DigitalInfrastructure digitalInfrastructure) {
        return countryService.updateDigitalInfrastructure(id,digitalInfrastructure);
    }
    @DeleteMapping("/DigitalInfrastructure/{id}")
    public String digitalInfrastructureDelete(HttpServletRequest request,@PathVariable("id") Long id) {
        return countryService.deleteDigitalInfrastructure(id);
    }
    @GetMapping("/feiyi")
    public String feiyiSelect(HttpServletRequest request) {
        return countryService.selectFeiyiZiyuan();
    }
    @PutMapping("/feiyi/{id}")
    public String feiyiUpdate(HttpServletRequest request, @PathVariable("id")Long id, @RequestBody FeiyiZiyuan feiyiZiyuan) {
        return countryService.updateFeiyiZiyuan(id,feiyiZiyuan);
    }
    @PostMapping("/feiyi")
    public String feiyiInsert(HttpServletRequest request, @RequestBody FeiyiZiyuan feiyiZiyuan) {
        return countryService.insertFeiyiZiyuan(feiyiZiyuan);
    }
    @DeleteMapping("/feiyi/{id}")
    public String feiyiDelete(HttpServletRequest request,@PathVariable("id") Long id) {
        return countryService.deleteFeiyiZiyuan(id);
    }
    @GetMapping("/fangwu")
    public String fangwuSelect(HttpServletRequest request) {
        return countryService.selectFangwu();
    }
    @PutMapping("/fangwu/{id}")
    public String fangwuUpdate(HttpServletRequest request,@PathVariable("id") Long id,@RequestBody Fangwu fangwu) {
        return countryService.updateFangwu(id,fangwu);
    }
    @PostMapping("/fangwu")
    public String fangwuInsert(HttpServletRequest request,@RequestBody Fangwu fangwu) {
        return countryService.insertFangwu(fangwu);
    }
    @DeleteMapping("/fangwu/{id}")
    public String fangwuDelete(HttpServletRequest request,@PathVariable("id") Long id) {
        return countryService.deleteFangwu(id);
    }
    @GetMapping("/cunming/{huhao}")
    public String cunming(HttpServletRequest request, @PathVariable("huhao") Integer huhao) {
        return countryService.selectCunmingByHuhao(1,huhao);
    }
    @PostMapping("/dangyuan/{huhao}")
    public String dangyuanSelect(HttpServletRequest request, @PathVariable("huhao")String huhao) {
        return countryService.selectDangyuanByHuhao(1,huhao);
    }

    @GetMapping("/environment")
    public String environmentSelect(HttpServletRequest request) {
        return countryService.selectTrash();
    }
    @PutMapping("/environment/{id}")
    public String environmentUpdate(HttpServletRequest request,@PathVariable("id") Integer id,@RequestBody Trash trash) {
        return countryService.updateTrash(id,trash);
    }
    @PostMapping("/environment")
    public String environmentInsert(HttpServletRequest request,@RequestBody Trash trash) {
        return countryService.insertTrash(trash);
    }
    @DeleteMapping("/environment/{id}")
    public String environmentDelete(HttpServletRequest request,@PathVariable("id") Integer id) {
        return countryService.deleteTrash(id);
    }
}
