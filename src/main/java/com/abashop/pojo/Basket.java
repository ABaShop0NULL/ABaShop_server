package com.abashop.pojo;

import java.util.Date;

public class Basket {
    private Long basketId;

    private Long shopId;

    private Long goodsId;

    private Integer num;

    private String userId;

    private Date basketDate;

    public Basket(Long basketId, Long shopId, Long goodsId, Integer num, String userId, Date basketDate) {
        this.basketId = basketId;
        this.shopId = shopId;
        this.goodsId = goodsId;
        this.num = num;
        this.userId = userId;
        this.basketDate = basketDate;
    }

    public Basket() {
        super();
    }

    public Long getBasketId() {
        return basketId;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getBasketDate() {
        return basketDate;
    }

    public void setBasketDate(Date basketDate) {
        this.basketDate = basketDate;
    }
}