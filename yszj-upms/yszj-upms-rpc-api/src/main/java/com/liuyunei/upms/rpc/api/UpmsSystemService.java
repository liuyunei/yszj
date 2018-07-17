package com.liuyunei.upms.rpc.api;

import com.liuyunei.common.base.BaseService;
import com.liuyunei.upms.dao.model.UpmsSystem;
import com.liuyunei.upms.dao.model.UpmsSystemExample;

/**
* UpmsSystemService接口
* Created by liuyunei on 2018/4/23.
*/
public interface UpmsSystemService extends BaseService<UpmsSystem, UpmsSystemExample> {
    /**
     * 根据name获取UpmsSystem
     * @param name
     * @return
     */
    UpmsSystem selectUpmsSystemByName(String name);

}