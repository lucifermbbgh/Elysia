package com.elysia.core.service.impl;

import com.elysia.core.trade.GateOpenTrade;
import com.elysia.core.service.IGate;
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
