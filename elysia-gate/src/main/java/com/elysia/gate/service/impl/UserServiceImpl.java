package com.elysia.gate.service.impl;

import com.elysia.common.exception.ServiceFailException;
import com.elysia.common.pojo.common.Result;
import com.elysia.gate.manager.DBUserManager;
import com.elysia.gate.manager.PasswordEncodeManager;
import com.elysia.gate.mapper.ElysiaUserInfoMapper;
import com.elysia.gate.mapper.ElysiaUserMapper;
import com.elysia.gate.pojo.dao.ElysiaUser;
import com.elysia.gate.pojo.dao.ElysiaUserInfo;
import com.elysia.gate.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.gate.api.order.impl
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-29  22:25:38
 * @Description: TODO
 * @Version: 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Autowired
    private ElysiaUserMapper elysiaUserMapper;
    @Autowired
    private ElysiaUserInfoMapper elysiaUserInfoMapper;

    @Resource
    private PasswordEncodeManager passwordEncodeManager;
    @Resource
    private DBUserManager dbUserManager;

    @Override
    public Result<ElysiaUser> register(ElysiaUser elysiaUser) {
        String username = elysiaUser.getUsername();
        int checkName = elysiaUserMapper.queryUserByUsername(username);
        if (checkName > 0) {
            return Result.returnFail("10001002", "注册失败，用户已存在！");
        }

        int user = elysiaUserMapper.createUser(elysiaUser);
        if (user > 0) {
            return Result.returnSuccess(elysiaUser);
        } else {
            return Result.returnFail("10001002", "注册失败，用户已存在！");
        }
    }

    @Override
    public Result<ElysiaUser> resetPassword(String username, String password) {
        return null;
    }

    @Override
    public Result deleteAccount(ElysiaUser elysiaUser) {
        return null;
    }

    @Override
    public Result<List<ElysiaUser>> queryUserList(Map<String, Object> queryParams) throws ServiceFailException {
        try {
            List<ElysiaUser> elysiaUsers = elysiaUserMapper.queryUserList(queryParams);
            return Result.returnSuccess(elysiaUsers);
        } catch (Exception e) {
            log.error("查询用户列表失败！报错信息：{}", ExceptionUtils.getStackTrace(e));
            throw new ServiceFailException(
                    ServiceFailException.DEFAULT_ERROR_CODE,
                    ServiceFailException.DEFAULT_ERROR_INFO);
        }
    }

    @Override
    public Result<ElysiaUserInfo> queryUserInfo(String username, String password) {
        return null;
    }

    @Override
    public Result<List<ElysiaUserInfo>> queryUserInfoList(Map<String, Object> queryParams) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> updateUserInfo(ElysiaUserInfo elysiaUserInfo) {
        return null;
    }

    @Override
    public Result<ElysiaUserInfo> addUserInfo(ElysiaUserInfo elysiaUserInfo) {
        return null;
    }

    @Override
    public Result<ElysiaUser> registerWithUserDetails(ElysiaUser elysiaUser) {
        try {
            Collection<GrantedAuthority> elysiaUserAuthorities = new ArrayList<>();
            User user = (User) User.withDefaultPasswordEncoder()
                    .username(elysiaUser.getUsername())
                    .password(elysiaUser.getPassword())
                    .authorities(elysiaUserAuthorities)
                    .build();
            dbUserManager.createUser(user);
            return Result.returnSuccess(elysiaUser);
        } catch (Exception e) {
            log.error("注册失败！报错信息：{}", ExceptionUtils.getStackTrace(e));
            return Result.returnFail("10001002", "注册失败，用户已存在！");
        }
    }
}
