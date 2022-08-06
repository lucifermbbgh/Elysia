package com.alicia.core.impl;

import com.alicia.core.trade.GateOpenTrade;
import com.alicia.service.trade.IGate;
import com.alicia.util.SpringBeanUtil;
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
