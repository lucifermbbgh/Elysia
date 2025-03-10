package com.elysia.fury.config;

import com.elysia.fury.pool.FuryPool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.fury.config
 * @Author: ElysiaKafka
 * @CreateTime: 2025-03-04  11:36:06
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class FuryConfiguration {
    @Bean
    public FuryPool furyPool() {
        return new FuryPool();
    }
}
