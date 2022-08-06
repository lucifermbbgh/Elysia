package com.alicia.core.trade;

import com.alicia.core.dto.ShoppingTradeDto;
import com.alicia.dto.fruits.Fruits;
import com.alicia.dto.goods.FruitsSupMktGoods;
import com.alicia.dto.person.Customer;
import com.alicia.dto.person.People;
import com.alicia.dto.result.Result;
import com.alicia.factory.FruitsFactory;
import com.alicia.service.base.ITrade;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ShoppingTrade implements ITrade {

    @Override
    public Result excute(Map<String, Object> inputParams) {
        System.out.println("请求通讯区：" + inputParams);

        String goodsName = (String) inputParams.get("goodsName");
        Integer goodsWeight = (Integer) inputParams.get("goodsWeight");
        String peopleName = (String) inputParams.get("peopleName");

        FruitsFactory factory = new FruitsFactory();
        Fruits fruits = factory.product(goodsName);

        FruitsSupMktGoods goods = new FruitsSupMktGoods();
        goods.setFruits(fruits);

        Customer customer = new Customer();
        customer.setName(peopleName);
        customer.setGoods(goods);

        ShoppingTradeDto shoppingTradeDto = new ShoppingTradeDto();
        shoppingTradeDto.setCustomer(customer);
        shoppingTradeDto.setFruitsGoods(goods);

        
        return null;
    }
}
