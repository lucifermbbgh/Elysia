package com.elysia.market.order.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.mapper
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:37:45
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface ElysiaMarketOrderMapper {

    int createOrderInfo();
}
