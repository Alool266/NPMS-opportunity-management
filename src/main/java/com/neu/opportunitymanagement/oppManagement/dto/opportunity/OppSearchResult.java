package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OppSearchResult implements Serializable {
    private String oppId;
    private String oppBId;

    private String oppName;

    private String oppSalesDept;
    private String oppSalesDeptName;

    private String oppCustomerManagerId;
    private String oppCustomerManagerName;

    private LocalDateTime oppSignTime;

    private String oppBelonging;
    private String oppBelongingName;

    private String oppStatus;

    private String oppPhase;

    private String oppType;

    private String oppProduct;

    private String oppBackground;

    private String oppCigarettes;

    private String oppCusId;

    private String oppOrigin;

    private String oppbApproveStatus;

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

    public String getOppSalesDeptName() {
        return oppSalesDeptName;
    }

    public void setOppSalesDeptName(String oppSalesDeptName) {
        this.oppSalesDeptName = oppSalesDeptName;
    }

    public String getOppCustomerManagerId() {
        return oppCustomerManagerId;
    }

    public void setOppCustomerManagerId(String oppCustomerManagerId) {
        this.oppCustomerManagerId = oppCustomerManagerId;
    }

    public String getOppCustomerManagerName() {
        return oppCustomerManagerName;
    }

    public void setOppCustomerManagerName(String oppCustomerManagerName) {
        this.oppCustomerManagerName = oppCustomerManagerName;
    }

    public LocalDateTime getOppSignTime() {
        return oppSignTime;
    }

    public void setOppSignTime(LocalDateTime oppSignTime) {
        this.oppSignTime = oppSignTime;
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

    public String getOppBackground() {
        return oppBackground;
    }

    public void setOppBackground(String oppBackground) {
        this.oppBackground = oppBackground;
    }

    public String getOppCigarettes() {
        return oppCigarettes;
    }

    public void setOppCigarettes(String oppCigarettes) {
        this.oppCigarettes = oppCigarettes;
    }

    public String getOppCusId() {
        return oppCusId;
    }

    public void setOppCusId(String oppCusId) {
        this.oppCusId = oppCusId;
    }

    public String getOppOrigin() {
        return oppOrigin;
    }

    public void setOppOrigin(String oppOrigin) {
        this.oppOrigin = oppOrigin;
    }

    public String getOppBelongingName() {
        return oppBelongingName;
    }

    public void setOppBelongingName(String oppBelongingName) {
        this.oppBelongingName = oppBelongingName;
    }

    public String getOppBId() {
        return oppBId;
    }

    public void setOppBId(String oppBId) {
        this.oppBId = oppBId;
    }

    public String getOppbApproveStatus() {
        return oppbApproveStatus;
    }

    public void setOppbApproveStatus(String oppbApproveStatus) {
        this.oppbApproveStatus = oppbApproveStatus;
    }

    @Override
    public String toString() {
        return "OppSearchResult{" +
                "oppId='" + oppId + '\'' +
                ", oppBId='" + oppBId + '\'' +
                ", oppName='" + oppName + '\'' +
                ", oppSalesDept='" + oppSalesDept + '\'' +
                ", oppSalesDeptName='" + oppSalesDeptName + '\'' +
                ", oppCustomerManagerId='" + oppCustomerManagerId + '\'' +
                ", oppCustomerManagerName='" + oppCustomerManagerName + '\'' +
                ", oppSignTime=" + oppSignTime +
                ", oppBelonging='" + oppBelonging + '\'' +
                ", oppBelongingName='" + oppBelongingName + '\'' +
                ", oppStatus='" + oppStatus + '\'' +
                ", oppPhase='" + oppPhase + '\'' +
                ", oppType='" + oppType + '\'' +
                ", oppProduct='" + oppProduct + '\'' +
                ", oppBackground='" + oppBackground + '\'' +
                ", oppCigarettes='" + oppCigarettes + '\'' +
                ", oppCusId='" + oppCusId + '\'' +
                ", oppOrigin='" + oppOrigin + '\'' +
                ", oppbApproveStatus='" + oppbApproveStatus + '\'' +
                '}';
    }
}
