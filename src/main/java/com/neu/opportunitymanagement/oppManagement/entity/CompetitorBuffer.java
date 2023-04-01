package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

public class CompetitorBuffer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "compb_id", type = IdType.AUTO)
    private Integer compbId;

    private String compbName;

    private String compbPosition;

    private Integer compbOppId;


    public Integer getCompbId() {
        return compbId;
    }

    public void setCompbId(Integer compbId) {
        this.compbId = compbId;
    }

    public String getCompbName() {
        return compbName;
    }

    public void setCompbName(String compbName) {
        this.compbName = compbName;
    }

    public String getCompbPosition() {
        return compbPosition;
    }

    public void setCompbPosition(String compbPosition) {
        this.compbPosition = compbPosition;
    }

    public Integer getCompbOppId() {
        return compbOppId;
    }

    public void setCompbOppId(Integer compbOppId) {
        this.compbOppId = compbOppId;
    }

    @Override
    public String toString() {
        return "CompetitorBuffer{" +
        "compbId=" + compbId +
        ", compbName=" + compbName +
        ", compbPosition=" + compbPosition +
        ", compbOppId=" + compbOppId +
        "}";
    }
}
