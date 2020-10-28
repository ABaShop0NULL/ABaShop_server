package com.abashop.pojo;

import java.util.Date;

public class Shop {
    private Long shopId;

    private String shopName;

    private String shopLogo;

    private Byte shopStatus;

    private Date createTime;

    private String userId;

    private String userName;

    public Shop(Long shopId, String shopName, String shopLogo, Byte shopStatus, Date createTime, String userId, String userName) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopLogo = shopLogo;
        this.shopStatus = shopStatus;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
    }

    public Shop() {
        super();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo == null ? null : shopLogo.trim();
    }

    public Byte getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Byte shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}