package com.liuyunei.cms.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.cms.dao.mapper.CmsArticleTagMapper;
import com.liuyunei.cms.dao.model.CmsArticleTag;
import com.liuyunei.cms.dao.model.CmsArticleTagExample;
import com.liuyunei.cms.rpc.api.CmsArticleTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleTagService实现
* Created by liuyunei on 2018/4/26.
*/
@Service
@Transactional
@BaseService
public class CmsArticleTagServiceImpl extends BaseServiceImpl<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleTagServiceImpl.class);

    @Autowired
    CmsArticleTagMapper cmsArticleTagMapper;

}