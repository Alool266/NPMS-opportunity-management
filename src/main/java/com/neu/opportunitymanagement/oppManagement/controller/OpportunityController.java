package com.neu.opportunitymanagement.oppManagement.controller;
import com.neu.opportunitymanagement.oppManagement.dto.approval.Approval;
import com.neu.opportunitymanagement.oppManagement.dto.common.*;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.*;
import com.neu.opportunitymanagement.oppManagement.dto.tracklog.UpdateTrackInfo;
import com.neu.opportunitymanagement.oppManagement.entity.Employee;
import com.neu.opportunitymanagement.oppManagement.entity.Opportunity;
import com.neu.opportunitymanagement.oppManagement.service.IOpportunityBufferService;
import com.neu.opportunitymanagement.oppManagement.service.IOpportunityService;
import com.neu.opportunitymanagement.oppManagement.service.ITrackinglogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oppManagement/opportunity")
public class OpportunityController {

    @Autowired
    IOpportunityService iOpportunityService;
    @Autowired
    IOpportunityBufferService iOpportunityBufferService;
    @Autowired
    ITrackinglogService iTrackinglogService;



    // Initialize the opportunity management page
    @GetMapping("getMainPage")
    public RespBean getMainPage(@RequestParam String empId) {
        OppManagePageInfo oppManagePageInfo = iOpportunityService.getMainPage(empId);
        RespBean respBean = RespBean.ok(200,"Go to the opportunity management page",oppManagePageInfo);
        return respBean;
    }


    // Second-level linkage between sales department and account manager
    @GetMapping("getEmpByDept")
    public RespBean getEmpByDept(@RequestParam String deptId){
        List<EmpInfo> empInfoList = iOpportunityService.getEmpByDept(deptId);
        RespBean respBean = RespBean.ok(200,"ok",empInfoList);
        return respBean;
    }


    // Opportunity type and product secondary linkage (query products according to opportunity type)
    @GetMapping("getProductByType")
    public RespBean getProductByType(@RequestParam String psoId){
        List<ProductInfo> productInfoList = iOpportunityService.getProductByType(psoId);
        RespBean respBean = RespBean.ok(200,"ok",productInfoList);
        return respBean;
    }


    // Opportunity type and product secondary linkage (query opportunity type according to product)
    @GetMapping("getTypeByProduct")
    public RespBean getTypeByProduct(@RequestParam String cproId){
        List<OppTypeInfo> oppTypeInfoList = iOpportunityService.getTypeByProduct(cproId);
        RespBean respBean = RespBean.ok(200,"ok",oppTypeInfoList);
        return respBean;
    }


    // Click on the Opportunity ID to display the Opportunity Details
    @GetMapping("showOppDetail")
    public RespBean showOppDetail(@RequestParam String oppId, @RequestParam String empId){
        OppDetail oppDetail = iOpportunityService.showOppDetail(oppId, empId);
        RespBean respBean = RespBean.ok(200,"ok",oppDetail);
        return respBean;
    }


    // Opportunity inquiry
    @PostMapping("getOpportunity")
    public RespBean getOpportunity(@RequestBody OppSearchCondition oppSearchCondition){
        return iOpportunityService.getOpportunity(oppSearchCondition);
    }


    // Determine whether the opportunity name is duplicated when adding an opportunity
    @GetMapping("testAddRepetition")
    public RespBean testAddRepetition(@RequestParam String oppbName, @RequestParam String cusId){
        return iOpportunityBufferService.testAddRepetition(oppbName, cusId);
    }


    // Opportunity to add
    @PostMapping("addOpportunity")
    public RespBean addOpportunity(@RequestBody AddOpportunityInfo addOpportunityInfo){
        RespBean respBean = null;
        try {
            respBean = iOpportunityBufferService.addOpportunity(addOpportunityInfo);
        }catch (Exception e){
            respBean = RespBean.error(500, "System error, please contact administrator...");
        }
        return respBean;
    }


    // Click the "Modify" button to display the modification page
    @PostMapping("showUpdatePage")
    public RespBean showUpdatePage(@RequestBody OppIdAndOppBId oppIdAndOppBId){
        return iOpportunityService.showUpdatePage(oppIdAndOppBId);
    }


    // Determine whether the opportunity name is duplicated when modifying the opportunity
    @GetMapping("testUpdateRepetition")
    public RespBean testUpdateRepetition(@RequestBody String oppbName, @RequestBody String cusId, @RequestBody String oppbId){
        return iOpportunityBufferService.testUpdateRepetition(oppbName,cusId,oppbId);
    }


    // opportunity modification
    @PostMapping("updateOpportunity")
    public RespBean updateOpportunity(@RequestBody UpdateOpportunityInfo updateOpportunityInfo){
        RespBean respBean = null;
        try {
            respBean = iOpportunityBufferService.updateOpportunity(updateOpportunityInfo);
        }catch (Exception e){
            respBean = RespBean.error(500, "System error, please contact administrator...");
        }
        return respBean;
    }


    // Opportunity Tracking Page Initialization
    @GetMapping("getOppTrackMainPage")
    public RespBean getOppTrackMainPage(@RequestParam String oppId){
        return iOpportunityService.getOppTrackMainPage(oppId);
    }


    // Add, delete, modify opportunity tracking records
    @PostMapping("curdTrackinglog")
    public RespBean curdTrackinglog(@RequestBody UpdateTrackInfo updateTrackInfo){
        RespBean respBean = null;
        try {
            respBean = iTrackinglogService.curdTrackinglog(updateTrackInfo);
        }catch (Exception e){
            respBean = RespBean.error(500, "System error, please contact administrator...");
        }
        return respBean;
    }


    // Opportunity approval page initialization
    @GetMapping("getApprovalPage")
    public RespBean getApprovalPage(@RequestParam String empId){
        return iOpportunityService.getApprovalPage(empId);
    }


    // Click the "Approve" button to display the opportunity approval information
    @GetMapping("showOppApproveDetail")
    public RespBean showOppApproveDetail(@RequestParam String oppIdB){
        return iOpportunityService.showOppApproveDetail(oppIdB);
    }


    // Submit approval comments
    @PostMapping("approval")
    public RespBean approval(@RequestBody Approval approval){
        RespBean respBean = null;
        try {
            respBean = iOpportunityService.approval(approval);
        }catch (Exception e){
            respBean = RespBean.error(500, "系统错误，请联系管理员...");
            System.err.println(e);
        }
        return respBean;
    }






}

