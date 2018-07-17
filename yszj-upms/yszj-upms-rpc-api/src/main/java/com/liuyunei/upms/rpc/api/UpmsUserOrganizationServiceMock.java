package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.liuyunei.upms.dao.model.UpmsUserOrganization;
import com.liuyunei.upms.dao.model.UpmsUserOrganizationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserOrganizationServiceMock.class);

    @Override
    public int organization(String[] organizationIds, int id) {
        LOGGER.info("UpmsUserOrganizationServiceMock => organization");
        return 0;
    }
}
