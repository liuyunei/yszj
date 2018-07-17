package com.liuyunei.cms.common.constant;

import com.liuyunei.common.base.BaseResult;

/**
 * cms系统常量枚举类
 * Created by liuyunei on 2018/2/19.
 */
public class CmsResult extends BaseResult {

    public CmsResult(CmsResultConstant cmsResultConstant, Object data) {
        super(cmsResultConstant.getCode(), cmsResultConstant.getMessage(), data);
    }

}
