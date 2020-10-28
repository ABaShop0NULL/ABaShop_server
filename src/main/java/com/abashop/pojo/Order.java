package com.abashop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long orderId;

    private Long shopId;

    private String prodName;

    private String userId;

    private String orderNumber;

    private BigDecimal total;

    private BigDecimal actualTotal;

    private Integer payType;

    private String remarks;

    private Integer status;

    private String dvyType;

    private Long dvyId;

    private String dvyFlowId;

    private BigDecimal freightAmount;

    private Long addrOrderId;

    private Integer productNums;

    private Date createTime;

    private Date updateTime;

    private Date payTime;

    private Date dvyTime;

    private Date finallyTime;

    private Date cancelTime;

    private Boolean isPayed;

    private Integer deleteStatus;

    private Integer refundSts;

    private BigDecimal reduceAmount;

    private Byte orderType;

    private Byte closeType;

    public Order(Long orderId, Long shopId, String prodName, String userId, String orderNumber, BigDecimal total, BigDecimal actualTotal, Integer payType, String remarks, Integer status, String dvyType, Long dvyId, String dvyFlowId, BigDecimal freightAmount, Long addrOrderId, Integer productNums, Date createTime, Date updateTime, Date payTime, Date dvyTime, Date finallyTime, Date cancelTime, Boolean isPayed, Integer deleteStatus, Integer refundSts, BigDecimal reduceAmount, Byte orderType, Byte closeType) {
        this.orderId = orderId;
        this.shopId = shopId;
        this.prodName = prodName;
        this.userId = userId;
        this.orderNumber = orderNumber;
        this.total = total;
        this.actualTotal = actualTotal;
        this.payType = payType;
        this.remarks = remarks;
        this.status = status;
        this.dvyType = dvyType;
        this.dvyId = dvyId;
        this.dvyFlowId = dvyFlowId;
        this.freightAmount = freightAmount;
        this.addrOrderId = addrOrderId;
        this.productNums = productNums;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.payTime = payTime;
        this.dvyTime = dvyTime;
        this.finallyTime = finallyTime;
        this.cancelTime = cancelTime;
        this.isPayed = isPayed;
        this.deleteStatus = deleteStatus;
        this.refundSts = refundSts;
        this.reduceAmount = reduceAmount;
        this.orderType = orderType;
        this.closeType = closeType;
    }

    public Order() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getActualTotal() {
        return actualTotal;
    }

    public void setActualTotal(BigDecimal actualTotal) {
        this.actualTotal = actualTotal;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDvyType() {
        return dvyType;
    }

    public void setDvyType(String dvyType) {
        this.dvyType = dvyType == null ? null : dvyType.trim();
    }

    public Long getDvyId() {
        return dvyId;
    }

    public void setDvyId(Long dvyId) {
        this.dvyId = dvyId;
    }

    public String getDvyFlowId() {
        return dvyFlowId;
    }

    public void setDvyFlowId(String dvyFlowId) {
        this.dvyFlowId = dvyFlowId == null ? null : dvyFlowId.trim();
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Long getAddrOrderId() {
        return addrOrderId;
    }

    public void setAddrOrderId(Long addrOrderId) {
        this.addrOrderId = addrOrderId;
    }

    public Integer getProductNums() {
        return productNums;
    }

    public void setProductNums(Integer productNums) {
        this.productNums = productNums;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDvyTime() {
        return dvyTime;
    }

    public void setDvyTime(Date dvyTime) {
        this.dvyTime = dvyTime;
    }

    public Date getFinallyTime() {
        return finallyTime;
    }

    public void setFinallyTime(Date finallyTime) {
        this.finallyTime = finallyTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Boolean getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(Boolean isPayed) {
        this.isPayed = isPayed;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getRefundSts() {
        return refundSts;
    }

    public void setRefundSts(Integer refundSts) {
        this.refundSts = refundSts;
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Byte getCloseType() {
        return closeType;
    }

    public void setCloseType(Byte closeType) {
        this.closeType = closeType;
    }
}