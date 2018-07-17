package com.liuyunei.user.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.user.dao.mapper.UcUserMapper;
import com.liuyunei.user.dao.model.UcUser;
import com.liuyunei.user.dao.model.UcUserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
/**
* 降级实现UcUserService接口
* Created by liuyunei on 2018/6/11
*/
public class UcUserServiceMock extends BaseServiceMock<UcUserMapper, UcUser, UcUserExample> implements UcUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcUserServiceMock.class);
    public UcUser createUser(UcUser ucUser) {
        return null;
    }

    public Long queryUserCountByUserId(String id)
    {
        LOGGER.info("UcUserServiceMock => queryUserCountByUserId");
        return null;

    }
    public UcUser queryUserByUsername(String id)
    {
        LOGGER.info("UcUserServiceMock => queryUserByUsername");
        return null;
    }
    public  int updateByPrimaryKey(UcUser ucUser){
        LOGGER.info("UcUserServiceMock => updateByPrimaryKey");
        return 0;
    }

    public List<UcUser> getUserListById(UcUserExample userId)
    {
        LOGGER.info("UcUserServiceMock => selectUcUserServiceByUpmsUserId");
        return null;
    }
    public void updateUser(UcUser ucUser)
    {

    }
}
