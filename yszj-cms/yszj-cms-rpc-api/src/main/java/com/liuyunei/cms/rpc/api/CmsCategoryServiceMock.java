package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsCategoryMapper;
import com.liuyunei.cms.dao.model.CmsCategory;
import com.liuyunei.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}
