package com.elysia.core.service;

import com.elysia.core.pojo.ClubUserInfo;

public interface ClubUserInfoService {
    public ClubUserInfo getUserInfo(String id);

    public void addUser(ClubUserInfo clubUserInfo);
}
