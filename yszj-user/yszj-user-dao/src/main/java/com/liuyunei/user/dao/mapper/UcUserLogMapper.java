package com.liuyunei.user.dao.mapper;

import com.liuyunei.user.dao.model.UcUserLog;
import com.liuyunei.user.dao.model.UcUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcUserLogMapper {
    long countByExample(UcUserLogExample example);

    int deleteByExample(UcUserLogExample example);

    int deleteByPrimaryKey(Integer userLogId);

    int insert(UcUserLog record);

    int insertSelective(UcUserLog record);

    List<UcUserLog> selectByExampleWithBLOBs(UcUserLogExample example);

    List<UcUserLog> selectByExample(UcUserLogExample example);

    UcUserLog selectByPrimaryKey(Integer userLogId);

    int updateByExampleSelective(@Param("record") UcUserLog record, @Param("example") UcUserLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UcUserLog record, @Param("example") UcUserLogExample example);

    int updateByExample(@Param("record") UcUserLog record, @Param("example") UcUserLogExample example);

    int updateByPrimaryKeySelective(UcUserLog record);

    int updateByPrimaryKeyWithBLOBs(UcUserLog record);

    int updateByPrimaryKey(UcUserLog record);
}