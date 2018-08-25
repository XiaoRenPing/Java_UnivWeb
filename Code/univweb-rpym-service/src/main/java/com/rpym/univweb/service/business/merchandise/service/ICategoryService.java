package com.rpym.univweb.service.business.merchandise.service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.business.merchandise.category.CategoryAddAndUpdateDto;
import com.rpym.univweb.dto.business.merchandise.category.CategoryQryInDto;
import com.rpym.univweb.entity.BusMerchandiseCategory;

public interface ICategoryService {

	boolean addCategory(CategoryAddAndUpdateDto categoryDto);

	boolean updateCategory(CategoryAddAndUpdateDto categoryDto);

	BusMerchandiseCategory findCategoryById(Long id);

	boolean deleteCategory(Long id);

	PageInfo<BusMerchandiseCategory> pageListCategory(CategoryQryInDto categoryQueryDto);
}
