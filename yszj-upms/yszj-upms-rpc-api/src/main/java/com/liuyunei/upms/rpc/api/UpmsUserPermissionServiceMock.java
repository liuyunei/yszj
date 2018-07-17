package com.liuyunei.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsUserPermissionMapper;
import com.liuyunei.upms.dao.model.UpmsUserPermission;
import com.liuyunei.upms.dao.model.UpmsUserPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserPermissionService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserPermissionServiceMock.class);

    @Override
    public int permission(JSONArray datas, int id) {
        LOGGER.info("UpmsUserPermissionServiceMock => permission");
        return 0;
    }
}
