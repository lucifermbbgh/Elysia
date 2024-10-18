package com.elysia.gateway.service.impl;

import com.elysia.gateway.pojo.dao.ElysiaUser;
import com.elysia.gateway.service.LoginService;

import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.gateway.service.impl
 * @Author: ElysiaKafka
 * @CreateTime: 2023-12-06  23:26:53
 * @Description: TODO
 * @Version: 1.0
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public Map<String, Object> register(ElysiaUser elysiaUser) {
        return null;
    }

    @Override
    public Map<String, Object> login(String username, String password, String code) {
        return null;
    }

    @Override
    public Map<String, Object> logout() {
        return null;
    }

    @Override
    public Map<String, Object> getCheckCode() {
        return null;
    }

    @Override
    public Map<String, Object> resetPassword(ElysiaUser elysiaUser) {
        return null;
    }
}
