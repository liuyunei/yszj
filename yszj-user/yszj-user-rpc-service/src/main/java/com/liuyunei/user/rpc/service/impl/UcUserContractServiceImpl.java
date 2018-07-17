package com.liuyunei.user.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.user.dao.mapper.UcUserContractMapper;
import com.liuyunei.user.dao.model.UcUserContract;
import com.liuyunei.user.dao.model.UcUserContractExample;
import com.liuyunei.user.rpc.api.UcUserContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* UcUserContractService实现
* Created by liuyunei on 2018/6/12
*/
@Service
@Transactional
@BaseService
public class UcUserContractServiceImpl extends BaseServiceImpl<UcUserContractMapper, UcUserContract, UcUserContractExample> implements UcUserContractService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcUserContractServiceImpl.class);

    @Autowired
     private UcUserContractMapper ucUserContractMapper;

    @Override
    public UcUserContract createContract(UcUserContract ucUserContract) {
        UcUserContractExample ucUserContractExample=new UcUserContractExample();
        ucUserContractMapper.insert(ucUserContract);
        return ucUserContract;
    }

    @Override
    public void deleteContract(String id) {
        ucUserContractMapper.deleteByPrimaryKey(id);

    }



    @Override
    public UcUserContract queryUserCountByUserId(String id) {
        return ucUserContractMapper.selectByPrimaryKey(id);
    }

}