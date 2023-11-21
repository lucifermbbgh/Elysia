package com.elysia.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServiceUnknownException extends RuntimeException {
    public static final String DEFAULT_ERROR_CODE = "10002";
    public static final String DEFAULT_ERROR_INFO = "服务处理发生未知异常！";

    public String errorCode;
    public String errorInfo;
}
