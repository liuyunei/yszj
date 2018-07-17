package com.liuyunei.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsRolePermissionMapper;
import com.liuyunei.upms.dao.model.UpmsRolePermission;
import com.liuyunei.upms.dao.model.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsRolePermissionService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);

    @Override
    public int rolePermission(JSONArray datas, int id) {
        LOGGER.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }
}
