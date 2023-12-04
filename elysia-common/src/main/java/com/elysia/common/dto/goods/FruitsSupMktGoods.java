package com.elysia.common.dto.goods;

import com.elysia.common.dto.fruits.Fruits;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FruitsSupMktGoods extends Goods {
    private static final long serialVersionUID = 1L;

    private Fruits fruits;
}
