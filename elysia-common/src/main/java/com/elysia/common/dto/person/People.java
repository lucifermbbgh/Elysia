package com.elysia.common.dto.person;

import com.elysia.common.base.BaseDto;

public class People extends BaseDto {
    private static final long serialVersionUID = 1L;

    private String name;
    private String cash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }
}
