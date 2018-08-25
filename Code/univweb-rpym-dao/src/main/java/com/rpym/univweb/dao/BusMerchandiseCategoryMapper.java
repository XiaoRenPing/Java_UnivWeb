package com.rpym.univweb.dao;

import com.rpym.univweb.entity.BusMerchandiseCategory;
import com.rpym.univweb.entity.BusMerchandiseCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusMerchandiseCategoryMapper {
    int countByExample(BusMerchandiseCategoryExample example);

    int deleteByExample(BusMerchandiseCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusMerchandiseCategory record);

    int insertSelective(BusMerchandiseCategory record);

    List<BusMerchandiseCategory> selectByExample(BusMerchandiseCategoryExample example);

    BusMerchandiseCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusMerchandiseCategory record, @Param("example") BusMerchandiseCategoryExample example);

    int updateByExample(@Param("record") BusMerchandiseCategory record, @Param("example") BusMerchandiseCategoryExample example);

    int updateByPrimaryKeySelective(BusMerchandiseCategory record);

    int updateByPrimaryKey(BusMerchandiseCategory record);
}