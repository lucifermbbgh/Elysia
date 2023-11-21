package com.elysia.market.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElysiaMarketOrderApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElysiaMarketOrderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ElysiaMarketOrderApplication.class, args);
    }

}
