package com.alicia.factory;

import com.alicia.common.IFactory;
import com.alicia.dto.fruits.Apple;
import com.alicia.dto.fruits.Fruits;
import com.alicia.dto.fruits.Mango;
import com.alicia.dto.fruits.Strawberry;

public class FruitsFactory implements IFactory {
    @Override
    public Fruits product(String beanName) {
        Fruits fruits = null;
        switch (beanName) {
            case "苹果":
                fruits = new Apple();
                break;
            case "草莓":
                fruits = new Strawberry();
                break;
            case "芒果":
                fruits = new Mango();
                break;
            default:
                break;
        }
        return fruits;
    }
}
