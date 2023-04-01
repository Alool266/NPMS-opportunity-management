package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import com.neu.opportunitymanagement.oppManagement.entity.*;

import java.io.Serializable;
import java.util.List;

public class AddOpportunityInfo implements Serializable {
    private String type;    // 0:保存  1:提交
    private OpportunityBuffer opportunityBuffer;
    private List<SubOpportunityBuffer> subOpportunityBufferList;
    private List<CompetitorBuffer> competitorBufferList;
    private List<PayerBuffer> payerBufferList;

    public OpportunityBuffer getOpportunityBuffer() {
        return opportunityBuffer;
    }

    public void setOpportunityBuffer(OpportunityBuffer opportunityBuffer) {
        this.opportunityBuffer = opportunityBuffer;
    }

    public List<SubOpportunityBuffer> getSubOpportunityBufferList() {
        return subOpportunityBufferList;
    }

    public void setSubOpportunityBufferList(List<SubOpportunityBuffer> subOpportunityBufferList) {
        this.subOpportunityBufferList = subOpportunityBufferList;
    }

    public List<CompetitorBuffer> getCompetitorBufferList() {
        return competitorBufferList;
    }

    public void setCompetitorBufferList(List<CompetitorBuffer> competitorBufferList) {
        this.competitorBufferList = competitorBufferList;
    }

    public List<PayerBuffer> getPayerBufferList() {
        return payerBufferList;
    }

    public void setPayerBufferList(List<PayerBuffer> payerBufferList) {
        this.payerBufferList = payerBufferList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AddOpportunityInfo{" +
                "type='" + type + '\'' +
                ", opportunityBuffer=" + opportunityBuffer +
                ", subOpportunityBufferList=" + subOpportunityBufferList +
                ", competitorBufferList=" + competitorBufferList +
                ", payerBufferList=" + payerBufferList +
                '}';
    }
}
