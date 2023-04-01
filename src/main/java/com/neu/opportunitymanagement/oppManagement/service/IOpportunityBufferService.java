package com.neu.opportunitymanagement.oppManagement.service;

import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.AddOpportunityInfo;
import com.neu.opportunitymanagement.oppManagement.dto.opportunity.UpdateOpportunityInfo;
import com.neu.opportunitymanagement.oppManagement.entity.OpportunityBuffer;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IOpportunityBufferService extends IService<OpportunityBuffer> {

    public RespBean testAddRepetition(String oppbName, String cusId);

    public RespBean addOpportunity(AddOpportunityInfo addOpportunityInfo);

    public RespBean testUpdateRepetition(String oppbName, String cusId, String oppbId);

    public RespBean updateOpportunity(UpdateOpportunityInfo updateOpportunityInfo);


}
