package com.elysia.market.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.elysia.*")// 使用Feign客户端调用远程服务的注解
public class ElysiaMarketOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElysiaMarketOrderApplication.class, args);
    }
}
