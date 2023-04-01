package com.neu.opportunitymanagement.oppManagement.service;

import com.neu.opportunitymanagement.oppManagement.dto.common.RespBean;
import com.neu.opportunitymanagement.oppManagement.dto.tracklog.UpdateTrackInfo;
import com.neu.opportunitymanagement.oppManagement.entity.Trackinglog;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

public interface ITrackinglogService extends IService<Trackinglog> {

    public RespBean curdTrackinglog(UpdateTrackInfo updateTrackInfo);

}
