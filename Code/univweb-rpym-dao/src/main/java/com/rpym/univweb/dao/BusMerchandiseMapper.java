package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BusMerchandise;
import com.rpym.univweb.entity.BusMerchandiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusMerchandiseMapper {
    int countByExample(BusMerchandiseExample example);

    int deleteByExample(BusMerchandiseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusMerchandise record);

    int insertSelective(BusMerchandise record);

    List<BusMerchandise> selectByExample(BusMerchandiseExample example);

    BusMerchandise selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusMerchandise record, @Param("example") BusMerchandiseExample example);

    int updateByExample(@Param("record") BusMerchandise record, @Param("example") BusMerchandiseExample example);

    int updateByPrimaryKeySelective(BusMerchandise record);

    int updateByPrimaryKey(BusMerchandise record);
}