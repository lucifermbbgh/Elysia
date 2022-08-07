package com.alicia.common.factory;

import com.alicia.common.base.IFactory;
import com.alicia.common.dto.fruits.Apple;
import com.alicia.common.dto.fruits.Fruits;
import com.alicia.common.dto.fruits.Mango;
import com.alicia.common.dto.fruits.Strawberry;

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
