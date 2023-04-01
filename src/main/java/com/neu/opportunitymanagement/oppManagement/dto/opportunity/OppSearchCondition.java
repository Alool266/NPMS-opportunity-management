package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import java.io.Serializable;

public class OppSearchCondition implements Serializable {
    private String oppId;
    private String oppName;
    private String oppSalesDept;
    private String oppCustomerManagerId;
    private String oppSignTime1;
    private String oppSignTime2;
    private String oppBelonging;
    private String oppStatus;
    private String oppPhase;
    private String oppType;
    private String oppProduct;

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    public String getOppName() {
        return oppName;
    }

    public void setOppName(String oppName) {
        this.oppName = oppName;
    }

    public String getOppSalesDept() {
        return oppSalesDept;
    }

    public void setOppSalesDept(String oppSalesDept) {
        this.oppSalesDept = oppSalesDept;
    }

    public String getOppCustomerManagerId() {
        return oppCustomerManagerId;
    }

    public void setOppCustomerManagerId(String oppCustomerManagerId) {
        this.oppCustomerManagerId = oppCustomerManagerId;
    }

    public String getOppSignTime1() {
        return oppSignTime1;
    }

    public void setOppSignTime1(String oppSignTime1) {
        this.oppSignTime1 = oppSignTime1;
    }

    public String getOppSignTime2() {
        return oppSignTime2;
    }

    public void setOppSignTime2(String oppSignTime2) {
        this.oppSignTime2 = oppSignTime2;
    }

    public String getOppBelonging() {
        return oppBelonging;
    }

    public void setOppBelonging(String oppBelonging) {
        this.oppBelonging = oppBelonging;
    }

    public String getOppStatus() {
        return oppStatus;
    }

    public void setOppStatus(String oppStatus) {
        this.oppStatus = oppStatus;
    }

    public String getOppPhase() {
        return oppPhase;
    }

    public void setOppPhase(String oppPhase) {
        this.oppPhase = oppPhase;
    }

    public String getOppType() {
        return oppType;
    }

    public void setOppType(String oppType) {
        this.oppType = oppType;
    }

    public String getOppProduct() {
        return oppProduct;
    }

    public void setOppProduct(String oppProduct) {
        this.oppProduct = oppProduct;
    }

    @Override
    public String toString() {
        return "OppSearchCondition{" +
                "oppId='" + oppId + '\'' +
                ", oppName='" + oppName + '\'' +
                ", oppSalesDept='" + oppSalesDept + '\'' +
                ", oppCustomerManagerId='" + oppCustomerManagerId + '\'' +
                ", oppSignTime1='" + oppSignTime1 + '\'' +
                ", oppSignTime2='" + oppSignTime2 + '\'' +
                ", oppBelonging='" + oppBelonging + '\'' +
                ", oppStatus='" + oppStatus + '\'' +
                ", oppPhase='" + oppPhase + '\'' +
                ", oppType='" + oppType + '\'' +
                ", oppProduct='" + oppProduct + '\'' +
                '}';
    }
}
