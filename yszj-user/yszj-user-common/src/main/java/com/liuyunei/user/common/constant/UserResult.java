package com.liuyunei.user.common.constant;

import com.liuyunei.common.base.BaseResult;

/**
 * user系统常量枚举类
 */
public class UserResult extends BaseResult {

    public UserResult(UserResultConstant userResultConstant, Object data) {
        super(userResultConstant.getCode(), userResultConstant.getMessage(), data);
    }

}
