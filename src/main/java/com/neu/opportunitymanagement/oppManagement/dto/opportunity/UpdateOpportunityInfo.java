package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import com.neu.opportunitymanagement.oppManagement.entity.*;

import java.io.Serializable;
import java.util.List;

public class UpdateOpportunityInfo implements Serializable {
    private String type;
    private Opportunity opportunity;
    private List<SubOpportunity> updateSubOpportunityList;
    private List<Competitor> updateCompetitorList;
    private List<Payer> updatePayerList;
    private OpportunityBuffer opportunityBuffer;
    private List<SubOpportunityBuffer> subOpportunityBufferList;
    private List<CompetitorBuffer> competitorBufferList;
    private List<PayerBuffer> payerBufferList;

    public Opportunity getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    public List<SubOpportunity> getUpdateSubOpportunityList() {
        return updateSubOpportunityList;
    }

    public void setUpdateSubOpportunityList(List<SubOpportunity> updateSubOpportunityList) {
        this.updateSubOpportunityList = updateSubOpportunityList;
    }

    public List<Competitor> getUpdateCompetitorList() {
        return updateCompetitorList;
    }

    public void setUpdateCompetitorList(List<Competitor> updateCompetitorList) {
        this.updateCompetitorList = updateCompetitorList;
    }

    public List<Payer> getUpdatePayerList() {
        return updatePayerList;
    }

    public void setUpdatePayerList(List<Payer> updatePayerList) {
        this.updatePayerList = updatePayerList;
    }

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
        return "UpdateOpportunityInfo{" +
                "type='" + type + '\'' +
                ", opportunity=" + opportunity +
                ", updateSubOpportunityList=" + updateSubOpportunityList +
                ", updateCompetitorList=" + updateCompetitorList +
                ", updatePayerList=" + updatePayerList +
                ", opportunityBuffer=" + opportunityBuffer +
                ", subOpportunityBufferList=" + subOpportunityBufferList +
                ", competitorBufferList=" + competitorBufferList +
                ", payerBufferList=" + payerBufferList +
                '}';
    }
}
