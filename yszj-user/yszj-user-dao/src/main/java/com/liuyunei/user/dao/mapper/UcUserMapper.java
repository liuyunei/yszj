package com.liuyunei.user.dao.mapper;

import com.liuyunei.user.dao.model.UcUser;
import com.liuyunei.user.dao.model.UcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcUserMapper {
    long countByExample(UcUserExample example);

    int deleteByExample(UcUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UcUser record);

    int insertSelective(UcUser record);

    List<UcUser> selectByExample(UcUserExample example);

    UcUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UcUser record, @Param("example") UcUserExample example);

    int updateByExample(@Param("record") UcUser record, @Param("example") UcUserExample example);

    int updateByPrimaryKeySelective(UcUser record);

    int updateByPrimaryKey(UcUser record);
}