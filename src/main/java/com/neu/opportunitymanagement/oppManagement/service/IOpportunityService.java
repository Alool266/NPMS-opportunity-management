package com.neu.opportunitymanagement.oppManagement.service;

import com.neu.opportunitymanagement.oppManagement.dto.approval.Approval;
import com.neu.opportunitymanagement.oppManagement.dto.common.EmpInfo;
import com.neu.opportunitymanagement.oppManagement.dto.common.OppTypeInfo;
import com.neu.opportunitymanagement.oppManagement.dto.common.ProductInfo;
import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppDetail;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppIdAndOppBId;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppManagePageInfo;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppSearchCondition;
import com.neu.opportunitymanagement.oppManagement.entity.Opportunity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface IOpportunityService extends IService<Opportunity> {

    public OppManagePageInfo getMainPage(String emp_id);

    public List<EmpInfo> getEmpByDept(String dept_id);

    public List<ProductInfo> getProductByType(String type_id);

    public List<OppTypeInfo> getTypeByProduct(String pro_id);

    public OppDetail showOppDetail(String oppId, String empId);

    public RespBean getOpportunity(OppSearchCondition oppSearchCondition);

    public RespBean showUpdatePage(OppIdAndOppBId oppIdAndOppBId);

    public RespBean getOppTrackMainPage(String oppId);

    public RespBean getApprovalPage(String empId);

    public RespBean showOppApproveDetail(String oppIdB);

    public RespBean approval(Approval approval) throws Exception;

}
