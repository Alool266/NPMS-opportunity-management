package com.neu.opportunitymanagement.oppManagement.mapper;

import com.neu.opportunitymanagement.oppManagement.dto.common.*;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppSearchCondition;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.OppSearchResult;
import com.neu.opportunitymanagement.oppManagement.entity.Opportunity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OpportunityMapper extends BaseMapper<Opportunity> {
    public List<DeptInfo> getDeptInfoByEmpId(String emp_id);

    public List<EmpInfo> getEmpInfoByEmpIdAndDeptId(String emp_id, String dept_id);

    public List<OppBelongingInfo> getOppBelonging(String dept_name);

    public List<OppSearchResult> getOppSearchResult(String emp_id);

    public String getOppBelongingNameById(String oppb_id);

    public String getDeptNameById(String dept_id);

    public String getCusMgrNameById(String cusMgr_id);

    public List<EmpInfo> getEmpByDept(String dept_id);

    public List<ProductInfo> getProductByType(String type_id);

    public List<OppTypeInfo> getTypeByProduct(String pro_id);

    public List<OppSearchResult> getOpportunity(OppSearchCondition searchCondition);
    public List<OppSearchResult> getOpportunityB(OppSearchCondition searchCondition);

    public String getMaxOppId();



}
