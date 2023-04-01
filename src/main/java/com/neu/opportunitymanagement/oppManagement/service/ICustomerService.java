package com.neu.opportunitymanagement.oppManagement.service;

import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ICustomerService extends IService<Customer> {

    public RespBean getCusNameByCusId(String cus_name);
}
