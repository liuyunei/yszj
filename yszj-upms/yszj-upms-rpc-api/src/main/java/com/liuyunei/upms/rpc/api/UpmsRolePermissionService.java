package com.liuyunei.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.liuyunei.common.base.BaseService;
import com.liuyunei.upms.dao.model.UpmsRolePermission;
import com.liuyunei.upms.dao.model.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* Created by liuyunei on 2018/4/23.
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {
    /**
     * 角色权限
     * @param datas 权限数据
     * @param id 角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);

}