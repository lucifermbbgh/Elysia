package com.elysia.gate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.elysia.gate.mapper")
public class ElysiaGateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElysiaGateApplication.class, args);
    }

}
