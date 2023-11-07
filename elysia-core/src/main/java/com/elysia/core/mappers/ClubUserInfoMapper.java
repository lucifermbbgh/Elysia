package com.elysia.core.mappers;

import com.elysia.core.pojo.ClubUserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClubUserInfoMapper {
    int deleteByPrimaryKey(String id);

    @Insert("INSERT INTO club_user_info(" +
            "ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, GENDER, BIRTHDATE, EMAIL, PHONE, ADDRESS, COUNTRY, CITY, " +
            "POSTALCODE, AVATAR, STATUS, ROLEID, " +
            "REGISTRATION_DATE, LASTLOGIN_DATE, " +
            "CREATE_USER, CREATE_DATE, CREATE_TIME, " +
            "UPDATE_USER, UPDATE_DATE, UPDATE_TIME) VALUES " +
            "(#{id}, #{username}, #{password}, #{firstname}, #{lastname}, #{gender}, #{birthdate}, " +
            "#{email}, #{phone}, #{address}, #{country}, #{city}" +
            "#{postalcode}, #{avatar}, #{status}, #{roleid}, " +
            "#{registration_date}, #{lastlogin_date}, " +
            "#{create_user}, #{create_date}, #{create_time}, " +
            "#{update_user}, #{update_date}, #{update_time});")
    int insert(ClubUserInfo clubUserInfo);

    int insertSelective(ClubUserInfo clubUserInfo);

    @Select("<script>" +
            "select " +
            "ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, GENDER, BIRTHDATE, EMAIL, PHONE, ADDRESS, COUNTRY, CITY, " +
            "POSTALCODE, AVATAR, STATUS, ROLEID, " +
            "REGISTRATION_DATE, LASTLOGIN_DATE, " +
            "CREATE_USER, CREATE_DATE, CREATE_TIME, " +
            "UPDATE_USER, UPDATE_DATE, UPDATE_TIME " +
            "from club_user_info " +
            "<where> " +
            " ID = #{id}" +
            "</where>" +
            "</script>")
    ClubUserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClubUserInfo record);

    int updateByPrimaryKey(ClubUserInfo record);
}