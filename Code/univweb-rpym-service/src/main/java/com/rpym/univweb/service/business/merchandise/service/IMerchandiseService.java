package com.rpym.univweb.service.business.merchandise.service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.business.merchandise.BusMerchandiseOutDto;
import com.rpym.univweb.dto.business.merchandise.BusMerchandiseQryOutDto;
import com.rpym.univweb.dto.merchandise.MerchandiseAddDto;
import com.rpym.univweb.dto.merchandise.MerchandiseQueryDto;
import com.rpym.univweb.dto.merchandise.MerchandiseUpdateDto;

public interface IMerchandiseService {

	boolean addMerchandise(MerchandiseAddDto merchandiseDto);

	BusMerchandiseOutDto findMerchandiseById(Long id);

	boolean deleteMerchandise(Long id);

	PageInfo<BusMerchandiseQryOutDto> pageListMerchandise(MerchandiseQueryDto merchandiseQueryDto);

	boolean updateMerchandise(MerchandiseUpdateDto merchandiseDto);

}
