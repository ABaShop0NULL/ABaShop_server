package com.abashop.pojo;

public class User {
    private Long userId;

    private String userName;

    private String sex;

    private String userPassword;

    private String phone;

    private String userImgId;

    public User(String userName, String sex, String phone) {
        this.userName = userName;
        this.sex = sex;
        this.phone = phone;
    }

    public User(Long userId, String userName, String sex, String userPassword, String phone, String userImgId) {
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