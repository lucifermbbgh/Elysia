package com.alicia.common.dto.goods;

import com.alicia.common.dto.fruits.Fruits;

public class FruitsSupMktGoods extends Goods {
    private static final long serialVersionUID = 1L;

    private Fruits fruits;

    public Fruits getFruits() {
        return fruits;
    }

    public void setFruits(Fruits fruits) {
        this.fruits = fruits;
    }
}
