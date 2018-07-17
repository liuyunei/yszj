package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsTagMapper;
import com.liuyunei.cms.dao.model.CmsTag;
import com.liuyunei.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}
