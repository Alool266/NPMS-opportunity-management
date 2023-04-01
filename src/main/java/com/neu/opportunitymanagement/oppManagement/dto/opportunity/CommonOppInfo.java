package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import com.neu.opportunitymanagement.oppManagement.entity.Competitor;
import com.neu.opportunitymanagement.oppManagement.entity.Opportunity;
import com.neu.opportunitymanagement.oppManagement.entity.Payer;
import com.neu.opportunitymanagement.oppManagement.entity.SubOpportunity;

import java.util.List;

public class CommonOppInfo {
    private Opportunity opportunity;
    private List<SubOpportunity> subOpportunityList;
    private List<Competitor> competitorList;
    private List<Payer> payerList;

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

    @Override
    public String toString() {
        return "CommonOppInfo{" +
                "opportunity=" + opportunity +
                ", subOpportunityList=" + subOpportunityList +
                ", competitorList=" + competitorList +
                ", payerList=" + payerList +
                '}';
    }
}
