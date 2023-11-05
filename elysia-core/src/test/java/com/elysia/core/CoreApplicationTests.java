package com.elysia.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class CoreApplicationTests {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CoreApplicationTests.class, args);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM USER");
        System.out.println(result);
    }
}
