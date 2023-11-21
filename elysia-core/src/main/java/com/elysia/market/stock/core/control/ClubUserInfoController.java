package com.elysia.market.stock.core.control;

import com.elysia.common.dto.result.Result;
import com.elysia.common.exception.ServiceFailException;
import com.elysia.market.stock.core.pojo.ClubUserInfo;
import com.elysia.market.stock.core.service.ClubUserInfoService;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class ClubUserInfoController {
    @Autowired
    private ClubUserInfoService clubUserInfoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClubUserInfoController.class);

    @RequestMapping("/getUserInfo")
    public ClubUserInfo getUserInfo(@RequestParam String id) {
        ClubUserInfo clubUserInfo = clubUserInfoService.getUserInfo(id);
        return clubUserInfo;
    }

    @RequestMapping("/register")
    public Result addUserInfo(@RequestParam ClubUserInfo clubUserInfo) {
        try {
            String username = clubUserInfo.getUsername();

            clubUserInfoService.addUser(clubUserInfo);
            return Result.returnSuccess(null);
        } catch (ServiceFailException e) {
            return Result.returnFail(e.getErrorCode(), e.getErrorInfo());
        } catch (Exception e) {
            LOGGER.error(ExceptionUtils.getStackTrace(e));
            String errorCode = "99999";
            String errorInfo = "系统发生错误，请联系管理员处理！";
            return Result.returnUnknown(errorCode, errorInfo);
        }
    }
}
