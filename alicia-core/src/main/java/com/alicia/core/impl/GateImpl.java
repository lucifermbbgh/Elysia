package com.alicia.core.impl;

import com.alicia.core.trade.GateOpenTrade;
import com.alicia.service.IGate;
import com.alicia.util.SpringBeanUtil;

import java.util.Map;

public class GateImpl implements IGate {
    @Override
    public Map<String, Object> openGate() {
        Object object = SpringBeanUtil.getBean("gateOpenTrade");

        GateOpenTrade trade = new GateOpenTrade();
        return trade.gateOpen();
    }
}
