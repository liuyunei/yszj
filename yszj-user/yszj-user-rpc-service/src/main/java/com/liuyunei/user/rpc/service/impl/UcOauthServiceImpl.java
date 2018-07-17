package com.liuyunei.user.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.user.dao.mapper.UcOauthMapper;
import com.liuyunei.user.dao.model.UcOauth;
import com.liuyunei.user.dao.model.UcOauthExample;
import com.liuyunei.user.rpc.api.UcOauthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UcOauthService实现
* Created by liuyunei on 2018/5/22
*/
@Service
@Transactional
@BaseService
public class UcOauthServiceImpl extends BaseServiceImpl<UcOauthMapper, UcOauth, UcOauthExample> implements UcOauthService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcOauthServiceImpl.class);

    @Autowired
    UcOauthMapper ucOauthMapper;

}