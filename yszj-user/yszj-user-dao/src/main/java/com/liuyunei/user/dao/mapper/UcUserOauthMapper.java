package com.liuyunei.user.dao.mapper;

import com.liuyunei.user.dao.model.UcUserOauth;
import com.liuyunei.user.dao.model.UcUserOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcUserOauthMapper {
    long countByExample(UcUserOauthExample example);

    int deleteByExample(UcUserOauthExample example);

    int deleteByPrimaryKey(Integer userOauthId);

    int insert(UcUserOauth record);

    int insertSelective(UcUserOauth record);

    List<UcUserOauth> selectByExampleWithBLOBs(UcUserOauthExample example);

    List<UcUserOauth> selectByExample(UcUserOauthExample example);

    UcUserOauth selectByPrimaryKey(Integer userOauthId);

    int updateByExampleSelective(@Param("record") UcUserOauth record, @Param("example") UcUserOauthExample example);

    int updateByExampleWithBLOBs(@Param("record") UcUserOauth record, @Param("example") UcUserOauthExample example);

    int updateByExample(@Param("record") UcUserOauth record, @Param("example") UcUserOauthExample example);

    int updateByPrimaryKeySelective(UcUserOauth record);

    int updateByPrimaryKeyWithBLOBs(UcUserOauth record);

    int updateByPrimaryKey(UcUserOauth record);
}