package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

public class Payer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "p_id", type = IdType.AUTO)
    private Integer pId;

    private String pName;

    private String pDept;

    private String pPosition;

    private String pPhone;

    private String pDecision;

    private String pEffect;

    private String pAgree;

    private String pOppId;


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDept() {
        return pDept;
    }

    public void setpDept(String pDept) {
        this.pDept = pDept;
    }

    public String getpPosition() {
        return pPosition;
    }

    public void setpPosition(String pPosition) {
        this.pPosition = pPosition;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    public String getpDecision() {
        return pDecision;
    }

    public void setpDecision(String pDecision) {
        this.pDecision = pDecision;
    }

    public String getpEffect() {
        return pEffect;
    }

    public void setpEffect(String pEffect) {
        this.pEffect = pEffect;
    }

    public String getpAgree() {
        return pAgree;
    }

    public void setpAgree(String pAgree) {
        this.pAgree = pAgree;
    }

    public String getpOppId() {
        return pOppId;
    }

    public void setpOppId(String pOppId) {
        this.pOppId = pOppId;
    }

    @Override
    public String toString() {
        return "Payer{" +
        "pId=" + pId +
        ", pName=" + pName +
        ", pDept=" + pDept +
        ", pPosition=" + pPosition +
        ", pPhone=" + pPhone +
        ", pDecision=" + pDecision +
        ", pEffect=" + pEffect +
        ", pAgree=" + pAgree +
        ", pOppId=" + pOppId +
        "}";
    }
}
