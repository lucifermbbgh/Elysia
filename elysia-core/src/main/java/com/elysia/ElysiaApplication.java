package com.elysia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElysiaApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElysiaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ElysiaApplication.class, args);
    }

}
