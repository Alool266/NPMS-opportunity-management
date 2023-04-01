package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import java.io.Serializable;

public class OppIdAndOppBId implements Serializable {
    private String oppId;
    private String oppBId;
    private String oppStatus;

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    public String getOppBId() {
        return oppBId;
    }

    public void setOppBId(String oppBId) {
        this.oppBId = oppBId;
    }

    public String getOppStatus() {
        return oppStatus;
    }

    public void setOppStatus(String oppStatus) {
        this.oppStatus = oppStatus;
    }

    @Override
    public String toString() {
        return "OppIdAndOppBId{" +
                "oppId='" + oppId + '\'' +
                ", oppBId='" + oppBId + '\'' +
                ", oppStatus='" + oppStatus + '\'' +
                '}';
    }
}
