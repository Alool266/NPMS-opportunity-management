package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

public class Approvallog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "app_id", type = IdType.AUTO)
    private Integer appId;

    private String appFlowName;

    private Integer appOppId;

    private String appSubmitPeople;

    private String appSubmitDate;

    private String appPeople;

    private String appStatus;

    private String appOpinion;

    private String appResult;


    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppFlowName() {
        return appFlowName;
    }

    public void setAppFlowName(String appFlowName) {
        this.appFlowName = appFlowName;
    }

    public Integer getAppOppId() {
        return appOppId;
    }

    public void setAppOppId(Integer appOppId) {
        this.appOppId = appOppId;
    }

    public String getAppSubmitPeople() {
        return appSubmitPeople;
    }

    public void setAppSubmitPeople(String appSubmitPeople) {
        this.appSubmitPeople = appSubmitPeople;
    }

    public String getAppSubmitDate() {
        return appSubmitDate;
    }

    public void setAppSubmitDate(String appSubmitDate) {
        this.appSubmitDate = appSubmitDate;
    }

    public String getAppPeople() {
        return appPeople;
    }

    public void setAppPeople(String appPeople) {
        this.appPeople = appPeople;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getAppOpinion() {
        return appOpinion;
    }

    public void setAppOpinion(String appOpinion) {
        this.appOpinion = appOpinion;
    }

    public String getAppResult() {
        return appResult;
    }

    public void setAppResult(String appResult) {
        this.appResult = appResult;
    }

    @Override
    public String toString() {
        return "Approvallog{" +
                "appId=" + appId +
                ", appFlowName='" + appFlowName + '\'' +
                ", appOppId=" + appOppId +
                ", appSubmitPeople='" + appSubmitPeople + '\'' +
                ", appSubmitDate='" + appSubmitDate + '\'' +
                ", appPeople='" + appPeople + '\'' +
                ", appStatus='" + appStatus + '\'' +
                ", appOpinion='" + appOpinion + '\'' +
                ", appResult='" + appResult + '\'' +
                '}';
    }
}
