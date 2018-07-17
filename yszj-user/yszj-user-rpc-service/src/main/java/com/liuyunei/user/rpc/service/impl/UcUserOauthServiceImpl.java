package com.liuyunei.user.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.user.dao.mapper.UcUserOauthMapper;
import com.liuyunei.user.dao.model.UcUserOauth;
import com.liuyunei.user.dao.model.UcUserOauthExample;
import com.liuyunei.user.rpc.api.UcUserOauthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UcUserOauthService实现
* Created by liuyunei on 2018/5/22
*/
@Service
@Transactional
@BaseService
public class UcUserOauthServiceImpl extends BaseServiceImpl<UcUserOauthMapper, UcUserOauth, UcUserOauthExample> implements UcUserOauthService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcUserOauthServiceImpl.class);

    @Autowired
    UcUserOauthMapper ucUserOauthMapper;

}