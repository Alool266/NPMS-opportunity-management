package com.neu.opportunitymanagement.oppManagement.dto.common;

import java.io.Serializable;

public class Role implements Serializable {

    private String posId;
    private String posName;

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "posId='" + posId + '\'' +
                ", posName='" + posName + '\'' +
                '}';
    }
}
