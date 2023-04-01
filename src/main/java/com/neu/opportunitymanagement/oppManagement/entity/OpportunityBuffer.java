package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

public class OpportunityBuffer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "oppb_id", type = IdType.AUTO)
    private Integer oppbId;

    private String oppbName;

    private String oppbSalesDept;

    private String oppbCustomerManagerId;

    private LocalDateTime oppbSignTime;

    private String oppbBelonging;

    private String oppbStatus;

    private String oppbPhase;

    private String oppbType;

    private String oppbProduct;

    private String oppbBackground;

    private String oppbCigarettes;

    private String oppbCusId;

    private String oppbApproveStatus;

    private String oppbOppId;

    private String oppbOrigin;

    private String oppbSubmitDate;


    public Integer getOppbId() {
        return oppbId;
    }

    public void setOppbId(Integer oppbId) {
        this.oppbId = oppbId;
    }

    public String getOppbName() {
        return oppbName;
    }

    public void setOppbName(String oppbName) {
        this.oppbName = oppbName;
    }

    public String getOppbSalesDept() {
        return oppbSalesDept;
    }

    public void setOppbSalesDept(String oppbSalesDept) {
        this.oppbSalesDept = oppbSalesDept;
    }

    public String getOppbCustomerManagerId() {
        return oppbCustomerManagerId;
    }

    public void setOppbCustomerManagerId(String oppbCustomerManagerId) {
        this.oppbCustomerManagerId = oppbCustomerManagerId;
    }

    public LocalDateTime getOppbSignTime() {
        return oppbSignTime;
    }

    public void setOppbSignTime(LocalDateTime oppbSignTime) {
        this.oppbSignTime = oppbSignTime;
    }

    public String getOppbBelonging() {
        return oppbBelonging;
    }

    public void setOppbBelonging(String oppbBelonging) {
        this.oppbBelonging = oppbBelonging;
    }

    public String getOppbStatus() {
        return oppbStatus;
    }

    public void setOppbStatus(String oppbStatus) {
        this.oppbStatus = oppbStatus;
    }

    public String getOppbPhase() {
        return oppbPhase;
    }

    public void setOppbPhase(String oppbPhase) {
        this.oppbPhase = oppbPhase;
    }

    public String getOppbType() {
        return oppbType;
    }

    public void setOppbType(String oppbType) {
        this.oppbType = oppbType;
    }

    public String getOppbProduct() {
        return oppbProduct;
    }

    public void setOppbProduct(String oppbProduct) {
        this.oppbProduct = oppbProduct;
    }

    public String getOppbBackground() {
        return oppbBackground;
    }

    public void setOppbBackground(String oppbBackground) {
        this.oppbBackground = oppbBackground;
    }

    public String getOppbCigarettes() {
        return oppbCigarettes;
    }

    public void setOppbCigarettes(String oppbCigarettes) {
        this.oppbCigarettes = oppbCigarettes;
    }

    public String getOppbCusId() {
        return oppbCusId;
    }

    public void setOppbCusId(String oppbCusId) {
        this.oppbCusId = oppbCusId;
    }

    public String getOppbApproveStatus() {
        return oppbApproveStatus;
    }

    public void setOppbApproveStatus(String oppbApproveStatus) {
        this.oppbApproveStatus = oppbApproveStatus;
    }

    public String getOppbOppId() {
        return oppbOppId;
    }

    public void setOppbOppId(String oppbOppId) {
        this.oppbOppId = oppbOppId;
    }

    public String getOppbOrigin() {
        return oppbOrigin;
    }

    public void setOppbOrigin(String oppbOrigin) {
        this.oppbOrigin = oppbOrigin;
    }

    public String getOppbSubmitDate() {
        return oppbSubmitDate;
    }

    public void setOppbSubmitDate(String oppbSubmitDate) {
        this.oppbSubmitDate = oppbSubmitDate;
    }

    @Override
    public String toString() {
        return "OpportunityBuffer{" +
                "oppbId=" + oppbId +
                ", oppbName='" + oppbName + '\'' +
                ", oppbSalesDept='" + oppbSalesDept + '\'' +
                ", oppbCustomerManagerId='" + oppbCustomerManagerId + '\'' +
                ", oppbSignTime=" + oppbSignTime +
                ", oppbBelonging='" + oppbBelonging + '\'' +
                ", oppbStatus='" + oppbStatus + '\'' +
                ", oppbPhase='" + oppbPhase + '\'' +
                ", oppbType='" + oppbType + '\'' +
                ", oppbProduct='" + oppbProduct + '\'' +
                ", oppbBackground='" + oppbBackground + '\'' +
                ", oppbCigarettes='" + oppbCigarettes + '\'' +
                ", oppbCusId='" + oppbCusId + '\'' +
                ", oppbApproveStatus='" + oppbApproveStatus + '\'' +
                ", oppbOppId='" + oppbOppId + '\'' +
                ", oppbOrigin='" + oppbOrigin + '\'' +
                ", oppbSubmitDate='" + oppbSubmitDate + '\'' +
                '}';
    }
}
