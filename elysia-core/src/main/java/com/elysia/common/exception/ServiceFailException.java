package com.elysia.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServiceFailException extends RuntimeException {
    public static final String DEFAULT_ERROR_CODE = "10001";
    public static final String DEFAULT_ERROR_INFO = "服务处理失败！";

    public String errorCode;
    public String errorInfo;
}
