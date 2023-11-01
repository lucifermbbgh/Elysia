package com.alicia.common.dto.result;

import com.alicia.common.base.BaseDto;

import java.util.Map;

public class Result implements BaseDto {
    private static final long serialVersionUID = 1L;

    public static final Integer SUCCESS = 0;
    public static final Integer FAIL = 1;
    public static final Integer UNKNOWN = 2;

    private Integer resultCode;
    private Map<String, Object> retInfo;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Map<String, Object> getRetInfo() {
        return retInfo;
    }

    public void setRetInfo(Map<String, Object> retInfo) {
        this.retInfo = retInfo;
    }

    public static Result returnSuccess(Map<String, Object> outputParams) {
        Result result = new Result();
        result.setResultCode(SUCCESS);
        result.setRetInfo(outputParams);
        return result;
    }

    public static Result returnFail(Map<String, Object> outputParams) {
        Result result = new Result();
        result.setResultCode(FAIL);
        result.setRetInfo(outputParams);
        return result;
    }

    public static Result returnUnknown(Map<String, Object> outputParams) {
        Result result = new Result();
        result.setResultCode(UNKNOWN);
        result.setRetInfo(outputParams);
        return result;
    }
}
