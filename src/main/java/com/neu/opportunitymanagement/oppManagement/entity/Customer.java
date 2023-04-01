package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String cusId;

    private String cusName;

    private String cusCountry;

    private String cusCity;

    private String cusAddress;

    private String cusPostcode;

    private String cusWebsite;

    private String cusTaxpayerId;

    private String cusTaxCategory;

    private String cusAccountAllocationSection;

    private String cusEnterpriseProperty;

    private Double cusAnnualSalesRevenue;

    private String cusProductType;

    private String cusSoftwareBrand;

    private String cusEffectOfInformationization;

    private String cusSalesDeptId;

    private String cusCustomerManagerId;

    private String cusStatus;


    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusCountry() {
        return cusCountry;
    }

    public void setCusCountry(String cusCountry) {
        this.cusCountry = cusCountry;
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusPostcode() {
        return cusPostcode;
    }

    public void setCusPostcode(String cusPostcode) {
        this.cusPostcode = cusPostcode;
    }

    public String getCusWebsite() {
        return cusWebsite;
    }

    public void setCusWebsite(String cusWebsite) {
        this.cusWebsite = cusWebsite;
    }

    public String getCusTaxpayerId() {
        return cusTaxpayerId;
    }

    public void setCusTaxpayerId(String cusTaxpayerId) {
        this.cusTaxpayerId = cusTaxpayerId;
    }

    public String getCusTaxCategory() {
        return cusTaxCategory;
    }

    public void setCusTaxCategory(String cusTaxCategory) {
        this.cusTaxCategory = cusTaxCategory;
    }

    public String getCusAccountAllocationSection() {
        return cusAccountAllocationSection;
    }

    public void setCusAccountAllocationSection(String cusAccountAllocationSection) {
        this.cusAccountAllocationSection = cusAccountAllocationSection;
    }

    public String getCusEnterpriseProperty() {
        return cusEnterpriseProperty;
    }

    public void setCusEnterpriseProperty(String cusEnterpriseProperty) {
        this.cusEnterpriseProperty = cusEnterpriseProperty;
    }

    public Double getCusAnnualSalesRevenue() {
        return cusAnnualSalesRevenue;
    }

    public void setCusAnnualSalesRevenue(Double cusAnnualSalesRevenue) {
        this.cusAnnualSalesRevenue = cusAnnualSalesRevenue;
    }

    public String getCusProductType() {
        return cusProductType;
    }

    public void setCusProductType(String cusProductType) {
        this.cusProductType = cusProductType;
    }

    public String getCusSoftwareBrand() {
        return cusSoftwareBrand;
    }

    public void setCusSoftwareBrand(String cusSoftwareBrand) {
        this.cusSoftwareBrand = cusSoftwareBrand;
    }

    public String getCusEffectOfInformationization() {
        return cusEffectOfInformationization;
    }

    public void setCusEffectOfInformationization(String cusEffectOfInformationization) {
        this.cusEffectOfInformationization = cusEffectOfInformationization;
    }

    public String getCusSalesDeptId() {
        return cusSalesDeptId;
    }

    public void setCusSalesDeptId(String cusSalesDeptId) {
        this.cusSalesDeptId = cusSalesDeptId;
    }

    public String getCusCustomerManagerId() {
        return cusCustomerManagerId;
    }

    public void setCusCustomerManagerId(String cusCustomerManagerId) {
        this.cusCustomerManagerId = cusCustomerManagerId;
    }

    public String getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(String cusStatus) {
        this.cusStatus = cusStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "cusId=" + cusId +
        ", cusName=" + cusName +
        ", cusCountry=" + cusCountry +
        ", cusCity=" + cusCity +
        ", cusAddress=" + cusAddress +
        ", cusPostcode=" + cusPostcode +
        ", cusWebsite=" + cusWebsite +
        ", cusTaxpayerId=" + cusTaxpayerId +
        ", cusTaxCategory=" + cusTaxCategory +
        ", cusAccountAllocationSection=" + cusAccountAllocationSection +
        ", cusEnterpriseProperty=" + cusEnterpriseProperty +
        ", cusAnnualSalesRevenue=" + cusAnnualSalesRevenue +
        ", cusProductType=" + cusProductType +
        ", cusSoftwareBrand=" + cusSoftwareBrand +
        ", cusEffectOfInformationization=" + cusEffectOfInformationization +
        ", cusSalesDeptId=" + cusSalesDeptId +
        ", cusCustomerManagerId=" + cusCustomerManagerId +
        ", cusStatus=" + cusStatus +
        "}";
    }
}
