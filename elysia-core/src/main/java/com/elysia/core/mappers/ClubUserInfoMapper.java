package com.elysia.core.mappers;

import com.elysia.core.pojo.ClubUserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ClubUserInfoMapper {
    @Select("<script>" +
            "select " +
            "ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, GENDER, BIRTHDATE, EMAIL, PHONE, ADDRESS, COUNTRY, CITY, " +
            "POSTALCODE, AVATAR, STATUS, ROLE_ID, " +
            "REGISTRATION_DATE, LASTLOGIN_DATE, " +
            "CREATE_USER, CREATE_DATE, CREATE_TIME, " +
            "UPDATE_USER, UPDATE_DATE, UPDATE_TIME " +
            "from club_user_info " +
            "<where> " +
            " ID = #{id}" +
            "</where>" +
            "</script>")
    ClubUserInfo selectByPrimaryKey(String id);

    @Insert("INSERT INTO club_user_info(" +
            "ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, GENDER, BIRTHDATE, EMAIL, PHONE, ADDRESS, COUNTRY, CITY, " +
            "POSTALCODE, AVATAR, STATUS, ROLE_ID, " +
            "REGISTRATION_DATE, LASTLOGIN_DATE, " +
            "CREATE_USER, CREATE_DATE, CREATE_TIME, " +
            "UPDATE_USER, UPDATE_DATE, UPDATE_TIME) VALUES " +
            "(#{id}, #{username}, #{password}, #{firstname}, #{lastname}, #{gender}, #{birthdate}, " +
            "#{email}, #{phone}, #{address}, #{country}, #{city}" +
            "#{postalcode}, #{avatar}, #{status}, #{roleId}, " +
            "#{registration_date}, #{lastlogin_date}, " +
            "#{create_user}, #{create_date}, #{create_time}, " +
            "#{update_user}, #{update_date}, #{update_time});")
    int insert(ClubUserInfo clubUserInfo);

    @Insert("INSERT INTO club_user_info(" +
            "ID, USERNAME, PASSWORD, STATUS, ROLE_ID, " +
            "REGISTRATION_DATE, CREATE_USER, CREATE_DATE, CREATE_TIME) VALUES " +
            "(#{id}, #{username}, #{password}, #{status}, #{roleId}, " +
            "#{registration_date}, #{create_user}, #{create_date}, #{create_time};")
    int register(ClubUserInfo clubUserInfo);

    @Update("<script>" +
            "update club_user_info set" +
            "USERNAME = #{username}, PASSWORD = #{password}, FIRSTNAME = #{firstname}, LASTNAME = #{lastname}, " +
            "GENDER = #{gender}, BIRTHDATE = #{birthdate}, EMAIL = #{email}, PHONE = #{phone}, " +
            "ADDRESS = #{address}, COUNTRY = #{country}, CITY = #{city}, " +
            "POSTALCODE = #{postalcode}, AVATAR = #{avatar}, STATUS = #{status}, ROLE_ID = #{roleId}, " +
            "REGISTRATION_DATE = #{registrationDate}, LASTLOGIN_DATE = #{lastloginDate}, " +
            "CREATE_USER = #{createUser}, CREATE_DATE = #{createDate}, CREATE_TIME = #{createTime}, " +
            "UPDATE_USER = #{updateUser}, UPDATE_DATE = #{updateDate}, UPDATE_TIME  = #{updateTime}" +
            "<where> " +
            " ID = #{id}" +
            "</where>" +
            "</script>")
    int updateByPrimaryKeySelective(ClubUserInfo clubUserInfo);

    @Update("<script>" +
            "update club_user_info set" +
            "USERNAME = #{username}, PASSWORD = #{password}, FIRSTNAME = #{firstname}, LASTNAME = #{lastname}, " +
            "GENDER = #{gender}, BIRTHDATE = #{birthdate}, EMAIL = #{email}, PHONE = #{phone}, " +
            "ADDRESS = #{address}, COUNTRY = #{country}, CITY = #{city}, " +
            "POSTALCODE = #{postalcode}, AVATAR = #{avatar}, STATUS = #{status}, ROLE_ID = #{roleId}, " +
            "REGISTRATION_DATE = #{registrationDate}, LASTLOGIN_DATE = #{lastloginDate}, " +
            "CREATE_USER = #{createUser}, CREATE_DATE = #{createDate}, CREATE_TIME = #{createTime}, " +
            "UPDATE_USER = #{updateUser}, UPDATE_DATE = #{updateDate}, UPDATE_TIME  = #{updateTime}" +
            "<where> " +
            " ID = #{id}" +
            "</where>" +
            "</script>")
    int updateByPrimaryKey(ClubUserInfo clubUserInfo);

    @Delete("<script>" +
            "delete " +
            "from club_user_info " +
            "<where> " +
            " ID = #{id}" +
            "</where>" +
            "</script>")
    int deleteByPrimaryKey(String id);
}