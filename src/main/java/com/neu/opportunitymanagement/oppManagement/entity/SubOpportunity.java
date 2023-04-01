package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class SubOpportunity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String subOppId;

    private String subOppName;

    private String subOppType;

    private String subOppProduct;

    private String subOppDept;

    private String subOppCurrency;

    private Double subOppMoney;

    private String subOppOppId;

    private String subOppStatus;


    public String getSubOppId() {
        return subOppId;
    }

    public void setSubOppId(String subOppId) {
        this.subOppId = subOppId;
    }

    public String getSubOppName() {
        return subOppName;
    }

    public void setSubOppName(String subOppName) {
        this.subOppName = subOppName;
    }

    public String getSubOppType() {
        return subOppType;
    }

    public void setSubOppType(String subOppType) {
        this.subOppType = subOppType;
    }

    public String getSubOppProduct() {
        return subOppProduct;
    }

    public void setSubOppProduct(String subOppProduct) {
        this.subOppProduct = subOppProduct;
    }

    public String getSubOppDept() {
        return subOppDept;
    }

    public void setSubOppDept(String subOppDept) {
        this.subOppDept = subOppDept;
    }

    public String getSubOppCurrency() {
        return subOppCurrency;
    }

    public void setSubOppCurrency(String subOppCurrency) {
        this.subOppCurrency = subOppCurrency;
    }

    public Double getSubOppMoney() {
        return subOppMoney;
    }

    public void setSubOppMoney(Double subOppMoney) {
        this.subOppMoney = subOppMoney;
    }

    public String getSubOppOppId() {
        return subOppOppId;
    }

    public void setSubOppOppId(String subOppOppId) {
        this.subOppOppId = subOppOppId;
    }

    public String getSubOppStatus() {
        return subOppStatus;
    }

    public void setSubOppStatus(String subOppStatus) {
        this.subOppStatus = subOppStatus;
    }

    @Override
    public String toString() {
        return "SubOpportunity{" +
        "subOppId=" + subOppId +
        ", subOppName=" + subOppName +
        ", subOppType=" + subOppType +
        ", subOppProduct=" + subOppProduct +
        ", subOppDept=" + subOppDept +
        ", subOppCurrency=" + subOppCurrency +
        ", subOppMoney=" + subOppMoney +
        ", subOppOppId=" + subOppOppId +
        ", subOppStatus=" + subOppStatus +
        "}";
    }
}
