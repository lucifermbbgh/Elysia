package com.elysia.core.service.impl;

import com.elysia.core.datasource.dao.ClubUserInfo;
import com.elysia.core.service.ClubUserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClubUserInfoServiceImplTest {
    @Autowired
    private ClubUserInfoService clubUserInfoService;

    @Test
    public void test(){
        ClubUserInfo clubUserInfo = clubUserInfoService.selectByPrimaryKey("1");
        System.out.println(clubUserInfo.toString());
    }
}