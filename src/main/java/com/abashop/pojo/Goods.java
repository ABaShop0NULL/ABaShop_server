package com.abashop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Long goodsId;

    private String goodsName;

    private Long shopId;

    private BigDecimal oriPrice;

    private BigDecimal price;

    private String brief;

    private String goodsPic;

    private String goodsImgs;

    private Integer goodsStatus;

    private Long categoryId;

    private Integer soldNum;

    private Integer totalStocks;

    private Date createTime;

    private Date updateTime;

    private Date putawayTime;

    private String content;

    public Goods(Long goodsId, String goodsName, Long shopId, BigDecimal oriPrice, BigDecimal price, String brief, String goodsPic, String goodsImgs, Integer goodsStatus, Long categoryId, Integer soldNum, Integer totalStocks, Date createTime, Date updateTime, Date putawayTime) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.shopId = shopId;
        this.oriPrice = oriPrice;
        this.price = price;
        this.brief = brief;
        this.goodsPic = goodsPic;
        this.goodsImgs = goodsImgs;
        this.goodsStatus = goodsStatus;
        this.categoryId = categoryId;
        this.soldNum = soldNum;
        this.totalStocks = totalStocks;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.putawayTime = putawayTime;
    }

    public Goods(Long goodsId, String goodsName, Long shopId, BigDecimal oriPrice, BigDecimal price, String brief, String goodsPic, String goodsImgs, Integer goodsStatus, Long categoryId, Integer soldNum, Integer totalStocks, Date createTime, Date updateTime, Date putawayTime, String content) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.shopId = shopId;
        this.oriPrice = oriPrice;
        this.price = price;
        this.brief = brief;
        this.goodsPic = goodsPic;
        this.goodsImgs = goodsImgs;
        this.goodsStatus = goodsStatus;
        this.categoryId = categoryId;
        this.soldNum = soldNum;
        this.totalStocks = totalStocks;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.putawayTime = putawayTime;
        this.content = content;
    }

    public Goods() {
        super();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public BigDecimal getOriPrice() {
        return oriPrice;
    }

    public void setOriPrice(BigDecimal oriPrice) {
        this.oriPrice = oriPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public String getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(String goodsImgs) {
        this.goodsImgs = goodsImgs == null ? null : goodsImgs.trim();
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(Integer totalStocks) {
        this.totalStocks = totalStocks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}