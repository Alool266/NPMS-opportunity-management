package com.neu.opportunitymanagement.oppManagement.mapper;

import com.neu.opportunitymanagement.oppManagement.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface CustomerMapper extends BaseMapper<Customer> {

}
