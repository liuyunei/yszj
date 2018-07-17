package com.liuyunei.cms.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.cms.dao.mapper.CmsCategoryMapper;
import com.liuyunei.cms.dao.model.CmsCategory;
import com.liuyunei.cms.dao.model.CmsCategoryExample;
import com.liuyunei.cms.rpc.api.CmsCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsCategoryService实现
* Created by liuyunei on 2018/4/26.
*/
@Service
@Transactional
@BaseService
public class CmsCategoryServiceImpl extends BaseServiceImpl<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsCategoryServiceImpl.class);

    @Autowired
    CmsCategoryMapper cmsCategoryMapper;

}