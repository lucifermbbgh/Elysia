package com.alicia.common.base;

import com.alicia.common.dto.result.Result;

import java.util.Map;

public interface ITrade {
    Result excute(Map<String, Object> inputParams);
}
