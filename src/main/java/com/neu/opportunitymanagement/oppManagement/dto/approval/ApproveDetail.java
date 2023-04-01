package com.neu.opportunitymanagement.oppManagement.dto.approval;

import com.neu.opportunitymanagement.oppManagement.entity.*;

import java.io.Serializable;
import java.util.List;

public class ApproveDetail implements Serializable {
    private OpportunityBuffer opportunityBuffer;
    private List<SubOpportunityBuffer> subOpportunityBufferList;
    private List<CompetitorBuffer> competitorBufferList;
    private List<PayerBuffer> payerBufferList;
    private List<Trackinglog> trackinglogList;
    private List<Approvallog> approvallogList;
    private Customer customer;

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

    public List<Trackinglog> getTrackinglogList() {
        return trackinglogList;
    }

    public void setTrackinglogList(List<Trackinglog> trackinglogList) {
        this.trackinglogList = trackinglogList;
    }

    public List<Approvallog> getApprovallogList() {
        return approvallogList;
    }

    public void setApprovallogList(List<Approvallog> approvallogList) {
        this.approvallogList = approvallogList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ApproveDetail{" +
                "opportunityBuffer=" + opportunityBuffer +
                ", subOpportunityBufferList=" + subOpportunityBufferList +
                ", competitorBufferList=" + competitorBufferList +
                ", payerBufferList=" + payerBufferList +
                ", trackinglogList=" + trackinglogList +
                ", approvallogList=" + approvallogList +
                ", customer=" + customer +
                '}';
    }
}
