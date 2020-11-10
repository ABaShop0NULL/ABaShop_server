package com.abashop.pojo;

import java.util.Date;

public class UserAddr {
    private Long addId;

    private Long userId;

    private String receiver;

    private String province;

    private Long provinceId;

    private String city;

    private Long cityId;

    private String area;

    private Long areaId;

    private String postCode;

    private String addr;

    private String mobile;

    private String commonAddr;

    private Date createTime;

    private Date updateTime;

    public UserAddr(Long addId, Long userId, String receiver, String province, Long provinceId, String city, Long cityId, String area, Long areaId, String postCode, String addr, String mobile, String commonAddr, Date createTime, Date updateTime) {
        this.addId = addId;
        this.userId = userId;
        this.receiver = receiver;
        this.province = province;
        this.provinceId = provinceId;
        this.city = city;
        this.cityId = cityId;
        this.area = area;
        this.areaId = areaId;
        this.postCode = postCode;
        this.addr = addr;
        this.mobile = mobile;
        this.commonAddr = commonAddr;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserAddr() {
        super();
    }

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addId) {
        this.addId = addId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCommonAddr() {
        return commonAddr;
    }

    public void setCommonAddr(String commonAddr) {
        this.commonAddr = commonAddr == null ? null : commonAddr.trim();
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
}