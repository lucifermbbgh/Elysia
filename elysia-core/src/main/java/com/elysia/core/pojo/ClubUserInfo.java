package com.elysia.core.pojo;

import com.elysia.common.base.BaseDao;
import lombok.Data;

@Data
public class ClubUserInfo extends BaseDao {
    private String id;// ID
    private String username;// 用户名
    private String password;// 用户密码
    private String firstname;// 用户姓氏
    private String lastname;// 用户姓名
    private Byte gender;// 性别
    private String birthdate;// 生日
    private String email;// 邮箱
    private String phone;// 联系方式
    private String address;// 居住地
    private String country;// 国家地区
    private String city;// 籍贯
    private String postalcode;// 居住地邮编
    private String avatar;// 头像
    private Byte status;// 用户账号状态
    private String roleid;// 用户角色ID
    private String registrationDate;// 用户注册日期
    private String lastloginDate;// 最后登录日期
    private String createUser;// 创建用户
    private String createDate;// 创建日期
    private String createTime;// 创建时间
    private String updateUser;// 更新用户
    private String updateDate;// 更新日期
    private String updateTime;// 更新时间
}
