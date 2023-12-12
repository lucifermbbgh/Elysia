package com.elysia.common.mapper;

import com.elysia.common.pojo.dao.ElysiaUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.common.mapper
 * @Author: ElysiaKafka
 * @CreateTime: 2023-12-08  12:14:51
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface ElysiaUserMapper {
    @Insert("<script>" +
            "INSERT INTO elysia_user (ID,USERNAME,PASSWORD,STATUS,ROLE_ID,REGISTRATION_DATE,LAST_LOGIN_DATE," +
            "CREATE_USER,CREATE_DATE,CREATE_TIME,UPDATE_USER,UPDATE_DATE,UPDATE_TIME) " +
            "VALUES ('#{id}','#{username}','#{password}','#{status}','#{roleId}','#{registrationDate}','#{lastLoginDate}'," +
            "'#{createUser}','#{createDate}','#{createTime}','#{updateUser}','#{updateDate}','#{updateTime}')" +
            "</script>")
    public void insertUser(ElysiaUser elysiaUser);

    @Delete("DELETE FROM elysia_user WHERE id = #{elysia.userId}")
    public void deleteUser(ElysiaUser elysiaUser);

    @Update("UPDATE elysia_user SET USERNAME = #{elysia.username},PASSWORD = #{elysia.password},STATUS = #{elysia.status}," +
            "ROLE_ID = #{elysia.roleId},REGISTRATION_DATE = #{elysia.registrationDate},LAST_LOGIN_DATE = #{elysia.lastLoginDate}," +
            "CREATE_USER = #{elysia.createUser},CREATE_DATE = #{elysia.createDate},CREATE_TIME = #{elysia.createTime}," +
            "UPDATE_USER = #{elysia.updateUser},UPDATE_DATE = #{elysia.updateDate},UPDATE_TIME = #{elysia.updateTime} " +
            "WHERE id = #{elysia.userId}")
    public void updateUser(ElysiaUser elysiaUser);

    @Select("SELECT Id, FROM elysia_user WHERE id = #{userId}")
    public ElysiaUser selectUserByPrimaryKey(String userId);

    public ElysiaUser selectUserByUsername(String username);

    public List<ElysiaUser> selectUserList(Map<String, Objects> params);
}
