package com.abashop.pojo;

import java.util.Date;

public class Category {
    private Long categoryId;

    private Long shopId;

    private Long parentId;

    private String categoryName;

    private String icon;

    private String pic;

    private Integer seq;

    private Integer status;

    private Date recTime;

    private Integer grade;

    private Date updateTime;

    public Category(Long categoryId, Long shopId, Long parentId, String categoryName, String icon, String pic, Integer seq, Integer status, Date recTime, Integer grade, Date updateTime) {
        this.categoryId = categoryId;
        this.shopId = shopId;
        this.parentId = parentId;
        this.categoryName = categoryName;
        this.icon = icon;
        this.pic = pic;
        this.seq = seq;
        this.status = status;
        this.recTime = recTime;
        this.grade = grade;
        this.updateTime = updateTime;
    }

    public Category() {
        super();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}