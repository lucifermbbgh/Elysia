package com.elysia.market.stock.core.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateController {

    private int openCount = 0;

    private static final Logger LOGGER = LoggerFactory.getLogger(GateController.class);

    @GetMapping("/open")
    public String openGate() {
        StringBuffer info = new StringBuffer("");
        info.append("欢迎访问ELYSIA CLUB！本次是第").append(++openCount).append("次访问！");
        LOGGER.info(info.toString());
        return info.toString();
    }
}
