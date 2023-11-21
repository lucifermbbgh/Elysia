package com.elysia.market.stock.core.service.impl;

import com.elysia.market.stock.core.trade.GateOpenTrade;
import com.elysia.market.stock.core.service.IGate;
import com.elysia.common.util.SpringBeanUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GateImpl implements IGate {
    @Override
    public Map<String, Object> openGate() {
        Object object = SpringBeanUtil.getBean("gateOpenTrade");

        GateOpenTrade trade = new GateOpenTrade();
        return trade.gateOpen();
    }
}
