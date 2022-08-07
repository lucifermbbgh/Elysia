package com.alicia.base;

import com.alicia.dto.result.Result;

import java.util.Map;

public interface ITrade {
    Result excute(Map<String, Object> inputParams);
}
