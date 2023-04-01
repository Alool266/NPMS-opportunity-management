package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import com.neu.opportunitymanagement.oppManagement.dto.common.*;

import java.io.Serializable;
import java.util.List;

public class OppManagePageInfo implements Serializable {

    private List<DeptInfo> deptInfoList;
    private List<EmpInfo> empInfoList;
    private List<OppBelongingInfo> oppBelongingList;
    private List<OppSearchResult> oppSearchResultList;

    public List<DeptInfo> getDeptInfoList() {
        return deptInfoList;
    }

    public void setDeptInfoList(List<DeptInfo> deptInfoList) {
        this.deptInfoList = deptInfoList;
    }

    public List<EmpInfo> getEmpInfoList() {
        return empInfoList;
    }

    public void setEmpInfoList(List<EmpInfo> empInfoList) {
        this.empInfoList = empInfoList;
    }

    public List<OppBelongingInfo> getOppBelongingList() {
        return oppBelongingList;
    }

    public void setOppBelongingList(List<OppBelongingInfo> oppBelongingList) {
        this.oppBelongingList = oppBelongingList;
    }

    public List<OppSearchResult> getOppSearchResultList() {
        return oppSearchResultList;
    }

    public void setOppSearchResultList(List<OppSearchResult> oppSearchResultList) {
        this.oppSearchResultList = oppSearchResultList;
    }

    @Override
    public String toString() {
        return "OppManagePageInfo{" +
                "deptInfoList=" + deptInfoList +
                ", empInfoList=" + empInfoList +
                ", oppBelongingList=" + oppBelongingList +
                ", oppSearchResultList=" + oppSearchResultList +
                '}';
    }
}
