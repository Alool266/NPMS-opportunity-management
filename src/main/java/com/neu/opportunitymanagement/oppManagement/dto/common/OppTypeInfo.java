package com.neu.opportunitymanagement.oppManagement.dto.common;

import java.io.Serializable;

public class OppTypeInfo implements Serializable {
    private String psoId;
    private String psoName;

    public String getPsoId() {
        return psoId;
    }

    public void setPsoId(String psoId) {
        this.psoId = psoId;
    }

    public String getPsoName() {
        return psoName;
    }

    public void setPsoName(String psoName) {
        this.psoName = psoName;
    }

    @Override
    public String toString() {
        return "OppTypeInfo{" +
                "psoId='" + psoId + '\'' +
                ", psoName='" + psoName + '\'' +
                '}';
    }
}
