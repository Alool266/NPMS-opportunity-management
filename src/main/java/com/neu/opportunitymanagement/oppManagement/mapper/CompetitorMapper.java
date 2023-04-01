package com.neu.opportunitymanagement.oppManagement.mapper;

import com.neu.opportunitymanagement.oppManagement.entity.Competitor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface CompetitorMapper extends BaseMapper<Competitor> {

}
