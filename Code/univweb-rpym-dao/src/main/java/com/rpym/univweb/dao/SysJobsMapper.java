package com.rpym.univweb.dao;

import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.entity.SysJobsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJobsMapper {
    int countByExample(SysJobsExample example);

    int deleteByExample(SysJobsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysJobs record);

    int insertSelective(SysJobs record);

    List<SysJobs> selectByExample(SysJobsExample example);

    SysJobs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysJobs record, @Param("example") SysJobsExample example);

    int updateByExample(@Param("record") SysJobs record, @Param("example") SysJobsExample example);

    int updateByPrimaryKeySelective(SysJobs record);

    int updateByPrimaryKey(SysJobs record);
}