package com.neu.opportunitymanagement.oppManagement.dto.tracklog;

import com.neu.opportunitymanagement.oppManagement.entity.Trackinglog;

import java.io.Serializable;
import java.util.List;

public class OppTrackMainPage implements Serializable {
    private String oppId;
    private String oppName;
    private List<Trackinglog> oppTrackList;

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    public String getOppName() {
        return oppName;
    }

    public void setOppName(String oppName) {
        this.oppName = oppName;
    }

    public List<Trackinglog> getOppTrackList() {
        return oppTrackList;
    }

    public void setOppTrackList(List<Trackinglog> oppTrackList) {
        this.oppTrackList = oppTrackList;
    }

    @Override
    public String toString() {
        return "OppTrackMainPage{" +
                "oppId='" + oppId + '\'' +
                ", oppName='" + oppName + '\'' +
                ", oppTrackList=" + oppTrackList +
                '}';
    }
}
