package com.liuyunei.user.rpc.service.impl;

import com.liuyunei.common.annotation.BaseService;
import com.liuyunei.common.base.BaseServiceImpl;
import com.liuyunei.user.dao.mapper.UcUserMapper;
import com.liuyunei.user.dao.model.UcUser;
import com.liuyunei.user.dao.model.UcUserExample;
import com.liuyunei.user.rpc.api.UcUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UcUserService实现
 * Created by liuyunei on 2018/6/11
 */
@Service
@Transactional
@BaseService
public class UcUserServiceImpl extends BaseServiceImpl<UcUserMapper, UcUser, UcUserExample> implements UcUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcUserServiceImpl.class);

    @Autowired
    private UcUserMapper ucUserMapper;

    //新增用户
    public UcUser createUser(UcUser ucUser) {
        System.out.println("进入createUser");
        long count = queryUserCountByUserId(ucUser.getUserId());
        System.out.println("进入createUser-count="+count);
        if (count > 0) {
            return null;
        }
        System.out.println("开始插入");
        ucUserMapper.insert(ucUser);
        return ucUser;
    }

    /**
     * 根据用户id查询用户数量，来判断用户是否存在
     * @param id   用户名
     * @return
     */
    public Long queryUserCountByUserId(String id)
    {
        UcUserExample ucUserExample = new UcUserExample();
        ucUserExample.createCriteria().andUserIdEqualTo(id);
        return ucUserMapper.countByExample(ucUserExample);

    }

    /**
     * 根据用户名查询用户
     * @param id
     * @return
     */
    public UcUser queryUserByUsername(String id)
    {
        return ucUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据主键（用户名）更新用户信息
     * @param ucUser
     * @return
     */
    public  int updateByPrimaryKey(UcUser ucUser){
        return ucUserMapper.updateByPrimaryKey(ucUser);
    }

}