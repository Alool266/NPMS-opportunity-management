package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import com.neu.opportunitymanagement.oppManagement.entity.*;

import java.io.Serializable;
import java.util.List;

public class OppDetail implements Serializable {
    private Opportunity opportunity;
    private List<SubOpportunity> subOpportunityList;
    private List<Competitor> competitorList;
    private List<Payer> payerList;
    private List<Trackinglog> trackinglogList;

    public Opportunity getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    public List<SubOpportunity> getSubOpportunityList() {
        return subOpportunityList;
    }

    public void setSubOpportunityList(List<SubOpportunity> subOpportunityList) {
        this.subOpportunityList = subOpportunityList;
    }

    public List<Competitor> getCompetitorList() {
        return competitorList;
    }

    public void setCompetitorList(List<Competitor> competitorList) {
        this.competitorList = competitorList;
    }

    public List<Payer> getPayerList() {
        return payerList;
    }

    public void setPayerList(List<Payer> payerList) {
        this.payerList = payerList;
    }

    public List<Trackinglog> getTrackinglogList() {
        return trackinglogList;
    }

    public void setTrackinglogList(List<Trackinglog> trackinglogList) {
        this.trackinglogList = trackinglogList;
    }

    @Override
    public String toString() {
        return "OppDetail{" +
                "opportunity=" + opportunity +
                ", subOpportunityList=" + subOpportunityList +
                ", competitorList=" + competitorList +
                ", payerList=" + payerList +
                ", trackinglogList=" + trackinglogList +
                '}';
    }
}
