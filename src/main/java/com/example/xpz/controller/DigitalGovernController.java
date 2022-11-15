package com.example.xpz.controller;

import com.example.xpz.entity.*;
import com.example.xpz.service.DigitalGovernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalGovern")
public class DigitalGovernController {
    @Autowired
    DigitalGovernService digitalGovernService;
    @GetMapping("/cunminManyidu")
    public String cunminManyiduSelect(HttpServletRequest request){
        return digitalGovernService.selectCunMingManyidu();
    }
    @PutMapping("/cunminManyidu/{id}")
    public String cunminManyiduUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody CunMingManyidu cunMingManyidu){
        return digitalGovernService.updateCunMingManyidu(id,cunMingManyidu);
    }
    @PostMapping("/cunminManyidu")
    public String cunminManyiduInsert(HttpServletRequest request,@RequestBody CunMingManyidu cunMingManyidu){
        return digitalGovernService.insertCunMingManyidu(cunMingManyidu);
    }
    @DeleteMapping("/cunminManyidu/{id}")
    public String cunminManyiduDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernService.deleteCunMingManyidu(id);
    }
    @GetMapping("/tingyuan")
    public String tingyuanSelect(HttpServletRequest request){
        return digitalGovernService.selectTingyuan();
    }
    @PutMapping("/tingyuan/{id}")
    public String tingyuanUpdate(HttpServletRequest request, @PathVariable("id") Integer id, @RequestBody TingyuanWithBLOBs tingyuan){
        return digitalGovernService.updateTingyuan(id,tingyuan);
    }
    @PostMapping("/tingyuan")
    public String tingyuanInsert(HttpServletRequest request,@RequestBody TingyuanWithBLOBs tingyuan){
        return digitalGovernService.insertTingyuan(tingyuan);
    }
    @DeleteMapping("/tingyuan/{id}")
    public String tingyuanDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalGovernService.deleteTingyuan(id);
    }
    @GetMapping("/trashClassfication")
    public String trashClassficationSelect(HttpServletRequest request){
        return digitalGovernService.selectTrashClassfication();
    }
    @PutMapping("/trashClassfication/{id}")
    public String trashClassficationUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody TrashClassfication trashClassfication){
        return digitalGovernService.updateTrashClassfication(id,trashClassfication);
    }
    @PostMapping("/trashClassfication")
    public String trashClassficationInsert(HttpServletRequest request,@RequestBody TrashClassfication trashClassfication){
        return digitalGovernService.insertTrashClassfication(trashClassfication);
    }
    @DeleteMapping("/trashClassfication/{id}")
    public String trashClassficationDelete(HttpServletRequest request,@PathVariable("id")Integer id){
        return digitalGovernService.deleteTrashClassfication(id);
    }

    @GetMapping("/weishengBaojie/{isLuzhang}")
    public String weishengBaojie(HttpServletRequest request, @PathVariable("isLuzhang")Integer isLuzhang){
        return digitalGovernService.selectWeishengBaojie(isLuzhang);
    }
    @GetMapping("/weixinyuan")
    public String weixinyuan(HttpServletRequest request){
        return digitalGovernService.selectWeixinyuan();
    }
    @PutMapping("/weixinyuan/{id}")
    public String weixinyuanUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Weixinyuan weixinyuan){
        return digitalGovernService.updateWeixinyuan(id,weixinyuan);
    }
    @PostMapping("/weixinyuan")
    public String weixinyuanInsert(HttpServletRequest request, @RequestBody Weixinyuan weixinyuan){
        return digitalGovernService.insertWeixinyuan(weixinyuan);
    }
    @DeleteMapping("/weixinyuan")
    public String weixinyuanDelete(HttpServletRequest request, @PathVariable("id")Integer id){
        return digitalGovernService.deleteWeixinyuan(id);
    }


}
