package com.elysia.market.stock.core.impl;

import com.elysia.market.stock.core.service.impl.GateImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class GateImplTest {
    GateImpl gateImpl = new GateImpl();

    @Test
    public void test() {
        Map<String, Object> resultMap = gateImpl.openGate();
        Assert.assertEquals(resultMap.size(), 0);
    }
}