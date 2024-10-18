package com.elysia.gate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elysia.gate.pojo.dao.ElysiaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.gate.mapper
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:37:45
 * @Description: Mybatis-Plus中的Mapper接口必须继承BaseMapper基类
 * @Version: 1.0
 */
@Mapper
public interface ElysiaUserMapper extends BaseMapper<ElysiaUser> {
    int createUser(ElysiaUser elysiaUser);

    int modifyPassword(BigInteger id, String password);

    int deleteUser(BigInteger id);

    ElysiaUser queryUserById(BigInteger id);

    @Select("select count(username) " +
            "from elysia_user " +
            "where username = #{username}"
    )
    int queryUserByUsername(String username);

    List<ElysiaUser> queryUserList(Map<String, Object> queryParams);
}
