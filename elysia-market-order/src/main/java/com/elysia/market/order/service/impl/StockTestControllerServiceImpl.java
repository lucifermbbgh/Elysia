package com.elysia.market.order.service.impl;

import com.elysia.common.pojo.common.Result;
import com.elysia.market.order.service.StockTestControllerService;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.api.order.impl
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-29  22:25:38
 * @Description: TODO
 * @Version: 1.0
 */
@Component
//@Service
public class StockTestControllerServiceImpl implements StockTestControllerService {
    @Override
    public Result<String> reduceStock(String orderId) {
        return Result.returnUnknown("99999", "服务降级返回", "服务降级返回");
    }

    @Override
    public Result<String> testTimeout(String id) {
        return Result.returnUnknown("99999", "服务降级返回", "服务降级返回");
    }
}
