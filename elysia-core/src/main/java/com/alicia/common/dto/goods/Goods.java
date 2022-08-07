package com.alicia.common.dto.goods;

import com.alicia.common.base.BaseDto;

public class Goods implements BaseDto {
    private static final long serialVersionUID = 1L;

    private double price;
    private Integer weight;
    private double discount;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
