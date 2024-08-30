package com.elysia.common.base;

import com.elysia.common.pojo.common.Result;

import java.util.Map;

public interface ITrade {
    Result excute(Map<String, Object> inputParams);
}