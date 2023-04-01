package com.neu.opportunitymanagement.oppManagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

public class Trackinglog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    private String tOppId;

    private String tType;

    private String tDate;

    private String tOurParty;

    private String tCusParty;

    private String tThirdParty;

    private String tContactWay;

    private String tPlace;

    private String tContactCondition;

    private String tContactEffect;


    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettOppId() {
        return tOppId;
    }

    public void settOppId(String tOppId) {
        this.tOppId = tOppId;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public String gettDate() {
        return tDate;
    }

    public void settDate(String tDate) {
        this.tDate = tDate;
    }

    public String gettOurParty() {
        return tOurParty;
    }

    public void settOurParty(String tOurParty) {
        this.tOurParty = tOurParty;
    }

    public String gettCusParty() {
        return tCusParty;
    }

    public void settCusParty(String tCusParty) {
        this.tCusParty = tCusParty;
    }

    public String gettThirdParty() {
        return tThirdParty;
    }

    public void settThirdParty(String tThirdParty) {
        this.tThirdParty = tThirdParty;
    }

    public String gettContactWay() {
        return tContactWay;
    }

    public void settContactWay(String tContactWay) {
        this.tContactWay = tContactWay;
    }

    public String gettPlace() {
        return tPlace;
    }

    public void settPlace(String tPlace) {
        this.tPlace = tPlace;
    }

    public String gettContactCondition() {
        return tContactCondition;
    }

    public void settContactCondition(String tContactCondition) {
        this.tContactCondition = tContactCondition;
    }

    public String gettContactEffect() {
        return tContactEffect;
    }

    public void settContactEffect(String tContactEffect) {
        this.tContactEffect = tContactEffect;
    }

    @Override
    public String toString() {
        return "Trackinglog{" +
                "tId=" + tId +
                ", tOppId='" + tOppId + '\'' +
                ", tType='" + tType + '\'' +
                ", tDate='" + tDate + '\'' +
                ", tOurParty='" + tOurParty + '\'' +
                ", tCusParty='" + tCusParty + '\'' +
                ", tThirdParty='" + tThirdParty + '\'' +
                ", tContactWay='" + tContactWay + '\'' +
                ", tPlace='" + tPlace + '\'' +
                ", tContactCondition='" + tContactCondition + '\'' +
                ", tContactEffect='" + tContactEffect + '\'' +
                '}';
    }
}
