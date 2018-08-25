package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BiAuditlogAgent;
import com.rpym.univweb.entity.BiAuditlogAgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiAuditlogAgentMapper {
    int countByExample(BiAuditlogAgentExample example);

    int deleteByExample(BiAuditlogAgentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiAuditlogAgent record);

    int insertSelective(BiAuditlogAgent record);

    List<BiAuditlogAgent> selectByExample(BiAuditlogAgentExample example);

    BiAuditlogAgent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiAuditlogAgent record, @Param("example") BiAuditlogAgentExample example);

    int updateByExample(@Param("record") BiAuditlogAgent record, @Param("example") BiAuditlogAgentExample example);

    int updateByPrimaryKeySelective(BiAuditlogAgent record);

    int updateByPrimaryKey(BiAuditlogAgent record);
}