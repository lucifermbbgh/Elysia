package com.elysia.common.base;

import com.elysia.common.dto.result.Result;

import java.util.Map;

public interface ITrade {
    Result excute(Map<String, Object> inputParams);
}