package com.elysia.market.order.handler;

import com.elysia.common.pojo.common.Result;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.order.handler
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-29  17:33:33
 * @Description: TODO
 * @Version: 1.0
 */
public class FallbackExceptionHandler extends Throwable {
    public static Result<String> handler1(Throwable throwable) {
        return Result.returnFail("88888", "系统异常，请联系管理员处理！", "系统异常，请联系管理员处理！");
    }

    public static Result<String> handler2(String id, Throwable throwable) {
        return Result.returnFail("88888", "系统异常，请联系管理员处理！", "系统异常，请联系管理员处理！");
    }
}
