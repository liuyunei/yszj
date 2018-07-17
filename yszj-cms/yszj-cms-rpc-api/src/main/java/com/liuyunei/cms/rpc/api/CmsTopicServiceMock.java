package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsTopicMapper;
import com.liuyunei.cms.dao.model.CmsTopic;
import com.liuyunei.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}
