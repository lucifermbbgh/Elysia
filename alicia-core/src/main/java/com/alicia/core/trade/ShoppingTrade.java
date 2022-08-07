package com.alicia.core.trade;

import com.alicia.base.ITrade;
import com.alicia.core.dto.ShoppingTradeDto;
import com.alicia.dto.goods.FruitsSupMktGoods;
import com.alicia.dto.person.FruitsSupMktCustomer;
import com.alicia.dto.result.Result;
import com.alicia.util.DiscountMathUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
public class ShoppingTrade implements ITrade {

    @Override
    public Result excute(Map<String, Object> inputParams) {
        System.out.println("请求通讯区：" + inputParams);

        ShoppingTradeDto shoppingTradeDto = ShoppingTradeDto.getFruitsSupMktTradeInfo(inputParams);

        FruitsSupMktCustomer customer = (FruitsSupMktCustomer) shoppingTradeDto.getCustomer();
        List<FruitsSupMktGoods> fruitsSupMktGoodsList = customer.getGoods();
        double priceCount = 0d;
        List<Map<String, Object>> goodsList = new ArrayList<>();
        for (FruitsSupMktGoods goods : fruitsSupMktGoodsList) {
            priceCount += goods.getPrice();
            Map<String, Object> goodsInfo = new HashMap<>();
            goodsInfo.put("goodsName", goods.getFruits().getName());
            goodsInfo.put("goodsWeight", goods.getWeight());
            goodsInfo.put("goodsPrice", goods.getPrice());
            goodsList.add(goodsInfo);
        }

        Map<String, Object> outputParams = new HashMap<>();
        outputParams.put("peopleName", customer.getName());
        outputParams.put("goodsCountPrice", DiscountMathUtil.getDiscountLevelPrice(priceCount, customer.getDiscountLevel()));
        outputParams.put("goodsInfo", goodsList);

        return Result.returnSuccess(outputParams);
    }
}
