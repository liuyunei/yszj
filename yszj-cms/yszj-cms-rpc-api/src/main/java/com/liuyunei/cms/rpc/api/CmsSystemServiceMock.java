package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsSystemMapper;
import com.liuyunei.cms.dao.model.CmsSystem;
import com.liuyunei.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}
