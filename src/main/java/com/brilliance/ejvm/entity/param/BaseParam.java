package com.brilliance.ejvm.entity.param;

import java.io.Serializable;

/**
 * @author xushaobo (xushaobo@idstaff.com)
 * @date 2018/7/27 17:07
 */
public class BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调用方唯一系统名称
     */
    protected String callSysName;

    public String getCallSysName() {
        return callSysName;
    }

    public void setCallSysName(String callSysName) {
        this.callSysName = callSysName;
    }
}
