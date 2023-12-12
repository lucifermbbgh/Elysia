package com.elysia.market.order.service;

import com.elysia.common.pojo.common.Result;
import com.elysia.market.order.service.impl.StockTestControllerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.api.order
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-29  21:38:18
 * @Description: TODO
 * @Version: 1.0
 */
@Service
@FeignClient(value = "elysia-market-stock-service", fallback = StockTestControllerServiceImpl.class)
public interface StockTestControllerService {
    @GetMapping("/stock/reduce/{orderId}")
    public Result<String> reduceStock(@PathVariable("orderId") String orderId);

    @GetMapping("/test/timeout/{id}")
    public Result<String> testTimeout(@PathVariable("id") String id);
}
