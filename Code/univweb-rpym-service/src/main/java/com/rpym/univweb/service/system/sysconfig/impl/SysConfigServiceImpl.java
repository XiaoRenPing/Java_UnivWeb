package com.rpym.univweb.service.system.sysconfig.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysConfigMapper;
import com.rpym.univweb.entity.SysConfig;
import com.rpym.univweb.entity.SysConfigExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.sysconfig.ISysConfigService;

@Service("sysConfigService")
public class SysConfigServiceImpl extends BaseService implements ISysConfigService{

	@Autowired
	SysConfigMapper sysConfigDao;
	
	public SysConfig getWebSiteConfig(HttpServletRequest request) {
		SysConfigExample sysConfigExample = new SysConfigExample();
		List<SysConfig> sysConfigList = sysConfigDao.selectByExample(sysConfigExample);
		if(!CollectionUtils.isEmpty(sysConfigList)) {
			return sysConfigList.get(CommonConst.NUM_0);
		}
		return null;
	}

}
