package com.alicia.core.impl;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.*;

public class GateImplTest {
    GateImpl gateImpl = new GateImpl();

    @Test
    public void test() {
        Map<String, Object> resultMap = gateImpl.openGate();
        Assert.assertEquals(resultMap.size(), 0);
    }
}