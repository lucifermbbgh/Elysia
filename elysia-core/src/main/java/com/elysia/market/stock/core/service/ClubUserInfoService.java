package com.elysia.market.stock.core.service;

import com.elysia.market.stock.core.pojo.ClubUserInfo;

public interface ClubUserInfoService {
    public ClubUserInfo getUserInfo(String id);

    public void addUser(ClubUserInfo clubUserInfo);
}
