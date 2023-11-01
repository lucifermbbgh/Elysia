package com.alicia.common.dto.person;

import com.alicia.common.base.BaseDto;

public class People implements BaseDto {
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
