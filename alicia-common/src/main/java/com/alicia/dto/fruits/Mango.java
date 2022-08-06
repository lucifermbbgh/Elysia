package com.alicia.dto.fruits;

import com.alicia.dto.BaseDto;

public class Mango implements BaseDto {
    private static final long serialVersionUID = 1L;

    private Integer price;
    private Integer weight;

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
}
