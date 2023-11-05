package com.elysia.core.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateController {
    @GetMapping("/open")
    public String openGate(){
        return "Welcome!";
    }
}
