package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseService;
import com.liuyunei.upms.dao.model.UpmsUser;
import com.liuyunei.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by liuyunei on 2018/4/23.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {
    UpmsUser createUser(UpmsUser upmsUser);
}