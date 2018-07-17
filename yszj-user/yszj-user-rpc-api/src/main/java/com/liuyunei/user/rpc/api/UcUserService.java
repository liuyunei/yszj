package com.liuyunei.user.rpc.api;

import com.liuyunei.common.base.BaseService;
import com.liuyunei.user.dao.model.UcUser;
import com.liuyunei.user.dao.model.UcUserExample;

import java.util.List;
/**
* UcUserService接口
* Created by liuyunei on 2018/6/11
*/
public interface UcUserService extends BaseService<UcUser, UcUserExample> {
    //新增用户
    public UcUser createUser(UcUser ucUser);

    /**
     * 根据id查询用户
     * @param id   用户名
     * @return
     */
    public Long queryUserCountByUserId(String id);

    /**
     * 根据用户名查询用户
     * @param id
     * @return
     */
    public UcUser queryUserByUsername(String id);

    /**
     * 根据主键（用户名）更新用户信息,
     * @param ucUser
     * @return  1成功，0失败
     */
    public  int updateByPrimaryKey(UcUser ucUser);

}