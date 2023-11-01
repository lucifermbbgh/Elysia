package com.alicia.core.impl;

import com.alicia.core.service.impl.GateImpl;
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