package com.alicia.core.dto;

import com.alicia.core.dto.common.AbstractTradeDto;
import com.alicia.dto.goods.Goods;
import com.alicia.dto.person.People;

public class ShoppingTradeDto extends AbstractTradeDto {

    private Goods fruitsGoods;
    private People customer;

    public Goods getFruitsGoods() {
        return fruitsGoods;
    }

    public void setFruitsGoods(Goods fruitsGoods) {
        this.fruitsGoods = fruitsGoods;
    }

    public People getCustomer() {
        return customer;
    }

    public void setCustomer(People customer) {
        this.customer = customer;
    }
}
