package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import com.neu.opportunitymanagement.oppManagement.entity.CompetitorBuffer;
import com.neu.opportunitymanagement.oppManagement.entity.OpportunityBuffer;
import com.neu.opportunitymanagement.oppManagement.entity.PayerBuffer;
import com.neu.opportunitymanagement.oppManagement.entity.SubOpportunityBuffer;

import java.util.List;

public class BufferOppInfo {
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

    @Override
    public String toString() {
        return "BufferOppInfo{" +
                "opportunityBuffer=" + opportunityBuffer +
                ", subOpportunityBufferList=" + subOpportunityBufferList +
                ", competitorBufferList=" + competitorBufferList +
                ", payerBufferList=" + payerBufferList +
                '}';
    }
}
