package com.elysia.gate.controller;

import com.alibaba.fastjson.JSON;
import com.elysia.common.exception.ServiceFailException;
import com.elysia.common.exception.ServiceUnknownException;
import com.elysia.common.pojo.common.Result;
import com.elysia.gate.pojo.dao.ElysiaUser;
import com.elysia.gate.pojo.dao.ElysiaUserInfo;
import com.elysia.gate.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.gate.order.controller
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-25  22:57:19
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private IUserService iUserService;
//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/getList")
//    @PreAuthorize("hasRole('USER')")
    @PreAuthorize("hasAnyAuthority('USER_SELECT')")
    public Result<List<ElysiaUser>> getList(String queryParams) {
        try {
            Map<String, Object> inputParams = new HashMap<>();
            if (StringUtils.isNotBlank(queryParams)) {
                inputParams = JSON.parseObject(queryParams, Map.class);
            }
            return iUserService.queryUserList(inputParams);
        } catch (Exception e) {
            return Result.returnUnknown("99999999", ExceptionUtils.getStackTrace(e), null);
        }
    }

    /**
     * @description: 用户注册
     * @description: @PreAuthorize注解表示在方法调用之前，先进行用户的角色权限校验
     * @description: hasRole('ADMIN')表示当前用户角色必须是‘ADMIN’才能调用该方法
     * @description: authentication.name=='admin'表示当前用户账号必须是‘admin’才能调用该方法
     * @description: hasAnyAuthority('USER_SELECT')表示当前用户必须有赋权'USER_SELECT'权限才可以调用该方法
     * @author: ElysiaKafka
     * @date: 2024/2/3 0:08
     * @param: elysiaUser
     * @return: com.elysia.common.pojo.common.Result
     **/
    @PostMapping("/register")
    @PreAuthorize("hasRole('ADMIN') and authentication.name == 'admin'")
    public Result register(@RequestBody ElysiaUser elysiaUser) {
        try {
            return iUserService.registerWithUserDetails(elysiaUser);
        } catch (Exception e) {
            return Result.returnUnknown("99999999", ExceptionUtils.getStackTrace(e));
        }
    }

    @PostMapping("/registerByForm")
    @Transactional
    public Result registerByForm(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email) {
        try {
            ElysiaUser elysiaUser = new ElysiaUser().builder()
                    .username(username)
                    .password(password)
                    .build();
            ElysiaUserInfo elysiaUserInfo = new ElysiaUserInfo().builder()
                    .email(email)
                    .build();

            Result<ElysiaUser> registerResult = iUserService.register(elysiaUser);
            if (registerResult.getResultCode().intValue() == Result.FAIL.intValue()) {
                throw new ServiceFailException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }
            if (registerResult.getResultCode().intValue() == Result.UNKNOWN.intValue()) {
                throw new ServiceUnknownException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }

            Result<ElysiaUserInfo> addUserInfoResult = iUserService.addUserInfo(elysiaUserInfo);
            if (addUserInfoResult.getResultCode().intValue() == Result.FAIL.intValue()) {
                throw new ServiceFailException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }
            if (addUserInfoResult.getResultCode().intValue() == Result.UNKNOWN.intValue()) {
                throw new ServiceUnknownException(registerResult.getErrorCode(), registerResult.getErrorInfo());
            }

            return registerResult;
        } catch (ServiceFailException e) {
            return Result.returnFail(e.getErrorCode(), e.getErrorInfo());
        } catch (ServiceUnknownException e) {
            return Result.returnUnknown(e.getErrorCode(), e.getErrorInfo());
        } catch (Exception e) {
            return Result.returnUnknown("99999999", ExceptionUtils.getStackTrace(e));
        }
    }
}
