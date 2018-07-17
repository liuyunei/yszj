package com.liuyunei.user.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.user.dao.mapper.UcUserLogMapper;
import com.liuyunei.user.dao.model.UcUserLog;
import com.liuyunei.user.dao.model.UcUserLogExample;

/**
* 降级实现UcUserLogService接口
* Created by liuyunei on 2018/5/22
*/
public class UcUserLogServiceMock extends BaseServiceMock<UcUserLogMapper, UcUserLog, UcUserLogExample> implements UcUserLogService {

}
