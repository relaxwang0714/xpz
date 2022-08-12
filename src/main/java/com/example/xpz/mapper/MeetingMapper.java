package com.example.xpz.mapper;

import com.example.xpz.entity.Meeting;

import java.util.List;

public interface MeetingMapper {
    List<Meeting> selectByVillageId(Integer villageId);
}
