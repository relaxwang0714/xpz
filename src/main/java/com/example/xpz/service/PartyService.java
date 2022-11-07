package com.example.xpz.service;

import com.example.xpz.entity.Facility;
import com.example.xpz.entity.Meeting;
import com.example.xpz.entity.PartyFazhan;
import com.example.xpz.entity.PartyFengcai;
import com.example.xpz.mapper.FacilityMapper;
import com.example.xpz.mapper.MeetingMapper;
import com.example.xpz.mapper.PartyFazhanMapper;
import com.example.xpz.mapper.PartyFengcaiMapper;
import com.example.xpz.utils.ReturnMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {
    @Autowired
    FacilityMapper facilityMapper;
    @Autowired
    ReturnMsg returnmsg;
    @Autowired
    MeetingMapper meetingMapper;
    @Autowired
    PartyFengcaiMapper partyFengcaiMapper;
    @Autowired
    PartyFazhanMapper partyFazhanMapper;

    public String selectfacilityByVillageId(int id){
        List<Facility> facilityList = facilityMapper.selectByVillageId(id);
        returnmsg.setData(facilityList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String selectMeetingByVillageId(int id){
        List<Meeting> meetingList = meetingMapper.selectByVillageId(id);
        returnmsg.setData(meetingList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }

    public String selectPartyFengcaiByVillageId(int id){
        List<PartyFengcai> partyFengcaiList = partyFengcaiMapper.selectByVillageId(id);
        returnmsg.setData(partyFengcaiList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }
    public String selectPartyFazhanByVillageId(int id){
        List<PartyFazhan> partyFazhanList = partyFazhanMapper.selectByVillageId(id);
        returnmsg.setData(partyFazhanList);
        returnmsg.setCode("0");
        returnmsg.setMsg("成功");
        return returnmsg.toString();
    }

}
