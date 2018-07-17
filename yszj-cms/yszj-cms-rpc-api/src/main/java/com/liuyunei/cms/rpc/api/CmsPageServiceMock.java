package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsPageMapper;
import com.liuyunei.cms.dao.model.CmsPage;
import com.liuyunei.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}
