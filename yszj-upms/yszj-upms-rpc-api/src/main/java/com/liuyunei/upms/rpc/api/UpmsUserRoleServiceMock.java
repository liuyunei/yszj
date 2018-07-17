package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsUserRoleMapper;
import com.liuyunei.upms.dao.model.UpmsUserRole;
import com.liuyunei.upms.dao.model.UpmsUserRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserRoleService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsUserRoleServiceMock extends BaseServiceMock<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserRoleServiceMock.class);

    @Override
    public int role(String[] roleIds, int id) {
        LOGGER.info("UpmsUserRoleServiceMock => role");
        return 0;
    }
}
