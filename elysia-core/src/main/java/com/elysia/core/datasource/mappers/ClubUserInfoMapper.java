package com.elysia.core.datasource.mappers;

import com.elysia.core.datasource.dao.ClubUserInfo;
import com.elysia.core.datasource.dao.ClubUserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClubUserInfoMapper {
    long countByExample(ClubUserInfoExample example);

    int deleteByExample(ClubUserInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClubUserInfo record);

    int insertSelective(ClubUserInfo record);

    List<ClubUserInfo> selectByExample(ClubUserInfoExample example);

    ClubUserInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClubUserInfo record, @Param("example") ClubUserInfoExample example);

    int updateByExample(@Param("record") ClubUserInfo record, @Param("example") ClubUserInfoExample example);

    int updateByPrimaryKeySelective(ClubUserInfo record);

    int updateByPrimaryKey(ClubUserInfo record);
}