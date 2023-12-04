package com.elysia.market.stock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ElysiaMarketStockApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElysiaMarketStockApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ElysiaMarketStockApplication.class, args);
    }

}
