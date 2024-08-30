package com.elysia.gate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elysia.gate.pojo.dao.ElysiaUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: elysia-gate
 * @BelongsPackage: com.elysia.gate.mapper
 * @Author: ElysiaKafka
 * @CreateTime: 2024-01-26  23:11:05
 * @Description: Mybatis-Plus中的Mapper接口必须继承BaseMapper基类
 * @Version: 1.0
 */
@Mapper
public interface ElysiaUserInfoMapper extends BaseMapper<ElysiaUserInfo> {
    int createUserInfo(ElysiaUserInfo elysiaUserInfo);

    int modifyUserInfo(ElysiaUserInfo elysiaUserInfo);

    int deleteUserInfo(BigInteger id);

    ElysiaUserInfo queryUserInfo(BigInteger id);

    List<ElysiaUserInfo> queryAllUserInfo();

    List<ElysiaUserInfo> queryUserInfoList(Map<String, Object> queryParams);
}
