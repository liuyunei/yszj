package com.liuyunei.user.rpc.api;

import com.liuyunei.common.base.BaseService;
import com.liuyunei.user.dao.model.UcUserContract;
import com.liuyunei.user.dao.model.UcUserContractExample;

/**
* UcUserContractService接口
* Created by liuyunei on 2018/6/12
*/
public interface UcUserContractService extends BaseService<UcUserContract, UcUserContractExample> {

    //新增合同
 UcUserContract  createContract(UcUserContract ucUserContract);

   //删除合同
   void  deleteContract(String id);

    /**
     * 根据合同id查询合同
     * @param id   合同ID
     * @return
     */
    UcUserContract queryUserCountByUserId(String id);
}