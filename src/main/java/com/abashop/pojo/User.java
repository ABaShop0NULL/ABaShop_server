package com.abashop.pojo;

import com.sun.istack.internal.NotNull;
import org.springframework.lang.NonNull;

public class User {
    @NotNull
    private Long userId;

    @NotNull
    private String userName;

    private String sex;

    @NotNull
    private String userPassword;

    private String phone;

    private String userImgId;

    public User(Long userId, String userName, String sex, String userPassword, String phone, String userImgId) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.userPassword = userPassword;
        this.phone = phone;
        this.userImgId = userImgId;
    }

    //自定义构造函数，不能完全暴露用户信息
    public User(String userName, String sex, String phone, String userImgId) {
        this.userName = userName;
        this.sex = sex;
        this.phone = phone;
        this.userImgId = userImgId;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserImgId() {
        return userImgId;
    }

    public void setUserImgId(String userImgId) {
        this.userImgId = userImgId == null ? null : userImgId.trim();
    }
}