package com.elysia.gate.service;

import com.elysia.common.pojo.common.Result;
import com.elysia.gate.pojo.dao.ElysiaUser;
import com.elysia.gate.pojo.dao.ElysiaUserInfo;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.service.user
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:10:40
 * @Description: TODO
 * @Version: 1.0
 */
public interface IUserService {
    /**
     * @description: 用户注册
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:11
     * @param: username
     * @param: password
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUser>
     **/
    Result<ElysiaUser> register(ElysiaUser elysiaUser);

    /**
     * @description: 重置密码
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: username
     * @param: password
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUser>
     **/
    Result<ElysiaUser> resetPassword(String username, String password);

    /**
     * @description: 用户注销
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: elysiaUser
     * @return: com.elysia.common.pojo.common.Result
     **/
    Result deleteAccount(ElysiaUser elysiaUser);

    /**
     * @description: 查询用户列表
     * @author: ElysiaKafka
     * @date: 2024/2/1 11:55
     * @return: com.elysia.common.pojo.common.Result<java.util.List<com.elysia.gate.pojo.dao.ElysiaUser>>
     **/
    Result<List<ElysiaUser>> queryUserList(Map<String, Object> queryParams) throws Exception;

    /**
     * @description: 查询用户信息
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: username
     * @param: password
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUserInfo>
     **/
    Result<ElysiaUserInfo> queryUserInfo(String username, String password);

    /**
     * @description: 查询用户信息列表
     * @author: ElysiaKafka
     * @date: 2024/2/1 11:55
     * @return: com.elysia.common.pojo.common.Result<java.util.List<com.elysia.gate.pojo.dao.ElysiaUserInfo>>
     **/
    Result<List<ElysiaUserInfo>> queryUserInfoList(Map<String, Object> queryParams);

    /**
     * @description: 修改用户信息
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: elysiaUserInfo
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUserInfo>
     **/
    Result<ElysiaUserInfo> updateUserInfo(ElysiaUserInfo elysiaUserInfo);

    /**
     * @description: 修改用户信息
     * @author: ElysiaKafka
     * @date: 2024/1/25 23:12
     * @param: elysiaUserInfo
     * @return: com.elysia.common.pojo.common.Result<com.elysia.common.pojo.dao.ElysiaUserInfo>
     **/
    Result<ElysiaUserInfo> addUserInfo(ElysiaUserInfo elysiaUserInfo);

    Result<ElysiaUser> registerWithUserDetails(ElysiaUser elysiaUser);
}
