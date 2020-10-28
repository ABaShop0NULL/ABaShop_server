package com.abashop.pojo;

public class User {
    private String userId;

    private String userName;

    private String sex;

    private String userPassword;

    private Integer phone;

    private String userImgId;

    public User(String userId, String userName, String sex, String userPassword, Integer phone, String userImgId) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.userPassword = userPassword;
        this.phone = phone;
        this.userImgId = userImgId;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getUserImgId() {
        return userImgId;
    }

    public void setUserImgId(String userImgId) {
        this.userImgId = userImgId == null ? null : userImgId.trim();
    }
}