package com.rpym.univweb.service.system.job;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;

public interface ISysJobsService {

	public Integer deleteSysJobs(Long id);

	public Integer updateSysJobsInfo(SysJobsDto sysJobsDto);

	public SysJobs getSysJobsById(Long id);

	public PageInfo<SysJobs> findSysJobsInfoPage(SysJobsQueryDto sysJobsQueryDto);

	public Integer saveSysJobs(SysJobsDto sysJobsDto);

	
}
