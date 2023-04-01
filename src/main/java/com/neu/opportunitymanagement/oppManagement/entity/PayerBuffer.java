package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

public class PayerBuffer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pb_id", type = IdType.AUTO)
    private Integer pbId;

    private String pbName;

    private String pbDept;

    private String pbPosition;

    private String pbPhone;

    private String pbDecision;

    private String pbEffect;

    private String pbAgree;

    private Integer pbOppId;


    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public String getPbName() {
        return pbName;
    }

    public void setPbName(String pbName) {
        this.pbName = pbName;
    }

    public String getPbDept() {
        return pbDept;
    }

    public void setPbDept(String pbDept) {
        this.pbDept = pbDept;
    }

    public String getPbPosition() {
        return pbPosition;
    }

    public void setPbPosition(String pbPosition) {
        this.pbPosition = pbPosition;
    }

    public String getPbPhone() {
        return pbPhone;
    }

    public void setPbPhone(String pbPhone) {
        this.pbPhone = pbPhone;
    }

    public String getPbDecision() {
        return pbDecision;
    }

    public void setPbDecision(String pbDecision) {
        this.pbDecision = pbDecision;
    }

    public String getPbEffect() {
        return pbEffect;
    }

    public void setPbEffect(String pbEffect) {
        this.pbEffect = pbEffect;
    }

    public String getPbAgree() {
        return pbAgree;
    }

    public void setPbAgree(String pbAgree) {
        this.pbAgree = pbAgree;
    }

    public Integer getPbOppId() {
        return pbOppId;
    }

    public void setPbOppId(Integer pbOppId) {
        this.pbOppId = pbOppId;
    }

    @Override
    public String toString() {
        return "PayerBuffer{" +
        "pbId=" + pbId +
        ", pbName=" + pbName +
        ", pbDept=" + pbDept +
        ", pbPosition=" + pbPosition +
        ", pbPhone=" + pbPhone +
        ", pbDecision=" + pbDecision +
        ", pbEffect=" + pbEffect +
        ", pbAgree=" + pbAgree +
        ", pbOppId=" + pbOppId +
        "}";
    }
}
