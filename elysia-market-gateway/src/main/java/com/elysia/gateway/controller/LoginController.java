package com.elysia.gateway.controller;

import com.elysia.common.pojo.common.Result;
import com.elysia.gateway.pojo.dao.ElysiaUser;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.gateway.controller
 * @Author: ElysiaKafka
 * @CreateTime: 2023-12-07  11:35:57
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/login")
@RefreshScope
public class LoginController {
    @PostMapping("/login")
    public Result<String> login(@RequestParam String username, @RequestParam String password,@RequestParam String code) {
        return null;
    }

    public Result<String> register(@RequestParam ElysiaUser elysiaUser) {
        return null;
    }

    public Result<String> logout() {
        return null;
    }

    public Result<String> getCode() {
        return null;
    }

    public Result<String> checkCode() {
        return null;
    }

    public Result<String> checkUsername() {
        return null;
    }

    public Result<String> resetPassword() {
        return null;
    }
}
