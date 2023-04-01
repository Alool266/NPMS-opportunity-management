package com.neu.opportunitymanagement.oppManagement.mapper;

import com.neu.opportunitymanagement.oppManagement.dto.approval.Flow;
import com.neu.opportunitymanagement.oppManagement.entity.OpportunityBuffer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface OpportunityBufferMapper extends BaseMapper<OpportunityBuffer> {

    public List<Flow> getApproveOppList(String empPositionId);


}
