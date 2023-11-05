package com.elysia.core.service.impl;

import com.elysia.core.datasource.dao.ClubUserInfo;
import com.elysia.core.datasource.mappers.ClubUserInfoMapper;
import com.elysia.core.service.ClubUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubUserInfoServiceImpl implements ClubUserInfoService {
    @Autowired
    private ClubUserInfoMapper clubUserInfoMapper;

    @Override
    public ClubUserInfo selectByPrimaryKey(String id) {
        return clubUserInfoMapper.selectByPrimaryKey(id);
    }
}
