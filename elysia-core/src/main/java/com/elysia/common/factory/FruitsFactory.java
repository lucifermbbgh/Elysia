package com.elysia.common.factory;

import com.elysia.common.base.IFactory;
import com.elysia.common.dto.fruits.Apple;
import com.elysia.common.dto.fruits.Fruits;
import com.elysia.common.dto.fruits.Mango;
import com.elysia.common.dto.fruits.Strawberry;

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
