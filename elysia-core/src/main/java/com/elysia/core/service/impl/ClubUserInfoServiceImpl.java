package com.elysia.core.service.impl;

import com.elysia.core.pojo.ClubUserInfo;
import com.elysia.core.mappers.ClubUserInfoMapper;
import com.elysia.core.service.ClubUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubUserInfoServiceImpl implements ClubUserInfoService {
    @Autowired
    private ClubUserInfoMapper clubUserInfoMapper;

    @Override
    public ClubUserInfo getUserInfo(String id) {
        ClubUserInfo clubUserInfo = new ClubUserInfo();
        clubUserInfo.toString();
        return clubUserInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addUser(ClubUserInfo clubUserInfo) {
        clubUserInfoMapper.insert(clubUserInfo);
    }


}
