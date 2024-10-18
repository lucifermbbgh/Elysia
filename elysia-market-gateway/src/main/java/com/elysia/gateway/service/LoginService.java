package com.elysia.gateway.service;

import com.elysia.gateway.pojo.dao.ElysiaUser;

import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.gateway.service
 * @Author: ElysiaKafka
 * @CreateTime: 2023-12-06  23:27:08
 * @Description: TODO
 * @Version: 1.0
 */
public interface LoginService {
    Map<String, Object> register(ElysiaUser elysiaUser);

    Map<String, Object> login(String username, String password, String code);

    Map<String, Object> logout();

    Map<String, Object> getCheckCode();

    Map<String, Object> resetPassword(ElysiaUser elysiaUser);
}
