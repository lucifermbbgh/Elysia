package com.elysia.market.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.elysia.*")
public class ElysiaMarketStockApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElysiaMarketStockApplication.class, args);
    }
}
