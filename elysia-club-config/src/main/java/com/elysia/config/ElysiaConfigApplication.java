package com.elysia.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElysiaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElysiaConfigApplication.class, args);
    }

}
