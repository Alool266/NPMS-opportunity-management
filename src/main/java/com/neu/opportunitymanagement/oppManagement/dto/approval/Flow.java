package com.neu.opportunitymanagement.oppManagement.dto.approval;

import java.io.Serializable;

public class Flow implements Serializable {
    private String flowName;
    private String oppIdB;
    private String oppId;
    private String oppName;
    private String oppSubmiter;
    private String submitDate;
    private String oppPhase;

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public String getOppIdB() {
        return oppIdB;
    }

    public void setOppIdB(String oppIdB) {
        this.oppIdB = oppIdB;
    }

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

    public String getOppSubmiter() {
        return oppSubmiter;
    }

    public void setOppSubmiter(String oppSubmiter) {
        this.oppSubmiter = oppSubmiter;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public String getOppPhase() {
        return oppPhase;
    }

    public void setOppPhase(String oppPhase) {
        this.oppPhase = oppPhase;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "flowName='" + flowName + '\'' +
                ", oppIdB='" + oppIdB + '\'' +
                ", oppId='" + oppId + '\'' +
                ", oppName='" + oppName + '\'' +
                ", oppSubmiter='" + oppSubmiter + '\'' +
                ", submitDate='" + submitDate + '\'' +
                ", oppPhase='" + oppPhase + '\'' +
                '}';
    }
}
