package com.neu.opportunitymanagement;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.neu.opportunitymanagement.oppManagement.dto.approval.Flow;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppSearchCondition;
import com.neu.opportunitymanagement.oppManagement.entity.Opportunity;
import com.neu.opportunitymanagement.oppManagement.mapper.OpportunityBufferMapper;
import com.neu.opportunitymanagement.oppManagement.mapper.OpportunityMapper;
import com.neu.opportunitymanagement.oppManagement.service.IOpportunityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OpportunityManagementApplicationTests {

    @Autowired
    OpportunityMapper opportunityMapper;
    @Autowired
    OpportunityBufferMapper opportunityBufferMapper;
    @Autowired
    IOpportunityService iOpportunityService;


    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        OppSearchCondition condition = new OppSearchCondition();
        condition.setOppSignTime1("2021-05-10 10:00:00");
        condition.setOppSignTime2("2021-05-15 10:00:00");
        System.out.println(opportunityMapper.getOpportunity(condition));
    }


    @Test
    public void test2(){
        OppSearchCondition condition = new OppSearchCondition();
        System.out.println(opportunityMapper.getOpportunityB(condition));
    }

    @Test
    public void test3(){
        List<Flow> flowList = new ArrayList<>();
        flowList = opportunityBufferMapper.getApproveOppList("20000010");
        System.out.println(flowList);
    }

    @Test
    public void test4(){
        System.out.println(iOpportunityService.showOppApproveDetail("1"));
    }


    @Test
    public void test5(){
        QueryWrapper<Opportunity> qw = Wrappers.query();
        qw.eq("opp_sales_dept", "8021140");
        System.out.println(opportunityMapper.selectCount(qw));
    }





}
