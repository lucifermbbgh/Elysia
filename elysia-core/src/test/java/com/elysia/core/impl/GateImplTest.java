package com.elysia.core.impl;

import com.elysia.core.service.impl.GateImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class GateImplTest {
    GateImpl gateImpl = new GateImpl();

    @Test
    public void test() {
        Map<String, Object> resultMap = gateImpl.openGate();
        Assert.assertEquals(resultMap.size(), 0);
    }
}