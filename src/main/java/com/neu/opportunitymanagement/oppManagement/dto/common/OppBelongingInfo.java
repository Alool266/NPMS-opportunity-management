package com.neu.opportunitymanagement.oppManagement.dto.common;

import java.io.Serializable;

public class OppBelongingInfo implements Serializable {
    private String cbuId;
    private String cbuName;

    public String getCbuId() {
        return cbuId;
    }

    public void setCbuId(String cbuId) {
        this.cbuId = cbuId;
    }

    public String getCbuName() {
        return cbuName;
    }

    public void setCbuName(String cbuName) {
        this.cbuName = cbuName;
    }

    @Override
    public String toString() {
        return "OppBelongingInfo{" +
                "cbuId='" + cbuId + '\'' +
                ", cbuName='" + cbuName + '\'' +
                '}';
    }
}
