package com.elysia.market.order.controller;

import com.elysia.common.pojo.common.Result;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;
@SpringBootTest
public class ConfigControllerTest extends TestCase {

    @Autowired
    ConfigController configController;

    public void test() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }

    @Test
    public void test2() {
        try {
            while (true){
                int i = 0;
                if (i++ == 10000000){
                    break;
                }

                Result<String> orderInfo2 = configController.getOrderInfo2("1111");
                System.out.println(orderInfo2);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}