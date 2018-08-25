package com.rpym.univweb.dao;

import com.rpym.univweb.entity.SysSqlLog;
import com.rpym.univweb.entity.SysSqlLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSqlLogMapper {
    int countByExample(SysSqlLogExample example);

    int deleteByExample(SysSqlLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysSqlLog record);

    int insertSelective(SysSqlLog record);

    List<SysSqlLog> selectByExampleWithBLOBs(SysSqlLogExample example);

    List<SysSqlLog> selectByExample(SysSqlLogExample example);

    SysSqlLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysSqlLog record, @Param("example") SysSqlLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysSqlLog record, @Param("example") SysSqlLogExample example);

    int updateByExample(@Param("record") SysSqlLog record, @Param("example") SysSqlLogExample example);

    int updateByPrimaryKeySelective(SysSqlLog record);

    int updateByPrimaryKeyWithBLOBs(SysSqlLog record);

    int updateByPrimaryKey(SysSqlLog record);
}