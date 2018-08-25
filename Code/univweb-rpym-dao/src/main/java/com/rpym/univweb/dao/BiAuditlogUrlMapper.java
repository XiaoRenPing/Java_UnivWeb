package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BiAuditlogUrl;
import com.rpym.univweb.entity.BiAuditlogUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiAuditlogUrlMapper {
    int countByExample(BiAuditlogUrlExample example);

    int deleteByExample(BiAuditlogUrlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiAuditlogUrl record);

    int insertSelective(BiAuditlogUrl record);

    List<BiAuditlogUrl> selectByExample(BiAuditlogUrlExample example);

    BiAuditlogUrl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiAuditlogUrl record, @Param("example") BiAuditlogUrlExample example);

    int updateByExample(@Param("record") BiAuditlogUrl record, @Param("example") BiAuditlogUrlExample example);

    int updateByPrimaryKeySelective(BiAuditlogUrl record);

    int updateByPrimaryKey(BiAuditlogUrl record);
}