package com.neu.opportunitymanagement.oppManagement.service;

import com.neu.opportunitymanagement.oppManagement.dto.common.Role;
import com.neu.opportunitymanagement.oppManagement.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    public List<Role> getRoleById(String emp_id);
    public String getEmpNameById(String emp_id);
}
