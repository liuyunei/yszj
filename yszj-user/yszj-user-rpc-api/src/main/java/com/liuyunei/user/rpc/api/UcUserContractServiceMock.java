package com.liuyunei.user.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.user.dao.mapper.UcUserContractMapper;
import com.liuyunei.user.dao.model.UcUserContract;
import com.liuyunei.user.dao.model.UcUserContractExample;

/**
* 降级实现UcUserContractService接口
* Created by liuyunei on 2018/6/14
*/
public class UcUserContractServiceMock extends BaseServiceMock<UcUserContractMapper, UcUserContract, UcUserContractExample> implements UcUserContractService {

    public UcUserContract createContract(UcUserContract ucUserContract) {
        return null;
    }

    public void deleteContract(String id) {

    }


    public UcUserContract queryUserCountByUserId(String id) {
        return null;
    }
}
