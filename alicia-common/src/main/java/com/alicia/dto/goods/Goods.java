package com.alicia.dto.goods;

import com.alicia.common.BaseDto;

public class Goods implements BaseDto {
    private static final long serialVersionUID = 1L;

    private Integer price;
    private Integer weight;
    private Integer discount;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
