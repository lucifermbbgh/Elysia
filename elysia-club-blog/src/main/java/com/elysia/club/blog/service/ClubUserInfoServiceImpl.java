package com.elysia.club.blog.service;

import com.elysia.club.api.common.ClubUserInfoService;
import com.elysia.club.api.pojo.ClubUser;
import com.elysia.club.api.pojo.ClubUserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.club.blog.service
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-23  16:36:50
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class ClubUserInfoServiceImpl implements ClubUserInfoService {
    /**
     * @description:注册账户
     * @author: ElysiaKafka
     * @date: 2023/11/23 12:07
     * @param: clubUserInfo
     */
    @Override
    public void register(ClubUser clubUser) {

    }

    /**
     * @description:注销账户
     * @author: ElysiaKafka
     * @date: 2023/11/23 16:37
     * @param: id
     */
    @Override
    public void unsubscribe(String id) {

    }

    /**
     * @description:更新用户信息
     * @author: ElysiaKafka
     * @date: 2023/11/23 12:08
     * @param: clubUserInfo
     * @return: com.elysia.club.api.pojo.ClubUserInfo
     */
    @Override
    public ClubUserInfo updateInfo(ClubUserInfo clubUserInfo) {
        return null;
    }

    /**
     * @description:更新用户密码
     * @author: ElysiaKafka
     * @date: 2023/11/23 16:37
     * @param: clubUser
     * @return: com.elysia.club.api.pojo.ClubUser
     */
    @Override
    public ClubUser updatePassword(ClubUser clubUser) {
        return null;
    }

    /**
     * @description:用户查询（单一用户查询）
     * @author: ElysiaKafka
     * @date: 2023/11/23 16:35
     * @param: id
     * @return: com.elysia.club.api.pojo.ClubUser
     */
    @Override
    public ClubUser getUser(String id) {
        return null;
    }

    /**
     * @description:用户批量查询
     * @author: ElysiaKafka
     * @date: 2023/11/23 16:34
     * @param: params
     * @return: java.util.List<com.elysia.club.api.pojo.ClubUser>
     */
    @Override
    public List<ClubUser> getUserList(Map<String, Object> params) {
        return null;
    }

    /**
     * @description:用户信息查询（单一用户查询）
     * @author: ElysiaKafka
     * @date: 2023/11/23 12:07
     * @param: id
     * @return: com.elysia.club.api.pojo.ClubUserInfo
     */
    @Override
    public ClubUserInfo getUserInfo(String id) {
        return null;
    }

    /**
     * @description: 用户信息批量查询
     * @author: ElysiaKafka
     * @date: 2023/11/23 16:34
     * @param: params
     * @return: java.util.List<com.elysia.club.api.pojo.ClubUserInfo>
     */
    @Override
    public List<ClubUserInfo> getUserInfoList(Map<String, Object> params) {
        return null;
    }
}
