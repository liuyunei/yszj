package com.liuyunei.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.liuyunei.common.base.BaseService;
import com.liuyunei.upms.dao.model.UpmsPermission;
import com.liuyunei.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by liuyunei on 2018/4/23.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {
    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);
}