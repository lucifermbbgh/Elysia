package com.elysia.core.service.impl;

import com.elysia.common.exception.ServiceFailException;
import com.elysia.core.mappers.ClubUserInfoMapper;
import com.elysia.core.pojo.ClubUserInfo;
import com.elysia.core.service.ClubUserInfoService;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubUserInfoServiceImpl implements ClubUserInfoService {
    @Autowired
    private ClubUserInfoMapper clubUserInfoMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClubUserInfoServiceImpl.class);

    @Override
    public ClubUserInfo getUserInfo(String id) {
        ClubUserInfo clubUserInfo = new ClubUserInfo();
        clubUserInfo.toString();
        return clubUserInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addUser(ClubUserInfo clubUserInfo) throws ServiceFailException {
        try {
            clubUserInfoMapper.insert(clubUserInfo);
        } catch (Exception e) {
            String errorCode = ServiceFailException.DEFAULT_ERROR_CODE;
            String errorInfo = ExceptionUtils.getStackTrace(e);
            LOGGER.error(errorInfo);
            throw new ServiceFailException(errorCode, errorInfo);
        }
    }
}
