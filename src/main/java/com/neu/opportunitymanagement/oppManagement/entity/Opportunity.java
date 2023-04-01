package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

public class Opportunity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String oppId;

    private String oppName;

    private String oppSalesDept;

    private String oppCustomerManagerId;

    private LocalDateTime oppSignTime;

    private String oppBelonging;

    private String oppStatus;

    private String oppPhase;

    private String oppType;

    private String oppProduct;

    private String oppBackground;

    private String oppCigarettes;

    private String oppCusId;

    private String oppOrigin;


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

    @Override
    public String toString() {
        return "Opportunity{" +
        "oppId=" + oppId +
        ", oppName=" + oppName +
        ", oppSalesDept=" + oppSalesDept +
        ", oppCustomerManagerId=" + oppCustomerManagerId +
        ", oppSignTime=" + oppSignTime +
        ", oppBelonging=" + oppBelonging +
        ", oppStatus=" + oppStatus +
        ", oppPhase=" + oppPhase +
        ", oppType=" + oppType +
        ", oppProduct=" + oppProduct +
        ", oppBackground=" + oppBackground +
        ", oppCigarettes=" + oppCigarettes +
        ", oppCusId=" + oppCusId +
        ", oppOrigin=" + oppOrigin +
        "}";
    }
}
