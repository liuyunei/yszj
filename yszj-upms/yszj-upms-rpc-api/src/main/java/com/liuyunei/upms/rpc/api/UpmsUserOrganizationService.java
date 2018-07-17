package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseService;
import com.liuyunei.upms.dao.model.UpmsUserOrganization;
import com.liuyunei.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* Created by liuyunei on 2018/4/23.
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {
    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);
}