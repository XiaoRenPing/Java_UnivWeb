package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BiAuditlogs;
import com.rpym.univweb.entity.BiAuditlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiAuditlogsMapper {
    int countByExample(BiAuditlogsExample example);

    int deleteByExample(BiAuditlogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiAuditlogs record);

    int insertSelective(BiAuditlogs record);

    List<BiAuditlogs> selectByExample(BiAuditlogsExample example);

    BiAuditlogs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiAuditlogs record, @Param("example") BiAuditlogsExample example);

    int updateByExample(@Param("record") BiAuditlogs record, @Param("example") BiAuditlogsExample example);

    int updateByPrimaryKeySelective(BiAuditlogs record);

    int updateByPrimaryKey(BiAuditlogs record);
}