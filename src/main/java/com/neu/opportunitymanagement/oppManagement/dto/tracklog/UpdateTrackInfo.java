package com.neu.opportunitymanagement.oppManagement.dto.tracklog;

import com.neu.opportunitymanagement.oppManagement.entity.Trackinglog;

import java.io.Serializable;
import java.util.List;

public class UpdateTrackInfo implements Serializable {
    private String oppId;
    private List<Trackinglog> updateTrackList;
    private List<String> deletedTrackId;

    public List<Trackinglog> getUpdateTrackList() {
        return updateTrackList;
    }

    public void setUpdateTrackList(List<Trackinglog> updateTrackList) {
        this.updateTrackList = updateTrackList;
    }

    public List<String> getDeletedTrackId() {
        return deletedTrackId;
    }

    public void setDeletedTrackId(List<String> deletedTrackId) {
        this.deletedTrackId = deletedTrackId;
    }

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    @Override
    public String toString() {
        return "UpdateTrackInfo{" +
                "oppId='" + oppId + '\'' +
                ", updateTrackList=" + updateTrackList +
                ", deletedTrackId=" + deletedTrackId +
                '}';
    }
}
