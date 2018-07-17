package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsUserMapper;
import com.liuyunei.upms.dao.model.UpmsUser;
import com.liuyunei.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {
    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }
}
