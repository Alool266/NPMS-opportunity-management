package com.neu.opportunitymanagement.oppManagement.controller;


import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.entity.Customer;
import com.neu.opportunitymanagement.oppManagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/oppManagement/customer")
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;

    // Query customer information by customer name
    @GetMapping("getCusNameByCusId")
    public RespBean getCusNameByCusId(@RequestParam String cusName){
        return iCustomerService.getCusNameByCusId(cusName);
    }

}

