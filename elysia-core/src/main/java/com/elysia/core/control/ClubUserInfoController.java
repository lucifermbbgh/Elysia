package com.elysia.core.control;

import com.elysia.core.datasource.dao.ClubUserInfo;
import com.elysia.core.service.ClubUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class ClubUserInfoController {
    @Autowired
    private ClubUserInfoService clubUserInfoService;

    @RequestMapping("/getUserInfo")
    public ClubUserInfo selectClubUserInfo(@RequestParam String id) {
        ClubUserInfo clubUserInfo = clubUserInfoService.selectByPrimaryKey(id);
        return clubUserInfo;
    }
}
