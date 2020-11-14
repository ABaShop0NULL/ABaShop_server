package com.abashop.pojo;

import java.util.Date;

public class Basket {
    private Long basketId;

    private Long shopId;

    private Long goodsId;

    private Integer num;

    private Long userId;

    private Date basketDate;

    private Shop shop;
    private Goods goods;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }


    public Basket(Long basketId, Long shopId, Long goodsId, Integer num, Long userId, Date basketDate) {
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getBasketDate() {
        return basketDate;
    }

    public void setBasketDate(Date basketDate) {
        this.basketDate = basketDate;
    }
}