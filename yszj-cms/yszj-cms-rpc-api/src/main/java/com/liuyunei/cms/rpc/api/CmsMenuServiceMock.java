package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsMenuMapper;
import com.liuyunei.cms.dao.model.CmsMenu;
import com.liuyunei.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}
