package com.elysia.market.stock.core.control.advice;

import com.elysia.common.dto.result.Result;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:全局异常处理返回
 * @author: ElysiaKafka
 * @date: 2023/11/9 22:17
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    public static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * @description:
     * @author: ElysiaKafka
     * @date: 2023/11/9 22:18
     * @param: e
     * @return: com.elysia.common.dto.result.Result
     **/
    @ExceptionHandler(Exception.class)
    public Result handler(Exception e) {
        // 记录全局错误日志
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        // 统一返回错误处理结果
        return Result.returnFail("99999", StringUtils.hasLength(e.getMessage()) ? ExceptionUtils.getStackTrace(e) : "操作失败！");
    }
}
