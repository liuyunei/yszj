package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseService;
import com.liuyunei.upms.dao.model.UpmsUserRole;
import com.liuyunei.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by liuyunei on 2018/4/23.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {
    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);
}