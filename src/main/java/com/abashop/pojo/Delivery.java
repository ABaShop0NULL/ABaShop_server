package com.abashop.pojo;

import java.util.Date;

public class Delivery {
    private Long dvyId;

    private String dvyName;

    private String companyHomeUrl;

    private Date recTime;

    private Date modifyTime;

    private String queryUrl;

    public Delivery(Long dvyId, String dvyName, String companyHomeUrl, Date recTime, Date modifyTime, String queryUrl) {
        this.dvyId = dvyId;
        this.dvyName = dvyName;
        this.companyHomeUrl = companyHomeUrl;
        this.recTime = recTime;
        this.modifyTime = modifyTime;
        this.queryUrl = queryUrl;
    }

    public Delivery() {
        super();
    }

    public Long getDvyId() {
        return dvyId;
    }

    public void setDvyId(Long dvyId) {
        this.dvyId = dvyId;
    }

    public String getDvyName() {
        return dvyName;
    }

    public void setDvyName(String dvyName) {
        this.dvyName = dvyName == null ? null : dvyName.trim();
    }

    public String getCompanyHomeUrl() {
        return companyHomeUrl;
    }

    public void setCompanyHomeUrl(String companyHomeUrl) {
        this.companyHomeUrl = companyHomeUrl == null ? null : companyHomeUrl.trim();
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getQueryUrl() {
        return queryUrl;
    }

    public void setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl == null ? null : queryUrl.trim();
    }
}