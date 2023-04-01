package com.neu.opportunitymanagement.oppManagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.AddOpportunityInfo;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.UpdateOpportunityInfo;
import com.neu.opportunitymanagement.oppManagement.entity.*;
import com.neu.opportunitymanagement.oppManagement.mapper.*;
import com.neu.opportunitymanagement.oppManagement.service.IOpportunityBufferService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Service
public class OpportunityBufferServiceImpl extends ServiceImpl<OpportunityBufferMapper, OpportunityBuffer> implements IOpportunityBufferService {

    @Autowired
    OpportunityBufferMapper opportunityBufferMapper;
    @Autowired
    SubOpportunityBufferMapper subOpportunityBufferMapper;
    @Autowired
    CompetitorBufferMapper competitorBufferMapper;
    @Autowired
    PayerBufferMapper payerBufferMapper;
    @Autowired
    OpportunityMapper opportunityMapper;
    @Autowired
    IOpportunityBufferService iOpportunityBufferService;
    @Autowired
    SubOpportunityMapper subOpportunityMapper;
    @Autowired
    CompetitorMapper competitorMapper;
    @Autowired
    PayerMapper payerMapper;


    @Override
    public RespBean testAddRepetition(String oppbName, String cusId) {
        RespBean respBean = null;
        QueryWrapper<OpportunityBuffer> qw2 = Wrappers.query();
        qw2.eq("oppb_name", oppbName).eq("oppb_cus_id", cusId);
        List<OpportunityBuffer> list1 = opportunityBufferMapper.selectList(qw2);
        QueryWrapper<Opportunity> qw3 = Wrappers.query();
        qw3.eq("opp_name", oppbName).eq("opp_cus_id", cusId);
        List<Opportunity> list2 = opportunityMapper.selectList(qw3);

        if (!list1.isEmpty() || !list2.isEmpty()){
            System.out.println("Duplicate Opportunity Name！");
            respBean = RespBean.error(500, "Duplicate Opportunity Name！");
        }else {
            respBean = RespBean.ok(200, "ok");
        }
        return respBean;
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public RespBean addOpportunity(AddOpportunityInfo addOpportunityInfo) {
        OpportunityBuffer opportunityBuffer = addOpportunityInfo.getOpportunityBuffer();
        List<SubOpportunityBuffer> subOpportunityBufferList = addOpportunityInfo.getSubOpportunityBufferList();
        List<CompetitorBuffer> competitorBufferList = addOpportunityInfo.getCompetitorBufferList();
        List<PayerBuffer> payerBufferList = addOpportunityInfo.getPayerBufferList();
        RespBean respBean = null;
        String msg = "";

        if (opportunityBuffer.getOppbOppId() == null){
            System.out.println("新增的机会");
//            QueryWrapper<OpportunityBuffer> qw2 = Wrappers.query();
//            qw2.eq("oppb_name", opportunityBuffer.getOppbName()).eq("oppb_cus_id", opportunityBuffer.getOppbCusId());
//            List<OpportunityBuffer> list1 = opportunityBufferMapper.selectList(qw2);
//            QueryWrapper<Opportunity> qw3 = Wrappers.query();
//            qw3.eq("opp_name", opportunityBuffer.getOppbName()).eq("opp_cus_id", opportunityBuffer.getOppbCusId());
//            List<Opportunity> list2 = opportunityMapper.selectList(qw3);
//
//            if (!list1.isEmpty() || !list2.isEmpty()){
//                System.out.println("Duplicate Opportunity Name！");
//                respBean = RespBean.error(500, "Duplicate Opportunity Name！");
//                return respBean;
//            }
            if (addOpportunityInfo.getType().equals("0")){
                opportunityBuffer.setOppbStatus("10");
            }else {
                opportunityBuffer.setOppbStatus("20");
            }
            opportunityBuffer.setOppbApproveStatus("0");
        }else {
            opportunityBuffer.setOppbStatus("20");
            opportunityBuffer.setOppbApproveStatus("1");
        }


        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        String today = dateFormat.format(date);
        opportunityBuffer.setOppbSubmitDate(today);

        opportunityBufferMapper.insert(opportunityBuffer);

        QueryWrapper<OpportunityBuffer> qw1 = Wrappers.query();
        qw1.eq("oppb_name", opportunityBuffer.getOppbName()).eq("oppb_cus_id", opportunityBuffer.getOppbCusId());
        OpportunityBuffer opportunityBuffer1 = opportunityBufferMapper.selectOne(qw1);
        int oppb_id = opportunityBuffer1.getOppbId();

        for (SubOpportunityBuffer sob : subOpportunityBufferList) {
            sob.setSubOppbOppId(oppb_id);
        }
        for (CompetitorBuffer cb : competitorBufferList) {
            cb.setCompbOppId(oppb_id);
        }
        for (PayerBuffer pb : payerBufferList) {
            pb.setPbOppId(oppb_id);
        }

        try {
            for (SubOpportunityBuffer sob : subOpportunityBufferList) {
                subOpportunityBufferMapper.insert(sob);
            }
            for (CompetitorBuffer cb : competitorBufferList) {
                competitorBufferMapper.insert(cb);
            }
            for (PayerBuffer pb : payerBufferList) {
                payerBufferMapper.insert(pb);
            }
        }catch (Exception e){
            System.out.println("insert fail!");
            throw e;
        }
        System.out.println("insert success!");
        if (opportunityBuffer.getOppbOppId() == null){
            if (addOpportunityInfo.getType().equals("0")){
                msg = "Opportunity added Save draft successfully！";
            }else {
                msg = "Opportunity addition has been submitted, please wait for approval!";
            }
        }else {
            msg = "Opportunity modification has been submitted, please wait for approval！";
        }

        respBean = RespBean.ok(200, msg);

        return respBean;
    }


    @Override
    public RespBean testUpdateRepetition(String oppbName, String cusId, String oppbId) {
        RespBean respBean = null;
        QueryWrapper<OpportunityBuffer> qw2 = Wrappers.query();
        qw2.eq("oppb_name", oppbName).eq("oppb_cus_id", cusId);
        List<OpportunityBuffer> list1 = opportunityBufferMapper.selectList(qw2);
        QueryWrapper<Opportunity> qw3 = Wrappers.query();
        qw3.eq("opp_name", oppbName).eq("opp_cus_id", cusId);
        List<Opportunity> list2 = opportunityMapper.selectList(qw3);
        OpportunityBuffer op = opportunityBufferMapper.selectById(oppbId);

        boolean f0 = oppbName.equals(op.getOppbName());
        if (!f0){
            if (!list1.isEmpty() || !list2.isEmpty()){

                System.out.println("Opportunity name duplicated!");
                respBean = RespBean.error(500, "Opportunity name duplicated！");
                return respBean;
            }
        }
        respBean = RespBean.error(200, "ok");
        return respBean;
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public RespBean updateOpportunity(UpdateOpportunityInfo updateOpportunityInfo) {
        String type = updateOpportunityInfo.getType();
        Opportunity opportunity = updateOpportunityInfo.getOpportunity();
        List<SubOpportunity> updateSubOpportunityList = updateOpportunityInfo.getUpdateSubOpportunityList();
        List<Competitor> updateCompetitorList = updateOpportunityInfo.getUpdateCompetitorList();
        List<Payer> updatePayerList = updateOpportunityInfo.getUpdatePayerList();
        OpportunityBuffer opportunityBuffer = updateOpportunityInfo.getOpportunityBuffer();
        List<SubOpportunityBuffer> subOpportunityBufferList = updateOpportunityInfo.getSubOpportunityBufferList();
        List<CompetitorBuffer> competitorBufferList = updateOpportunityInfo.getCompetitorBufferList();
        List<PayerBuffer> payerBufferList = updateOpportunityInfo.getPayerBufferList();

        RespBean respBean = null;
        String msg = "";
        opportunityBuffer.setOppbOppId(opportunity.getOppId());

        if (opportunity.getOppId() == null){


            OpportunityBuffer ob = opportunityBufferMapper.selectById(opportunityBuffer.getOppbId());
            String oppStatus = ob.getOppbStatus();
            if (oppStatus.equals("20")){
                return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified!");
            }

            if (oppStatus.equals("10")){
//                QueryWrapper<OpportunityBuffer> qw2 = Wrappers.query();
//                qw2.eq("oppb_name", opportunityBuffer.getOppbName()).eq("oppb_cus_id", opportunityBuffer.getOppbCusId());
//                List<OpportunityBuffer> list1 = opportunityBufferMapper.selectList(qw2);
//                QueryWrapper<Opportunity> qw3 = Wrappers.query();
//                qw3.eq("opp_name", opportunityBuffer.getOppbName()).eq("opp_cus_id", opportunityBuffer.getOppbCusId());
//                List<Opportunity> list2 = opportunityMapper.selectList(qw3);
//                OpportunityBuffer op = opportunityBufferMapper.selectById(opportunityBuffer.getOppbId());
//
//                boolean f0 = opportunityBuffer.getOppbName().equals(op.getOppbName());
//                if (!f0){
//                    if (!list1.isEmpty() || !list2.isEmpty()){
//
//                        System.out.println("Opportunity name duplicated!");
//                        respBean = RespBean.error(500, "Opportunity name duplicated!");
//                        return respBean;
//                    }
//                }

                if (type.equals("1")) {
                    opportunityBuffer.setOppbStatus("20");
                    msg = "The status of this opportunity is in progress and cannot be modified！";
                }else {
                    msg = "Chance to save draft successfully！";
                }
            }
            else {
                opportunityBuffer.setOppbStatus("20");
                msg = "The status of this opportunity is in progress and cannot be modified！";
            }

            try {
                Date date = new Date();
                SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
                String today = dateFormat.format(date);
                opportunityBuffer.setOppbSubmitDate(today);
                opportunityBufferMapper.updateById(opportunityBuffer);

                for (SubOpportunityBuffer s : subOpportunityBufferList) {
                    if (s.getSubOppbId() == null){
                        s.setSubOppbOppId(opportunityBuffer.getOppbId());
                        subOpportunityBufferMapper.insert(s);
                    }
                    else {
                        subOpportunityBufferMapper.updateById(s);
                    }
                }

                for (CompetitorBuffer c : competitorBufferList) {
                    if (c.getCompbId() == null){
                        c.setCompbOppId(opportunityBuffer.getOppbId());
                        competitorBufferMapper.insert(c);
                    }
                }

                for (PayerBuffer p : payerBufferList) {
                    if (p.getPbId() == null){
                        p.setPbOppId(opportunityBuffer.getOppbId());
                        payerBufferMapper.insert(p);
                    }
                }
            }catch (Exception e){
                System.out.println("update fail!");
                throw e;
            }

            respBean = RespBean.ok(200, msg);

        }


        else {

            String[] oppPhases = {"E","D","C","B","A","S"};
            List<String> oppPhaseList = Arrays.asList(oppPhases);
            Opportunity testOpp = opportunityMapper.selectById(opportunity.getOppId());
            if (testOpp.getOppStatus().equals("20")){
                return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified！");
            }
            if (testOpp.getOppStatus().equals("40")){
                return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified！");
            }
            if (testOpp.getOppStatus().equals("50")){
                return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified！");
            }

            if (!testOpp.getOppBelonging().equals(opportunity.getOppBelonging()) || oppPhaseList.indexOf(testOpp.getOppPhase()) > oppPhaseList.indexOf(opportunity.getOppPhase())){
                System.out.println("需要审批");
                Opportunity opp = new Opportunity();
                opp.setOppId(opportunity.getOppId());
                opp.setOppStatus("20");
                opportunityMapper.updateById(opp);
                AddOpportunityInfo addOpportunityInfo = new AddOpportunityInfo();
                opportunityBuffer.setOppbOppId(opportunity.getOppId());
                addOpportunityInfo.setOpportunityBuffer(opportunityBuffer);
                addOpportunityInfo.setSubOpportunityBufferList(subOpportunityBufferList);
                addOpportunityInfo.setCompetitorBufferList(competitorBufferList);
                addOpportunityInfo.setPayerBufferList(payerBufferList);
                respBean = iOpportunityBufferService.addOpportunity(addOpportunityInfo);
            }
            else {
                System.out.println("No approval required");
                List<SubOpportunity> addSubOpportunityList = new ArrayList<>();
                List<SubOpportunity> updatedSubOpportunityList = new ArrayList<>();
                List<Competitor> addCompetitorList = new ArrayList<>();
                List<Payer> addPayerList = new ArrayList<>();

                for (SubOpportunity s : updateSubOpportunityList) {
                    if (s.getSubOppId() == null){
                        addSubOpportunityList.add(s);
                    }else {
                        updatedSubOpportunityList.add(s);
                    }
                }
                for (Competitor c : updateCompetitorList) {
                    if (c.getCompId() == null){
                        addCompetitorList.add(c);
                    }
                }
                for (Payer p : updatePayerList) {
                    if (p.getpId() == null){
                        addPayerList.add(p);
                    }
                }

                try{
                    opportunityMapper.updateById(opportunity);
                    for (SubOpportunity s : addSubOpportunityList) {
                        subOpportunityMapper.insert(s);
                    }
                    for (SubOpportunity s : updatedSubOpportunityList) {
                        subOpportunityMapper.updateById(s);
                    }
                    for (Competitor c : addCompetitorList) {
                        competitorMapper.insert(c);
                    }
                    for (Payer p : addPayerList) {
                        payerMapper.insert(p);
                    }
                }catch (Exception e){
                    System.out.println("update fail!");
                    throw e;
                }

                respBean = RespBean.ok(200,"Chance to modify successfully!");
            }

        }

        return respBean;
    }





}
