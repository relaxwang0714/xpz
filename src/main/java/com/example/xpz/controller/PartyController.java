package com.example.xpz.controller;

import com.example.xpz.entity.*;
import com.example.xpz.service.PartyService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Party")
public class PartyController {
    @Autowired
    PartyService partyService;
    @GetMapping("/facilty")
    public String faciltySelect(HttpServletRequest request) {
        return partyService.selectDangjianFacilty();
    }
    @PutMapping("/facilty/{id}")
    public String faciltyUpdate(HttpServletRequest request, @RequestBody DangjianFaciltyWithBLOBs dangjianFacilty, @PathVariable("id")Long id) {
        return partyService.updateDangjianFacilty(id,dangjianFacilty);
    }
    @PostMapping("/facilty")
    public String faciltyInsert(HttpServletRequest request, @RequestBody DangjianFaciltyWithBLOBs dangjianFacilty) {
        return partyService.insertDangjianFacilty(dangjianFacilty);
    }
    @DeleteMapping("/facilty/{id}")
    public String faciltyDelete(HttpServletRequest request,@PathVariable("id") Long id) {
        return partyService.deleteDangjianFacilty(id);
    }
    @GetMapping("/meeting")
    public String meetingSelect(HttpServletRequest request) {
        return partyService.selectMeeting();
    }
    @PutMapping("/meeting/{id}")
    public String meetingUpdate(HttpServletRequest request, @PathVariable("id")Integer id, @RequestBody Meeting meeting) {
        return partyService.updateMeeting(id,meeting);
    }
    @PostMapping("/meeting")
    public String meetingInsert(HttpServletRequest request,@RequestBody Meeting meeting) {
        return partyService.insertMeeting(meeting);
    }
    @DeleteMapping("/meeting/{id}")
    public String meetingDelete(HttpServletRequest request, @PathVariable("id")Integer id) {
        return partyService.deleteMeeting(id);
    }
    @GetMapping("/fengcai")
    public String fengcaiSelect(HttpServletRequest request) {
        return partyService.selectDangyuanFengcai();
    }
    @PutMapping("/fengcai/{id}")
    public String fengcaiUpdate(HttpServletRequest request, @PathVariable("id")Long id, @RequestBody DangyuanFengcai dangyuanFengcai) {
        return partyService.updateDangyuanFengcai(id,dangyuanFengcai);
    }
    @PostMapping("/fengcai")
    public String fengcaiInsert(HttpServletRequest request,@RequestBody DangyuanFengcai dangyuanFengcai) {
        return partyService.insertDangyuanFengcai(dangyuanFengcai);
    }
    @DeleteMapping("/fengcai/{id}")
    public String fengcaiDelete(HttpServletRequest request, @PathVariable("id")Long id) {
        return partyService.deleteDangyuanFengcai(id);
    }

    @GetMapping("/fazhan")
    public String fazhanSelect(HttpServletRequest request) {
        return partyService.selectDangyuanFazhan();
    }
    @PutMapping("/fazhan/{id}")
    public String fazhanUpdate(HttpServletRequest request, @PathVariable("id")Long id,@RequestBody DangyuanFazhan dangyuanFazhan) {
        return partyService.updateDangyuanFazhan(id,dangyuanFazhan);
    }
    @PostMapping("/fazhan")
    public String fazhanInsert(HttpServletRequest request,@RequestBody DangyuanFazhan dangyuanFazhan) {
        return partyService.insertDangyuanFazhan(dangyuanFazhan);
    }
    @DeleteMapping("/fazhan/{id}")
    public String fazhanDelete(HttpServletRequest request, @PathVariable("id")Long id) {
        return partyService.deleteDangyuanFazhan(id);
    }


}
