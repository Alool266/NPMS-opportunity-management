package com.neu.opportunitymanagement.oppManagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.neu.opportunitymanagement.oppManagement.dto.approval.Approval;
import com.neu.opportunitymanagement.oppManagement.dto.approval.ApproveDetail;
import com.neu.opportunitymanagement.oppManagement.dto.approval.Flow;
import com.neu.opportunitymanagement.oppManagement.dto.common.*;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.*;
import com.neu.opportunitymanagement.oppManagement.dto.tracklog.OppTrackMainPage;
import com.neu.opportunitymanagement.oppManagement.entity.*;
import com.neu.opportunitymanagement.oppManagement.mapper.*;
import com.neu.opportunitymanagement.oppManagement.service.IOpportunityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpportunityServiceImpl extends ServiceImpl<OpportunityMapper, Opportunity> implements IOpportunityService {

    @Autowired
    OpportunityMapper opportunityMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SubOpportunityMapper subOpportunityMapper;
    @Autowired
    CompetitorMapper competitorMapper;
    @Autowired
    PayerMapper payerMapper;
    @Autowired
    TrackinglogMapper trackinglogMapper;
    @Autowired
    OpportunityBufferMapper opportunityBufferMapper;
    @Autowired
    SubOpportunityBufferMapper subOpportunityBufferMapper;
    @Autowired
    CompetitorBufferMapper competitorBufferMapper;
    @Autowired
    PayerBufferMapper payerBufferMapper;
    @Autowired
    ApprovallogMapper approvallogMapper;
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public OppManagePageInfo getMainPage(String emp_id) {

        Employee employee = employeeMapper.selectById(emp_id);
        String emp_position = employee.getEmpPositionId();

        List<DeptInfo> deptInfoList = new ArrayList<>();
        List<EmpInfo> empInfoList = new ArrayList<>();
        List<OppBelongingInfo> oppBelongingList = new ArrayList<>();
        List<OppSearchResult> oppSearchResultList = new ArrayList<>();

        if (emp_position.equals("10000030")){
            deptInfoList = opportunityMapper.getDeptInfoByEmpId(emp_id);
            empInfoList = opportunityMapper.getEmpInfoByEmpIdAndDeptId(null,deptInfoList.get(0).getDeptId());
            oppBelongingList = opportunityMapper.getOppBelonging(deptInfoList.get(0).getDeptName());
            oppSearchResultList = new ArrayList<>();
        }

        if (emp_position.equals("30000010")){
            deptInfoList = opportunityMapper.getDeptInfoByEmpId(emp_id);
            empInfoList = opportunityMapper.getEmpInfoByEmpIdAndDeptId(null,deptInfoList.get(0).getDeptId());
            oppBelongingList = opportunityMapper.getOppBelonging(null);
            oppSearchResultList = opportunityMapper.getOppSearchResult(emp_id);
            for (OppSearchResult result : oppSearchResultList) {
                result.setOppSalesDeptName(deptInfoList.get(0).getDeptName());
                result.setOppCustomerManagerName(employeeMapper.getEmpNameById(emp_id));
                result.setOppBelongingName(opportunityMapper.getOppBelongingNameById(result.getOppBelonging()));
            }

        }

        if (emp_position.equals("30000030")){
            deptInfoList = opportunityMapper.getDeptInfoByEmpId(emp_id);
            empInfoList = opportunityMapper.getEmpInfoByEmpIdAndDeptId(emp_id, null);
            if (deptInfoList.get(0).getDeptId().substring(0, 3).equals("802")){
                oppBelongingList = opportunityMapper.getOppBelonging(null);
            }else {
                oppBelongingList = opportunityMapper.getOppBelonging(deptInfoList.get(0).getDeptName());
            }
            oppSearchResultList = opportunityMapper.getOppSearchResult(emp_id);
            for (OppSearchResult result : oppSearchResultList) {
                result.setOppSalesDeptName(deptInfoList.get(0).getDeptName());
                result.setOppCustomerManagerName(empInfoList.get(0).getEmpName());
                result.setOppBelongingName(opportunityMapper.getOppBelongingNameById(result.getOppBelonging()));
            }

        }

        if (emp_position.equals("20000010") || emp_position.equals("20000020") || emp_position.equals("50000000")){
            deptInfoList = opportunityMapper.getDeptInfoByEmpId(null);
            empInfoList = opportunityMapper.getEmpInfoByEmpIdAndDeptId(null,null);
            oppBelongingList = opportunityMapper.getOppBelonging(null);
            oppSearchResultList = new ArrayList<>();
        }

        OppManagePageInfo oppManagePageInfo = new OppManagePageInfo();
        oppManagePageInfo.setDeptInfoList(deptInfoList);
        oppManagePageInfo.setEmpInfoList(empInfoList);
        oppManagePageInfo.setOppBelongingList(oppBelongingList);
        oppManagePageInfo.setOppSearchResultList(oppSearchResultList);

        return oppManagePageInfo;
    }

    @Cacheable(cacheNames="opp_getEmpByDept")
    @Override
    public List<EmpInfo> getEmpByDept(String dept_id) {
        return opportunityMapper.getEmpByDept(dept_id);
    }

    @Cacheable(cacheNames="opp_getProductByType")
    @Override
    public List<ProductInfo> getProductByType(String type_id) {
        return opportunityMapper.getProductByType(type_id);
    }

    @Cacheable(cacheNames="opp_getTypeByProduct")
    @Override
    public List<OppTypeInfo> getTypeByProduct(String pro_id) {
        return opportunityMapper.getTypeByProduct(pro_id);
    }

    @Override
    public OppDetail showOppDetail(String oppId, String empId) {

        Employee e = employeeMapper.selectById(empId);
        String empPositionId = e.getEmpPositionId();

        Opportunity opportunity = new Opportunity();
        List<SubOpportunity> subOpportunityList = new ArrayList<>();
        List<Competitor> competitorList = new ArrayList<>();
        List<Payer> payerList = new ArrayList<>();
        List<Trackinglog> trackinglogList = new ArrayList<>();

        opportunity = opportunityMapper.selectById(oppId);
        QueryWrapper<SubOpportunity> qw = Wrappers.query();
        qw.eq("sub_opp_opp_id", oppId);
        subOpportunityList = subOpportunityMapper.selectList(qw);
        QueryWrapper<Competitor> qw1 = Wrappers.query();
        qw1.eq("comp_opp_id", oppId);
        competitorList = competitorMapper.selectList(qw1);
        QueryWrapper<Payer> qw2 = Wrappers.query();
        qw2.eq("p_opp_id", oppId);
        payerList = payerMapper.selectList(qw2);
        if (empPositionId.equals("20000010") || empPositionId.equals("50000000")){
            QueryWrapper<Trackinglog> qw3 = Wrappers.query();
            qw3.eq("t_opp_id", oppId);
            trackinglogList = trackinglogMapper.selectList(qw3);
        }

        OppDetail oppDetail = new OppDetail();
        oppDetail.setOpportunity(opportunity);
        oppDetail.setSubOpportunityList(subOpportunityList);
        oppDetail.setCompetitorList(competitorList);
        oppDetail.setPayerList(payerList);
        oppDetail.setTrackinglogList(trackinglogList);

        return oppDetail;
    }

    @Override
    public RespBean getOpportunity(OppSearchCondition oppSearchCondition) {
        List<OppSearchResult> oppSearchResultList = new ArrayList<>();
        List<OppSearchResult> oppSearchResultList1 = opportunityMapper.getOpportunityB(oppSearchCondition);
        List<OppSearchResult> oppSearchResultList2 = opportunityMapper.getOpportunity(oppSearchCondition);

        oppSearchResultList.addAll(oppSearchResultList1);
        oppSearchResultList.addAll(oppSearchResultList2);

        for (OppSearchResult osr : oppSearchResultList) {
            osr.setOppSalesDeptName(opportunityMapper.getDeptNameById(osr.getOppSalesDept()));
            osr.setOppCustomerManagerName(opportunityMapper.getCusMgrNameById(osr.getOppCustomerManagerId()));
            osr.setOppBelongingName(opportunityMapper.getOppBelongingNameById(osr.getOppBelonging()));
        }
        String msg = "";
        if (oppSearchResultList.isEmpty()){
            msg = "Opportunity track record updated successfully!！";
        }else {
            msg = "search successful!！";
        }
        RespBean respBean = RespBean.ok(200, msg, oppSearchResultList);
        return respBean;
    }

    @Override
    public RespBean showUpdatePage(OppIdAndOppBId oppIdAndOppBId) {
        if (oppIdAndOppBId.getOppStatus().equals("20")){
            return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified!");
        }
        if (oppIdAndOppBId.getOppStatus().equals("40")){
            return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified!！");
        }
        if (oppIdAndOppBId.getOppStatus().equals("50")){
            return RespBean.error(500, "The status of this opportunity is in progress and cannot be modified!");
        }

        UpdatePageInfo updatePageInfo = new UpdatePageInfo();
        String opp_id = oppIdAndOppBId.getOppId();
        String oppb_id = oppIdAndOppBId.getOppBId();
        if (opp_id == null){
            OpportunityBuffer opportunityBuffer;
            List<SubOpportunityBuffer> subOpportunityBufferList;
            List<CompetitorBuffer> competitorBufferList;
            List<PayerBuffer> payerBufferList;

            opportunityBuffer = opportunityBufferMapper.selectById(oppb_id);

            QueryWrapper<SubOpportunityBuffer> qw1 = Wrappers.query();
            qw1.eq("sub_oppb_opp_id", oppb_id);
            subOpportunityBufferList = subOpportunityBufferMapper.selectList(qw1);

            QueryWrapper<CompetitorBuffer> qw2 = Wrappers.query();
            qw2.eq("compb_opp_id", oppb_id);
            competitorBufferList = competitorBufferMapper.selectList(qw2);

            QueryWrapper<PayerBuffer> qw3 = Wrappers.query();
            qw3.eq("pb_opp_id", oppb_id);
            payerBufferList = payerBufferMapper.selectList(qw3);

            BufferOppInfo bufferOppInfo = new BufferOppInfo();
            bufferOppInfo.setOpportunityBuffer(opportunityBuffer);
            bufferOppInfo.setSubOpportunityBufferList(subOpportunityBufferList);
            bufferOppInfo.setCompetitorBufferList(competitorBufferList);
            bufferOppInfo.setPayerBufferList(payerBufferList);

            updatePageInfo.setBufferOppInfo(bufferOppInfo);

        }else {
            Opportunity opportunity;
            List<SubOpportunity> subOpportunityList;
            List<Competitor> competitorList;
            List<Payer> payerList;

            opportunity = opportunityMapper.selectById(opp_id);

            QueryWrapper<SubOpportunity> qw1 = Wrappers.query();
            qw1.eq("sub_opp_opp_id", opp_id);
            subOpportunityList = subOpportunityMapper.selectList(qw1);

            QueryWrapper<Competitor> qw2 = Wrappers.query();
            qw2.eq("comp_opp_id", opp_id);
            competitorList = competitorMapper.selectList(qw2);

            QueryWrapper<Payer> qw3 = Wrappers.query();
            qw3.eq("p_opp_id", opp_id);
            payerList = payerMapper.selectList(qw3);

            CommonOppInfo commonOppInfo = new CommonOppInfo();
            commonOppInfo.setOpportunity(opportunity);
            commonOppInfo.setSubOpportunityList(subOpportunityList);
            commonOppInfo.setCompetitorList(competitorList);
            commonOppInfo.setPayerList(payerList);

            updatePageInfo.setCommonOppInfo(commonOppInfo);
        }

        RespBean respBean = RespBean.ok(200, "ok", updatePageInfo);
        return respBean;
    }

    @Override
    public RespBean getOppTrackMainPage(String oppId) {
        RespBean respBean = null;
        if (oppId == null || oppId == ""){
            respBean = RespBean.error(500, "This opportunity has not been successfully created and cannot be tracked!");
            return respBean;
        }
        Opportunity opp = opportunityMapper.selectById(oppId);
        String oppName = opp.getOppName();
        List<Trackinglog> oppTrackList;
        QueryWrapper<Trackinglog> qw = Wrappers.query();
        qw.eq("t_opp_id", oppId);
        oppTrackList = trackinglogMapper.selectList(qw);

        OppTrackMainPage oppTrackMainPage = new OppTrackMainPage();
        oppTrackMainPage.setOppId(oppId);
        oppTrackMainPage.setOppName(oppName);
        oppTrackMainPage.setOppTrackList(oppTrackList);

        respBean = RespBean.ok(200, "ok", oppTrackMainPage);
        return respBean;
    }

    @Override
    public RespBean getApprovalPage(String empId) {
        Employee employee = employeeMapper.selectById(empId);
        String empPositionId = employee.getEmpPositionId();
        List<Flow> flowList = opportunityBufferMapper.getApproveOppList(empPositionId);
        for (Flow flow : flowList) {
            if (flow.getOppId() == null){
                flow.setFlowName("Opportunity Addition Process");
            }else {
                flow.setFlowName("Opportunity Addition Process");
            }
        }
        return RespBean.ok(200, "ok", flowList);
    }

    @Override
    public RespBean showOppApproveDetail(String oppIdB) {
        OpportunityBuffer opportunityBuffer = opportunityBufferMapper.selectById(oppIdB);
        QueryWrapper<SubOpportunityBuffer> qw1 = Wrappers.query();
        qw1.eq("sub_oppb_opp_id", oppIdB);
        List<SubOpportunityBuffer> subOpportunityBufferList = subOpportunityBufferMapper.selectList(qw1);
        QueryWrapper<CompetitorBuffer> qw2 = Wrappers.query();
        qw2.eq("compb_opp_id", oppIdB);
        List<CompetitorBuffer> competitorBufferList = competitorBufferMapper.selectList(qw2);
        QueryWrapper<PayerBuffer> qw3 = Wrappers.query();
        qw3.eq("pb_opp_id", oppIdB);
        List<PayerBuffer> payerBufferList = payerBufferMapper.selectList(qw3);

        String oppId = opportunityBuffer.getOppbOppId();
        QueryWrapper<Trackinglog> qw4 = Wrappers.query();
        qw4.eq("t_opp_id", oppId);
        List<Trackinglog> trackinglogList = trackinglogMapper.selectList(qw4);
        QueryWrapper<Approvallog> qw5 = Wrappers.query();
        qw5.eq("app_opp_id", oppIdB);
        List<Approvallog> approvallogList = approvallogMapper.selectList(qw5);
        Customer customer = customerMapper.selectById(opportunityBuffer.getOppbCusId());

        ApproveDetail approveDetail = new ApproveDetail();
        approveDetail.setOpportunityBuffer(opportunityBuffer);
        approveDetail.setSubOpportunityBufferList(subOpportunityBufferList);
        approveDetail.setCompetitorBufferList(competitorBufferList);
        approveDetail.setPayerBufferList(payerBufferList);
        approveDetail.setTrackinglogList(trackinglogList);
        approveDetail.setApprovallogList(approvallogList);
        approveDetail.setCustomer(customer);

        RespBean respBean = RespBean.ok(200, "ok", approveDetail);
        return respBean;
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public RespBean approval(Approval approval) throws Exception{
        String empName = approval.getEmpName();
        String empPositionId = approval.getEmpPositionId();
        int oppIdB = approval.getOppIdB();
        String approveResult = approval.getApproveResult();
        String approveAdvice = approval.getApproveAdvice();
        String msg = "";

        if (empPositionId.equals("20000010")){
            if (approveResult.equals("-1")){
                QueryWrapper<SubOpportunityBuffer> qw1 = Wrappers.query();
                qw1.eq("sub_oppb_opp_id", oppIdB);
                subOpportunityBufferMapper.delete(qw1);

                QueryWrapper<CompetitorBuffer> qw2 = Wrappers.query();
                qw2.eq("compb_opp_id", oppIdB);
                competitorBufferMapper.delete(qw2);

                QueryWrapper<PayerBuffer> qw3 = Wrappers.query();
                qw3.eq("pb_opp_id", oppIdB);
                payerBufferMapper.delete(qw3);

                QueryWrapper<Approvallog> qw4 = Wrappers.query();
                qw4.eq("app_opp_id", oppIdB);
                approvallogMapper.delete(qw4);

                opportunityBufferMapper.deleteById(oppIdB);
                msg = "Opportunity declined！";
            }

            if (approveResult.equals("0")){
                OpportunityBuffer opb = opportunityBufferMapper.selectById(oppIdB);
                opb.setOppbStatus("60");
                opportunityBufferMapper.updateById(opb);
                Approvallog approvallog = new Approvallog();
                approvallog.setAppFlowName("Opportunity Addition Process");
                approvallog.setAppPeople(empName);
                approvallog.setAppOpinion(approveAdvice);
                approvallog.setAppStatus("initial");
                approvallog.setAppResult("back");
                approvallog.setAppSubmitDate(opb.getOppbSubmitDate());
                approvallog.setAppOppId(oppIdB);
                approvallogMapper.insert(approvallog);
                msg = "Opportunity declined！";
            }

            if (approveResult.equals("1")){
                OpportunityBuffer opb = opportunityBufferMapper.selectById(oppIdB);
                opb.setOppbApproveStatus("1");
                opportunityBufferMapper.updateById(opb);
                Approvallog approvallog = new Approvallog();
                approvallog.setAppFlowName("Opportunity Addition Process");
                approvallog.setAppPeople(empName);
                approvallog.setAppOpinion(approveAdvice);
                approvallog.setAppStatus("initial");
                approvallog.setAppResult("agreed");
                approvallog.setAppSubmitDate(opb.getOppbSubmitDate());
                approvallog.setAppOppId(oppIdB);
                approvallogMapper.insert(approvallog);
                msg = "opportunity passed！";
            }
        }

        if (empPositionId.equals("10000030") || empPositionId.equals("30000010")){
            if (approveResult.equals("-1")){
                OpportunityBuffer opb = opportunityBufferMapper.selectById(oppIdB);
                if (opb.getOppbOppId() != null){
                    Opportunity oppo = opportunityMapper.selectById(opb.getOppbOppId());
                    oppo.setOppStatus("30");
                    opportunityMapper.updateById(oppo);
                }
                QueryWrapper<SubOpportunityBuffer> qw1 = Wrappers.query();
                qw1.eq("sub_oppb_opp_id", oppIdB);
                subOpportunityBufferMapper.delete(qw1);

                QueryWrapper<CompetitorBuffer> qw2 = Wrappers.query();
                qw2.eq("compb_opp_id", oppIdB);
                competitorBufferMapper.delete(qw2);

                QueryWrapper<PayerBuffer> qw3 = Wrappers.query();
                qw3.eq("pb_opp_id", oppIdB);
                payerBufferMapper.delete(qw3);

                QueryWrapper<Approvallog> qw4 = Wrappers.query();
                qw4.eq("app_opp_id", oppIdB);
                approvallogMapper.delete(qw4);

                opportunityBufferMapper.deleteById(oppIdB);
                msg = "Opportunity declined！";
            }

            if (approveResult.equals("0")){
                OpportunityBuffer opb = opportunityBufferMapper.selectById(oppIdB);
                Approvallog approvallog = new Approvallog();
                if (opb.getOppbOppId() == null){
                    opb.setOppbApproveStatus("0");
                    approvallog.setAppFlowName("Opportunity Addition Process");
                    approvallog.setAppStatus("review");
                }else {
                    approvallog.setAppFlowName("Opportunity to modify the process");
                    approvallog.setAppStatus("initial");
                }
                opb.setOppbStatus("60");
                opportunityBufferMapper.updateById(opb);
                approvallog.setAppPeople(empName);
                approvallog.setAppOpinion(approveAdvice);
                approvallog.setAppResult("back");
                approvallog.setAppSubmitDate(opb.getOppbSubmitDate());
                approvallog.setAppOppId(oppIdB);
                approvallogMapper.insert(approvallog);
                msg = "Opportunity returned！";
            }

            if (approveResult.equals("1")){

                OpportunityBuffer opb = opportunityBufferMapper.selectById(oppIdB);
                if (opb.getOppbOppId() == null){
                    Opportunity opp = new Opportunity();
                    List<SubOpportunity> subOpportunityList = new ArrayList<>();
                    List<Competitor> competitorList = new ArrayList<>();
                    List<Payer> payerList = new ArrayList<>();

                    String max_opp_id = opportunityMapper.getMaxOppId();
                    String new_opp_id = (Integer.parseInt(max_opp_id)+1) + "";

                    opp.setOppId(new_opp_id);
                    opp.setOppName(opb.getOppbName());
                    opp.setOppSalesDept(opb.getOppbSalesDept());
                    opp.setOppCustomerManagerId(opb.getOppbCustomerManagerId());
                    opp.setOppSignTime(opb.getOppbSignTime());
                    opp.setOppBelonging(opb.getOppbBelonging());
                    opp.setOppStatus("30");
                    opp.setOppPhase(opb.getOppbPhase());
                    opp.setOppType(opb.getOppbType());
                    opp.setOppProduct(opb.getOppbProduct());
                    opp.setOppBackground(opb.getOppbBackground());
                    opp.setOppCigarettes(opb.getOppbCigarettes());
                    opp.setOppCusId(opb.getOppbCusId());
                    opp.setOppOrigin(opb.getOppbOrigin());

                    QueryWrapper<SubOpportunityBuffer> qw1 = Wrappers.query();
                    qw1.eq("sub_oppb_opp_id", oppIdB);
                    List<SubOpportunityBuffer> subOpportunityBufferList = subOpportunityBufferMapper.selectList(qw1);
                    for (int i = 0; i < subOpportunityBufferList.size(); i++) {
                        SubOpportunity s = new SubOpportunity();
                        if (i < 10){
                            s.setSubOppId(new_opp_id+"0"+i);
                        }else {
                            s.setSubOppId(new_opp_id+i);
                        }
                        s.setSubOppName(subOpportunityBufferList.get(i).getSubOppbName());
                        s.setSubOppType(subOpportunityBufferList.get(i).getSubOppbType());
                        s.setSubOppProduct(subOpportunityBufferList.get(i).getSubOppbProduct());
                        s.setSubOppDept(subOpportunityBufferList.get(i).getSubOppbDept());
                        s.setSubOppCurrency(subOpportunityBufferList.get(i).getSubOppbCurrency());
                        s.setSubOppMoney(subOpportunityBufferList.get(i).getSubOppbMoney());
                        s.setSubOppOppId(new_opp_id);
                        s.setSubOppStatus("30");
                        subOpportunityList.add(s);
                    }
                    QueryWrapper<CompetitorBuffer> qw2 = Wrappers.query();
                    qw2.eq("compb_opp_id", oppIdB);
                    List<CompetitorBuffer> competitorBufferList = competitorBufferMapper.selectList(qw2);
                    for (CompetitorBuffer c : competitorBufferList) {
                        Competitor competitor = new Competitor();
                        competitor.setCompName(c.getCompbName());
                        competitor.setCompOppId(new_opp_id);
                        competitor.setCompPosition(c.getCompbPosition());
                        competitorList.add(competitor);
                    }
                    QueryWrapper<PayerBuffer> qw3 = Wrappers.query();
                    qw3.eq("pb_opp_id", oppIdB);
                    List<PayerBuffer> payerBufferList = payerBufferMapper.selectList(qw3);
                    for (PayerBuffer p : payerBufferList) {
                        Payer payer = new Payer();
                        payer.setpName(p.getPbName());
                        payer.setpDept(p.getPbDept());
                        payer.setpPosition(p.getPbPosition());
                        payer.setpPhone(p.getPbPhone());
                        payer.setpDecision(p.getPbDecision());
                        payer.setpEffect(p.getPbEffect());
                        payer.setpAgree(p.getPbAgree());
                        payer.setpOppId(new_opp_id);
                        payerList.add(payer);
                    }

                    opportunityMapper.insert(opp);
                    for (SubOpportunity s : subOpportunityList) {
                        subOpportunityMapper.insert(s);
                    }
                    for (Competitor c : competitorList) {
                        competitorMapper.insert(c);
                    }
                    for (Payer p : payerList) {
                        payerMapper.insert(p);
                    }

                    subOpportunityBufferMapper.delete(qw1);
                    competitorBufferMapper.delete(qw2);
                    payerBufferMapper.delete(qw3);
                    QueryWrapper<Approvallog> qw4 = Wrappers.query();
                    qw4.eq("app_opp_id", oppIdB);
                    approvallogMapper.delete(qw4);
                    opportunityBufferMapper.deleteById(oppIdB);
                }

                else {

                    Opportunity updatedOpp = new Opportunity();
                    List<SubOpportunity> addSubOppList = new ArrayList<>();
                    List<SubOpportunity> updateSubOppList = new ArrayList<>();
                    List<Competitor> addCompetitorList = new ArrayList<>();
                    List<Payer> addPayerList = new ArrayList<>();

                    updatedOpp.setOppId(opb.getOppbOppId());
                    updatedOpp.setOppName(opb.getOppbName());
                    updatedOpp.setOppSalesDept(opb.getOppbSalesDept());
                    updatedOpp.setOppCustomerManagerId(opb.getOppbCustomerManagerId());
                    updatedOpp.setOppSignTime(opb.getOppbSignTime());
                    updatedOpp.setOppBelonging(opb.getOppbBelonging());
                    updatedOpp.setOppStatus("30");
                    updatedOpp.setOppPhase(opb.getOppbPhase());
                    updatedOpp.setOppType(opb.getOppbType());
                    updatedOpp.setOppProduct(opb.getOppbProduct());
                    updatedOpp.setOppBackground(opb.getOppbBackground());
                    updatedOpp.setOppCigarettes(opb.getOppbCigarettes());
                    updatedOpp.setOppCusId(opb.getOppbCusId());
                    updatedOpp.setOppOrigin(opb.getOppbOrigin());

                    QueryWrapper<SubOpportunityBuffer> qw1 = Wrappers.query();
                    qw1.eq("sub_oppb_opp_id", oppIdB);
                    List<SubOpportunityBuffer> subOpportunityBufferList = subOpportunityBufferMapper.selectList(qw1);
                    for (SubOpportunityBuffer sb : subOpportunityBufferList) {
                        SubOpportunity s = new SubOpportunity();
                        s.setSubOppName(sb.getSubOppbName());
                        s.setSubOppType(sb.getSubOppbType());
                        s.setSubOppProduct(sb.getSubOppbProduct());
                        s.setSubOppDept(sb.getSubOppbDept());
                        s.setSubOppCurrency(sb.getSubOppbCurrency());
                        s.setSubOppMoney(sb.getSubOppbMoney());
                        s.setSubOppOppId(updatedOpp.getOppId());
                        s.setSubOppStatus("30");
                        if (sb.getSubOppbStatus() == null){
                            addSubOppList.add(s);
                        }
                        else {
                            QueryWrapper<SubOpportunity> qw_s = Wrappers.query();
                            qw_s.eq("sub_opp_name", s.getSubOppName()).eq("sub_opp_opp_id", s.getSubOppOppId());
                            List<SubOpportunity> sbs = subOpportunityMapper.selectList(qw_s);
                            s.setSubOppId(sbs.get(0).getSubOppId());
                            updateSubOppList.add(s);
                        }
                    }

                    QueryWrapper<CompetitorBuffer> qw2 = Wrappers.query();
                    qw2.eq("compb_opp_id", oppIdB);
                    List<CompetitorBuffer> competitorBufferList = competitorBufferMapper.selectList(qw2);
                    for (CompetitorBuffer c : competitorBufferList) {
                        QueryWrapper<Competitor> qw_c = Wrappers.query();
                        qw_c.eq("comp_name", c.getCompbName()).eq("comp_opp_id", opb.getOppbOppId());
                        int num = competitorMapper.selectCount(qw_c);
                        if (num == 0){
                            Competitor competitor = new Competitor();
                            competitor.setCompName(c.getCompbName());
                            competitor.setCompPosition(c.getCompbPosition());
                            competitor.setCompOppId(updatedOpp.getOppId());
                            addCompetitorList.add(competitor);
                        }
                    }

                    QueryWrapper<PayerBuffer> qw3 = Wrappers.query();
                    qw3.eq("pb_opp_id", oppIdB);
                    List<PayerBuffer> payerBufferList = payerBufferMapper.selectList(qw3);
                    for (PayerBuffer p : payerBufferList) {
                        QueryWrapper<Payer> qw_p = Wrappers.query();
                        qw_p.eq("p_name", p.getPbName()).eq("p_opp_id", opb.getOppbOppId());
                        int num = payerMapper.selectCount(qw_p);
                        if (num == 0){
                            Payer payer = new Payer();
                            payer.setpName(p.getPbName());
                            payer.setpDept(p.getPbDept());
                            payer.setpPosition(p.getPbPosition());
                            payer.setpPhone(p.getPbPhone());
                            payer.setpDecision(p.getPbDecision());
                            payer.setpEffect(p.getPbEffect());
                            payer.setpAgree(p.getPbAgree());
                            payer.setpOppId(updatedOpp.getOppId());
                            addPayerList.add(payer);
                        }
                    }

                    opportunityMapper.updateById(updatedOpp);
                    for (SubOpportunity subOpportunity : addSubOppList) {
                        subOpportunityMapper.insert(subOpportunity);
                    }
                    for (SubOpportunity s : updateSubOppList) {
                        subOpportunityMapper.updateById(s);
                    }
                    for (Competitor competitor : addCompetitorList) {
                        competitorMapper.insert(competitor);
                    }
                    for (Payer payer : addPayerList) {
                        payerMapper.insert(payer);
                    }

                    subOpportunityBufferMapper.delete(qw1);
                    competitorBufferMapper.delete(qw2);
                    payerBufferMapper.delete(qw3);
                    QueryWrapper<Approvallog> qw4 = Wrappers.query();
                    qw4.eq("app_opp_id", oppIdB);
                    approvallogMapper.delete(qw4);
                    opportunityBufferMapper.deleteById(oppIdB);
                }

                msg = "opportunity passed！";
            }

        }

        return RespBean.ok(200, msg);
    }


}
