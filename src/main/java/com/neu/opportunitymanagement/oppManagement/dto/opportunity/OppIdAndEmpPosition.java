package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import java.io.Serializable;

public class OppIdAndEmpPosition implements Serializable {
    private String oppId;
    private String empPositionId;

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    public String getEmpPositionId() {
        return empPositionId;
    }

    public void setEmpPositionId(String empPositionId) {
        this.empPositionId = empPositionId;
    }

    @Override
    public String toString() {
        return "OppIdAndEmpPosition{" +
                "oppId='" + oppId + '\'' +
                ", empPositionId='" + empPositionId + '\'' +
                '}';
    }
}
