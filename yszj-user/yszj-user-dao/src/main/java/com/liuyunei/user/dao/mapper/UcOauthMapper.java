package com.liuyunei.user.dao.mapper;

import com.liuyunei.user.dao.model.UcOauth;
import com.liuyunei.user.dao.model.UcOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcOauthMapper {
    long countByExample(UcOauthExample example);

    int deleteByExample(UcOauthExample example);

    int deleteByPrimaryKey(Integer oauthId);

    int insert(UcOauth record);

    int insertSelective(UcOauth record);

    List<UcOauth> selectByExample(UcOauthExample example);

    UcOauth selectByPrimaryKey(Integer oauthId);

    int updateByExampleSelective(@Param("record") UcOauth record, @Param("example") UcOauthExample example);

    int updateByExample(@Param("record") UcOauth record, @Param("example") UcOauthExample example);

    int updateByPrimaryKeySelective(UcOauth record);

    int updateByPrimaryKey(UcOauth record);
}