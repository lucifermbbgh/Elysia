package com.elysia.gate.service;


import com.elysia.gate.pojo.dao.ElysiaRole;

import java.util.List;

/**
 * @BelongsProject: elysia-market-parent
 * @BelongsPackage: com.elysia.gate.api.user
 * @Author: ElysiaKafka
 * @CreateTime: 2024-01-25  23:31:27
 * @Description: TODO
 * @Version: 1.0
 */
public interface IUserRoleService {
    /**
     * @description: 添加用户角色
     * @author: ElysiaKafka
     * @date: 2024/1/26 23:16
     * @param: userId
     * @param: roleIds
     * @return: int
     **/
    int authUserRoles(String userId, String[] roleIds);

    /**
     * @description: 删除用户角色
     * @author: ElysiaKafka
     * @date: 2024/1/26 23:16
     * @param: userId
     * @param: roleIds
     * @return: int
     **/
    int unAuthUserRoles(String userId, String[] roleIds);

    /**
     * @description: 查询用户角色
     * @author: ElysiaKafka
     * @date: 2024/1/26 23:19
     * @param: userId
     * @return: java.util.List<com.elysia.common.pojo.dao.ElysiaRole>
     **/
    List<ElysiaRole> queryUserRoles(String userId);
}
