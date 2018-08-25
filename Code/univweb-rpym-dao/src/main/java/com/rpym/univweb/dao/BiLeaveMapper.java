package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BiLeave;
import com.rpym.univweb.entity.BiLeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiLeaveMapper {
    int countByExample(BiLeaveExample example);

    int deleteByExample(BiLeaveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiLeave record);

    int insertSelective(BiLeave record);

    List<BiLeave> selectByExample(BiLeaveExample example);

    BiLeave selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiLeave record, @Param("example") BiLeaveExample example);

    int updateByExample(@Param("record") BiLeave record, @Param("example") BiLeaveExample example);

    int updateByPrimaryKeySelective(BiLeave record);

    int updateByPrimaryKey(BiLeave record);
}