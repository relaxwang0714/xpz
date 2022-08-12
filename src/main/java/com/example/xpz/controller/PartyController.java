package com.example.xpz.controller;

import com.example.xpz.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Party")
public class PartyController {
    @Autowired
    PartyService partyService;
    @RequestMapping("/facilty")
    public String facilty(HttpServletRequest request) {
        return partyService.selectfacilityByVillageId(1);
    }

    @RequestMapping("/meeting")
    public String meeting(HttpServletRequest request) {
        return partyService.selectMeetingByVillageId(1);
    }
    @RequestMapping("/fengcai")
    public String fengcai(HttpServletRequest request) {
        return partyService.selectPartyFengcaiByVillageId(1);
    }
    @RequestMapping("/fazhan")
    public String fazhan(HttpServletRequest request) {
        return partyService.selectPartyFazhanByVillageId(1);
    }

}
