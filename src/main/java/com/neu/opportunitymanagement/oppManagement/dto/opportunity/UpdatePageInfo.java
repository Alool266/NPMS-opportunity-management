package com.neu.opportunitymanagement.oppManagement.dto.opportunity;

import java.io.Serializable;

public class UpdatePageInfo implements Serializable {
    private CommonOppInfo commonOppInfo;
    private BufferOppInfo bufferOppInfo;

    public CommonOppInfo getCommonOppInfo() {
        return commonOppInfo;
    }

    public void setCommonOppInfo(CommonOppInfo commonOppInfo) {
        this.commonOppInfo = commonOppInfo;
    }

    public BufferOppInfo getBufferOppInfo() {
        return bufferOppInfo;
    }

    public void setBufferOppInfo(BufferOppInfo bufferOppInfo) {
        this.bufferOppInfo = bufferOppInfo;
    }

    @Override
    public String toString() {
        return "UpdatePageInfo{" +
                "commonOppInfo=" + commonOppInfo +
                ", bufferOppInfo=" + bufferOppInfo +
                '}';
    }
}
