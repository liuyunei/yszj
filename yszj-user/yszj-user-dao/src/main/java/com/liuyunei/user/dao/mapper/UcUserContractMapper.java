package com.liuyunei.user.dao.mapper;

import com.liuyunei.user.dao.model.UcUserContract;
import com.liuyunei.user.dao.model.UcUserContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcUserContractMapper {
    long countByExample(UcUserContractExample example);

    int deleteByExample(UcUserContractExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(UcUserContract record);

    int insertSelective(UcUserContract record);

    List<UcUserContract> selectByExampleWithBLOBs(UcUserContractExample example);

    List<UcUserContract> selectByExample(UcUserContractExample example);

    UcUserContract selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") UcUserContract record, @Param("example") UcUserContractExample example);

    int updateByExampleWithBLOBs(@Param("record") UcUserContract record, @Param("example") UcUserContractExample example);

    int updateByExample(@Param("record") UcUserContract record, @Param("example") UcUserContractExample example);

    int updateByPrimaryKeySelective(UcUserContract record);

    int updateByPrimaryKeyWithBLOBs(UcUserContract record);

    int updateByPrimaryKey(UcUserContract record);
}