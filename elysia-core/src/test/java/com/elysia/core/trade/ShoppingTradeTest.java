package com.elysia.core.trade;

import com.elysia.core.common.UnitTestBase;
import com.elysia.common.dto.result.Result;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingTradeTest extends UnitTestBase {
    //    @Autowired
    ShoppingTrade shoppingTrade = new ShoppingTrade();

    @Test
    public void shoppingTest() {
        Map<String, Object> inputParams = getInputParams();
        Result result = shoppingTrade.excute(inputParams);
        Map<String, Object> outputParams = result.getRetInfo();

        String peopleName = (String) outputParams.get("peopleName");
        double goodsCountPrice = (double) outputParams.get("goodsCountPrice");
        List<Map<String, Object>> goodsList = (List<Map<String, Object>>) outputParams.get("goodsInfo");

        String info = new StringBuffer("顾客").append(peopleName).append("购买商品总价").append(goodsCountPrice).append("其中包括以下几种商品：").append("\r\n").toString();
        for (Map<String, Object> goodsInfo : goodsList) {
            String goodsName = (String) goodsInfo.get("goodsName");
            Integer goodsWeight = (Integer) goodsInfo.get("goodsWeight");
            double goodsPrice = (double) goodsInfo.get("goodsPrice");
            info = new StringBuffer(info).append("商品名：").append(goodsName).append(" 商品总重：").append(goodsWeight).append(" 商品总价：").append(goodsPrice).append("\r\n").toString();

        }
        System.out.println("购买结果：" + info);
    }

    private Map<String, Object> getInputParams() {
        Map<String, Object> goodsInfo1 = new HashMap<>();
        goodsInfo1.put("goodsName", "苹果");
        goodsInfo1.put("goodsWeight", 4);
        goodsInfo1.put("goodsDiscount", "");
        Map<String, Object> goodsInfo2 = new HashMap<>();
        goodsInfo2.put("goodsName", "草莓");
        goodsInfo2.put("goodsWeight", 5);
        goodsInfo2.put("goodsDiscount", "0.8");
        Map<String, Object> goodsInfo3 = new HashMap<>();
        goodsInfo3.put("goodsName", "芒果");
        goodsInfo3.put("goodsWeight", 2);
        goodsInfo3.put("goodsDiscount", "");
        List<Map<String, Object>> goodsList = new ArrayList<>();
        goodsList.add(goodsInfo1);
        goodsList.add(goodsInfo2);
        goodsList.add(goodsInfo3);

        Map<String, Object> inputParams = new HashMap<>();
        inputParams.put("peopleName", "A");
        inputParams.put("peopleDiscountLevel", 2);
        inputParams.put("goodsList", goodsList);
        return inputParams;
    }

    public static void main(String[] args) {
        Map<String, Object> goods = new HashMap<>();
        String s = "0.85";
        goods.put("goodsDiscount", s);
        System.out.println(Double.parseDouble((String) goods.get("goodsDiscount")));
    }
}