package com.neu.opportunitymanagement.oppManagement.dto.common;

import java.io.Serializable;

public class ProductInfo implements Serializable {
    private String cproId;
    private String cproName;

    public String getCproId() {
        return cproId;
    }

    public void setCproId(String cproId) {
        this.cproId = cproId;
    }

    public String getCproName() {
        return cproName;
    }

    public void setCproName(String cproName) {
        this.cproName = cproName;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "cproId='" + cproId + '\'' +
                ", cproName='" + cproName + '\'' +
                '}';
    }
}
