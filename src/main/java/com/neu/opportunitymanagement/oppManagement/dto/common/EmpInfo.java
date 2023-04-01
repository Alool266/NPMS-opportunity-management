package com.neu.opportunitymanagement.oppManagement.dto.common;

import java.io.Serializable;

public class EmpInfo implements Serializable {
    private String empId;
    private String empName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
