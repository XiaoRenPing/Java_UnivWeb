package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BiDbDict;
import com.rpym.univweb.entity.BiDbDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiDbDictMapper {
    int countByExample(BiDbDictExample example);

    int deleteByExample(BiDbDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiDbDict record);

    int insertSelective(BiDbDict record);

    List<BiDbDict> selectByExample(BiDbDictExample example);

    BiDbDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiDbDict record, @Param("example") BiDbDictExample example);

    int updateByExample(@Param("record") BiDbDict record, @Param("example") BiDbDictExample example);

    int updateByPrimaryKeySelective(BiDbDict record);

    int updateByPrimaryKey(BiDbDict record);
}