package com.rpym.univweb.service.business.merchandise.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.common.CommonBase;
import com.rpym.univweb.dao.BusMerchandiseMapper;
import com.rpym.univweb.dto.business.merchandise.BusMerchandiseOutDto;
import com.rpym.univweb.dto.business.merchandise.BusMerchandiseQryOutDto;
import com.rpym.univweb.dto.merchandise.MerchandiseAddDto;
import com.rpym.univweb.dto.merchandise.MerchandiseQueryDto;
import com.rpym.univweb.dto.merchandise.MerchandiseUpdateDto;
import com.rpym.univweb.entity.BusMerchandise;
import com.rpym.univweb.entity.BusMerchandiseExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.business.merchandise.service.IMerchandiseService;

@Service("merchandiseService")
public class MerchandiseService extends BaseService implements IMerchandiseService{

	@Autowired
	BusMerchandiseMapper merchandiseDao;
	
	public boolean addMerchandise(MerchandiseAddDto merchandiseDto) {
		BusMerchandise merchandise = new BusMerchandise();
		BeanUtils.copyProperties(merchandiseDto, merchandise);
		Integer result = merchandiseDao.insertSelective(merchandise);
		if(result == 0) {
			return false;
		}
		return true;
	}

	public BusMerchandiseOutDto findMerchandiseById(Long id) {
		BusMerchandiseOutDto merchandiseOutDto = new BusMerchandiseOutDto();
		BusMerchandise merchandise = merchandiseDao.selectByPrimaryKey(id);
		BeanUtils.copyProperties(merchandise, merchandiseOutDto);
		return merchandiseOutDto;
	}

	public boolean deleteMerchandise(Long id) {
		BusMerchandise merchandise = new BusMerchandise();
		merchandise.setId(id);
		merchandise.setIsdeleted((byte) 0);
		Integer result = merchandiseDao.updateByPrimaryKeySelective(merchandise);
		if(result == 0) {
			return false;
		}
		return true;
	}

	public PageInfo<BusMerchandiseQryOutDto> pageListMerchandise(MerchandiseQueryDto merchandiseQueryDto) {
		BusMerchandiseExample merchandiseExample = new BusMerchandiseExample();
		merchandiseExample.createCriteria().andMerchandisenameLike("" + merchandiseQueryDto + "");
		List<BusMerchandise> merchandiseList =  merchandiseDao.selectByExample(merchandiseExample);
		List<BusMerchandiseQryOutDto> merchandiseQryOutDtoList = this.convert(merchandiseList, BusMerchandiseQryOutDto.class);
		return new PageInfo<BusMerchandiseQryOutDto>(merchandiseQryOutDtoList);
	}

	public boolean updateMerchandise(MerchandiseUpdateDto merchandiseDto) {
		BusMerchandise merchandise = new BusMerchandise();
		BeanUtils.copyProperties(merchandiseDto, merchandise);
		Integer result = merchandiseDao.updateByPrimaryKeySelective(merchandise);
		if(result == 0) {
			return false;
		}
		return true;
	}

}
