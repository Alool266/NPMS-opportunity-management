package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

public class SubOpportunityBuffer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sub_oppb_id", type = IdType.AUTO)
    private Integer subOppbId;

    private String subOppbName;

    private String subOppbType;

    private String subOppbProduct;

    private String subOppbDept;

    private String subOppbCurrency;

    private Double subOppbMoney;

    private String subOppbStatus;

    private Integer subOppbOppId;


    public Integer getSubOppbId() {
        return subOppbId;
    }

    public void setSubOppbId(Integer subOppbId) {
        this.subOppbId = subOppbId;
    }

    public String getSubOppbName() {
        return subOppbName;
    }

    public void setSubOppbName(String subOppbName) {
        this.subOppbName = subOppbName;
    }

    public String getSubOppbType() {
        return subOppbType;
    }

    public void setSubOppbType(String subOppbType) {
        this.subOppbType = subOppbType;
    }

    public String getSubOppbProduct() {
        return subOppbProduct;
    }

    public void setSubOppbProduct(String subOppbProduct) {
        this.subOppbProduct = subOppbProduct;
    }

    public String getSubOppbDept() {
        return subOppbDept;
    }

    public void setSubOppbDept(String subOppbDept) {
        this.subOppbDept = subOppbDept;
    }

    public String getSubOppbCurrency() {
        return subOppbCurrency;
    }

    public void setSubOppbCurrency(String subOppbCurrency) {
        this.subOppbCurrency = subOppbCurrency;
    }

    public Double getSubOppbMoney() {
        return subOppbMoney;
    }

    public void setSubOppbMoney(Double subOppbMoney) {
        this.subOppbMoney = subOppbMoney;
    }

    public String getSubOppbStatus() {
        return subOppbStatus;
    }

    public void setSubOppbStatus(String subOppbStatus) {
        this.subOppbStatus = subOppbStatus;
    }

    public Integer getSubOppbOppId() {
        return subOppbOppId;
    }

    public void setSubOppbOppId(Integer subOppbOppId) {
        this.subOppbOppId = subOppbOppId;
    }

    @Override
    public String toString() {
        return "SubOpportunityBuffer{" +
        "subOppbId=" + subOppbId +
        ", subOppbName=" + subOppbName +
        ", subOppbType=" + subOppbType +
        ", subOppbProduct=" + subOppbProduct +
        ", subOppbDept=" + subOppbDept +
        ", subOppbCurrency=" + subOppbCurrency +
        ", subOppbMoney=" + subOppbMoney +
        ", subOppbStatus=" + subOppbStatus +
        ", subOppbOppId=" + subOppbOppId +
        "}";
    }
}
