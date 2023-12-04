package com.elysia.market.api.stock;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.service.order
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:10:11
 * @Description: TODO
 * @Version: 1.0
 */
public interface IStockService {
    /**
     * @description:扣减库存
     * @author: ElysiaKafka
     * @date: 2023/11/25 22:39
     * @param: id
     * @return: java.lang.String
     **/
    String reduceStock(String orderId);

    /**
     * @description:增加库存
     * @author: ElysiaKafka
     * @date: 2023/11/29 17:21
     * @param: orderId
     * @return: java.lang.String
     **/
    String addStock(String orderId);
}
