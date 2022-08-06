package com.alicia.dto.fruits;

import com.alicia.common.BaseDto;

public class Fruits implements BaseDto {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer price;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
