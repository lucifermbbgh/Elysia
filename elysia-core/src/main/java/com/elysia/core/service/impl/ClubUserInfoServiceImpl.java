package com.elysia.core.service.impl;

import com.elysia.common.exception.ServiceFailException;
import com.elysia.common.util.IdGeneratorUtil;
import com.elysia.core.mappers.ClubUserInfoMapper;
import com.elysia.core.pojo.ClubUserInfo;
import com.elysia.core.service.ClubUserInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClubUserInfoServiceImpl implements ClubUserInfoService {
    @Autowired
    private ClubUserInfoMapper clubUserInfoMapper;
    @Autowired
    private RedisTemplate redisTemplate;

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
            String id = (String) redisTemplate.opsForValue().get(clubUserInfo.getUsername());
            if (StringUtils.isNotBlank(id)) {
                throw new ServiceFailException("10002", "已存在相同用户名，请重新输入");
            }
            redisTemplate.opsForValue().set(clubUserInfo.getUsername(), IdGeneratorUtil.getId());
            clubUserInfoMapper.register(clubUserInfo);
        } catch (Exception e) {
            String errorCode = ServiceFailException.DEFAULT_ERROR_CODE;
            String errorInfo = ExceptionUtils.getStackTrace(e);
            LOGGER.error(errorInfo);
            throw new ServiceFailException(errorCode, errorInfo);
        }
    }
}
