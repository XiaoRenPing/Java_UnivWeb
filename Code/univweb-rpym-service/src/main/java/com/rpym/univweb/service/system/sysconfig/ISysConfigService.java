package com.rpym.univweb.service.system.sysconfig;

import javax.servlet.http.HttpServletRequest;

import com.rpym.univweb.entity.SysConfig;

public interface ISysConfigService {

	SysConfig getWebSiteConfig(HttpServletRequest request);
	
}
