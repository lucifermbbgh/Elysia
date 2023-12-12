package com.elysia.market.api.order;

import com.elysia.common.pojo.common.Result;
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
//@FeignClient(value = "elysia-market-stock-service", fallback = StockTestServiceImpl.class)
public interface StockTestService {
    @GetMapping("/stock/reduce/{orderId}")
    public Result<String> reduceStock(@PathVariable("orderId") String orderId);

    @GetMapping("/test/timeout/{id}")
    public Result<String> testTimeout(@PathVariable("id") String id);
}
