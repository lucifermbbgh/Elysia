package com.elysia.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElysiaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElysiaGatewayApplication.class, args);
    }

}
