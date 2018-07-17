package com.liuyunei.user.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.user.dao.mapper.UcUserLogMapper;
import com.liuyunei.user.dao.model.UcUserLog;
import com.liuyunei.user.dao.model.UcUserLogExample;
import com.liuyunei.user.rpc.api.UcUserLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UcUserLogService实现
* Created by liuyunei on 2018/5/22
*/
@Service
@Transactional
@BaseService
public class UcUserLogServiceImpl extends BaseServiceImpl<UcUserLogMapper, UcUserLog, UcUserLogExample> implements UcUserLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcUserLogServiceImpl.class);

    @Autowired
    UcUserLogMapper ucUserLogMapper;

}