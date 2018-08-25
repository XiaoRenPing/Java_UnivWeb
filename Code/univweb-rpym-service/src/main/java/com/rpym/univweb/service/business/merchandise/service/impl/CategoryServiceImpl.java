package com.rpym.univweb.service.business.merchandise.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dao.BusMerchandiseCategoryMapper;
import com.rpym.univweb.dto.business.merchandise.category.CategoryAddAndUpdateDto;
import com.rpym.univweb.dto.business.merchandise.category.CategoryQryInDto;
import com.rpym.univweb.entity.BusMerchandiseCategory;
import com.rpym.univweb.entity.BusMerchandiseCategoryExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.business.merchandise.service.ICategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseService implements ICategoryService{

	@Autowired
	BusMerchandiseCategoryMapper merchandiseCategoryDao;
	
	public boolean addCategory(CategoryAddAndUpdateDto categoryDto) {
		BusMerchandiseCategory category = new BusMerchandiseCategory();
		BeanUtils.copyProperties(categoryDto, category);
		merchandiseCategoryDao.insertSelective(category);
		return true;
	}

	public boolean updateCategory(CategoryAddAndUpdateDto categoryDto) {
		BusMerchandiseCategory category = new BusMerchandiseCategory();
		BeanUtils.copyProperties(categoryDto, category);
		merchandiseCategoryDao.updateByPrimaryKeySelective(category);
		return true;
	}

	public BusMerchandiseCategory findCategoryById(Long id) {
		return merchandiseCategoryDao.selectByPrimaryKey(id);
	}

	public boolean deleteCategory(Long id) {
		merchandiseCategoryDao.deleteByPrimaryKey(id);
		return true;
	}

	public PageInfo<BusMerchandiseCategory> pageListCategory(CategoryQryInDto categoryQueryDto) {
		BusMerchandiseCategoryExample categoryExample = new BusMerchandiseCategoryExample();
		BusMerchandiseCategoryExample.Criteria categoryCriteria = categoryExample.createCriteria();
		if(categoryQueryDto.getCatename() != null) {
			categoryCriteria.andParentidEqualTo(categoryQueryDto.getParentid());
		}
		if(categoryQueryDto.getCatename() != null) {
			categoryCriteria.andCatenameLike(this.fullLike(categoryQueryDto.getCatename()));
		}
		//this.initPage(categoryQueryDto);
		List<BusMerchandiseCategory> categoryList = merchandiseCategoryDao.selectByExample(categoryExample);
		return new PageInfo<BusMerchandiseCategory>(categoryList);
	}

}
