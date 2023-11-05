package com.elysia.core.service;

import com.elysia.core.datasource.dao.ClubUserInfo;

public interface ClubUserInfoService {
    public ClubUserInfo selectByPrimaryKey(String id);
}
