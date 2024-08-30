package com.elysia.gate.service.impl;

import com.elysia.gate.manager.PasswordEncodeManager;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @BelongsProject: elysia-gate
 * @BelongsPackage: com.elysia.gate.service.impl
 * @Author: ElysiaKafka
 * @CreateTime: 2024-02-01  15:57:05
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootTest
public class PasswordEncodeTest {
    private final PasswordEncodeManager passwordEncodeManager = new PasswordEncodeManager();

    @Test
    public void test_encode() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String enablePswd = "admin";
        String encryptPswd1 = encoder.encode(enablePswd);
        System.out.println(encryptPswd1);
        System.out.println(encoder.matches(enablePswd, encryptPswd1));
        String encryptPswd2 = encoder.encode(enablePswd);
        System.out.println(encryptPswd2);
        System.out.println(encoder.matches(enablePswd, encryptPswd1));
        String encryptPswd3 = encoder.encode(enablePswd);
        System.out.println(encryptPswd3);
        System.out.println(encoder.matches(enablePswd, encryptPswd1));
        String encryptPswd4 = encoder.encode(enablePswd);
        System.out.println(encryptPswd4);
        System.out.println(encoder.matches(enablePswd, encryptPswd1));
        String encryptPswd5 = encoder.encode(enablePswd);
        System.out.println(encryptPswd5);
        System.out.println(encoder.matches(enablePswd, encryptPswd1));
    }
    @Test
    public void test_BCryptPasswordEncoder() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String enablePswd = "admin";
        String encryptPswd = encoder.encode(enablePswd);
        System.out.println(encryptPswd);
        System.out.println(encoder.matches(enablePswd, encryptPswd));

        String encode = passwordEncodeManager.encodeByBCryptPasswordEncoder(enablePswd);
        System.out.println(encode);
        System.out.println(encoder.matches(encode, encryptPswd));
    }

    @Test
    public void test_DelegatingPasswordEncoder() {
        String enablePswd = "github";
        String encode = passwordEncodeManager.encodeByDelegatingPasswordEncoder(enablePswd);
        System.out.println(encode);
    }
}
