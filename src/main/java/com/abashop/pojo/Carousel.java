package com.abashop.pojo;

import java.util.Date;

public class Carousel {
    private Long imgId;

    private Long shopId;

    private String imgUrl;

    private String des;

    private Date uploadTime;

    private Integer categoryId;

    public Carousel(Long imgId, Long shopId, String imgUrl, String des, Date uploadTime, Integer categoryId) {
        this.imgId = imgId;
        this.shopId = shopId;
        this.imgUrl = imgUrl;
        this.des = des;
        this.uploadTime = uploadTime;
        this.categoryId = categoryId;
    }

    public Carousel() {
        super();
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}