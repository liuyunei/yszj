package com.liuyunei.upms.rpc.api;
import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.upms.dao.mapper.UpmsSystemMapper;
import com.liuyunei.upms.dao.model.UpmsSystem;
import com.liuyunei.upms.dao.model.UpmsSystemExample;
/**
* 降级实现UpmsSystemService接口
* Created by liuyunei on 2018/4/23.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {
    @Override
    public UpmsSystem selectUpmsSystemByName(String name) {
        return null;
    }
}
