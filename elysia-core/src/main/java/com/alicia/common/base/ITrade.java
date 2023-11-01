<<<<<<<< HEAD:alicia-common/src/main/java/com/alicia/base/ITrade.java
package com.alicia.base;
========
package com.alicia.common.base;
>>>>>>>> release-20231101:elysia-core/src/main/java/com/alicia/common/base/ITrade.java

import com.alicia.common.dto.result.Result;

import java.util.Map;

public interface ITrade {
    Result excute(Map<String, Object> inputParams);
}
