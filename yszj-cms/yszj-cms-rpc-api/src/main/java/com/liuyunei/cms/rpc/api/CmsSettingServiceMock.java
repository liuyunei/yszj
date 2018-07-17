package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsSettingMapper;
import com.liuyunei.cms.dao.model.CmsSetting;
import com.liuyunei.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}
