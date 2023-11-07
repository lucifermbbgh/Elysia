package com.elysia.common.dto.result;

import com.elysia.common.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> extends BaseDto {
    private static final long serialVersionUID = 1L;

    public static final Integer SUCCESS = 0;
    public static final Integer FAIL = 1;
    public static final Integer UNKNOWN = 2;

    private Integer resultCode;
    private String errorCode;
    private String errorInfo;
    private T data;

    public static <E> Result<E> returnSuccess(E data) {
        Result result = new Result();
        result.setResultCode(SUCCESS);
        result.setData(data);
        return result;
    }

    public static <E> Result<E> returnFail(String errorCode, String errorInfo, E data) {
        Result result = new Result();
        result.setResultCode(FAIL);
        result.setErrorCode(errorCode);
        result.setErrorInfo(errorInfo);
        result.setData(data);
        return result;
    }

    public static <E> Result<E> returnUnknown(String errorCode, String errorInfo, E data) {
        Result result = new Result();
        result.setResultCode(UNKNOWN);
        result.setErrorCode(errorCode);
        result.setErrorInfo(errorInfo);
        result.setData(data);
        return result;
    }

    public static Result returnFail(String errorCode, String errorInfo) {
        Result result = new Result();
        result.setResultCode(FAIL);
        result.setErrorCode(errorCode);
        result.setErrorInfo(errorInfo);
        return result;
    }

    public static Result returnUnknown(String errorCode, String errorInfo) {
        Result result = new Result();
        result.setResultCode(UNKNOWN);
        result.setErrorCode(errorCode);
        result.setErrorInfo(errorInfo);
        return result;
    }
}
