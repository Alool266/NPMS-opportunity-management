package com.neu.opportunitymanagement.oppManagement.dto.approval;

import java.io.Serializable;

public class Approval implements Serializable {
    private String empName;
    private String empPositionId;
    private Integer oppIdB;
    private String approveResult;
    private String approveAdvice;

    public Integer getOppIdB() {
        return oppIdB;
    }

    public void setOppIdB(Integer oppIdB) {
        this.oppIdB = oppIdB;
    }

    public String getApproveResult() {
        return approveResult;
    }

    public void setApproveResult(String approveResult) {
        this.approveResult = approveResult;
    }

    public String getApproveAdvice() {
        return approveAdvice;
    }

    public void setApproveAdvice(String approveAdvice) {
        this.approveAdvice = approveAdvice;
    }

    public String getEmpPositionId() {
        return empPositionId;
    }

    public void setEmpPositionId(String empPositionId) {
        this.empPositionId = empPositionId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Approval{" +
                "empName='" + empName + '\'' +
                ", empPositionId='" + empPositionId + '\'' +
                ", oppIdB=" + oppIdB +
                ", approveResult='" + approveResult + '\'' +
                ", approveAdvice='" + approveAdvice + '\'' +
                '}';
    }
}
