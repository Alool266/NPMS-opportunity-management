package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

public class Competitor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "comp_id", type = IdType.AUTO)
    private Integer compId;

    private String compName;

    private String compPosition;

    private String compOppId;


    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompPosition() {
        return compPosition;
    }

    public void setCompPosition(String compPosition) {
        this.compPosition = compPosition;
    }

    public String getCompOppId() {
        return compOppId;
    }

    public void setCompOppId(String compOppId) {
        this.compOppId = compOppId;
    }

    @Override
    public String toString() {
        return "Competitor{" +
        "compId=" + compId +
        ", compName=" + compName +
        ", compPosition=" + compPosition +
        ", compOppId=" + compOppId +
        "}";
    }
}
