package com.liuyunei.upms.common.constant;

import com.liuyunei.common.base.BaseResult;

/**
 * upms系统常量枚举类
 */
public class UpmsResult extends BaseResult {

    public UpmsResult(UpmsResultConstant upmsResultConstant, Object data) {
        super(upmsResultConstant.getCode(), upmsResultConstant.getMessage(), data);
    }

}
