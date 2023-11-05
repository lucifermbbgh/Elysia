package com.elysia.core.service.impl;

import com.elysia.core.datasource.dao.ClubUserInfo;
import com.elysia.core.service.ClubUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

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