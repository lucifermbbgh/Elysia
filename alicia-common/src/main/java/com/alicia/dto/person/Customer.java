package com.alicia.dto.person;

import com.alicia.dto.goods.Goods;

public class Customer extends People {
    private static final long serialVersionUID = 1L;

    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
