package com.alicia.common.dto.fruits;

import com.alicia.common.base.BaseDto;

public class Fruits implements BaseDto {
    private static final long serialVersionUID = 1L;

    private String name;
    private double price;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}
