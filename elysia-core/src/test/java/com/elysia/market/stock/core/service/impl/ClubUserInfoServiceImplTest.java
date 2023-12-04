package com.elysia.market.stock.core.service.impl;

import com.elysia.core.pojo.ClubUserInfo;
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
        ClubUserInfo clubUserInfo = clubUserInfoService.getUserInfo("1");
        System.out.println(clubUserInfo.toString());
    }
}