package com.neu.opportunitymanagement.oppManagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.entity.Customer;
import com.neu.opportunitymanagement.oppManagement.mapper.CustomerMapper;
import com.neu.opportunitymanagement.oppManagement.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public RespBean getCusNameByCusId(String cus_name) {
        QueryWrapper<Customer> qw = Wrappers.query();
        qw.eq("cus_name", cus_name);
        List<Customer> customerList = customerMapper.selectList(qw);
        RespBean respBean = RespBean.ok(200, "ok", customerList);
        return respBean;
    }
}
