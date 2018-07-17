package com.liuyunei.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsPermissionMapper;
import com.liuyunei.upms.dao.model.UpmsPermission;
import com.liuyunei.upms.dao.model.UpmsPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsPermissionService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsPermissionServiceMock.class);

    @Override
    public JSONArray getTreeByRoleId(Integer roleId) {
        LOGGER.info("UpmsPermissionServiceMock => getTreeByRoleId");
        return null;
    }

    @Override
    public JSONArray getTreeByUserId(Integer usereId, Byte type) {
        LOGGER.info("UpmsPermissionServiceMock => getTreeByUserId");
        return null;
    }
}
