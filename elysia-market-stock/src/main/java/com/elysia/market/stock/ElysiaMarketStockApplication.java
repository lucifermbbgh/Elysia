package com.elysia.market.stock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElysiaMarketStockApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElysiaMarketStockApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ElysiaMarketStockApplication.class, args);
    }

}
