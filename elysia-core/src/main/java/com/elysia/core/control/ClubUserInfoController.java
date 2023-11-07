package com.elysia.core.control;

import com.elysia.common.dto.result.Result;
import com.elysia.core.pojo.ClubUserInfo;
import com.elysia.core.service.ClubUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class ClubUserInfoController {
    @Autowired
    private ClubUserInfoService clubUserInfoService;

    @RequestMapping("/getUserInfo")
    public ClubUserInfo getUserInfo(@RequestParam String id) {
        ClubUserInfo clubUserInfo = clubUserInfoService.getUserInfo(id);
        return clubUserInfo;
    }

    @RequestMapping("/addUserInfo")
    public Result addUserInfo(Map<String, Object> userInfoMap) {
        try {
            ClubUserInfo clubUserInfo = new ClubUserInfo();
            clubUserInfoService.addUser(clubUserInfo);
            return Result.returnSuccess(null);
        } catch (Exception e) {
            String errorCode = "";
            String errorInfo = "";
            return Result.returnFail(errorCode, errorInfo);
        }
    }
}
