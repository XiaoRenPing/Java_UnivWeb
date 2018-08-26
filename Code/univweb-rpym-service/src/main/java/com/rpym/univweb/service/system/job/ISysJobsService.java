package com.rpym.univweb.service.system.job;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.utils.ResponseResult;

public interface ISysJobsService {

	public Integer deleteSysJobs(Long id);

	public Integer updateSysJobsInfo(SysJobsDto sysJobsDto);

	public SysJobs getSysJobsById(Long id);

	public PageInfo<SysJobs> findSysJobsInfoPage(SysJobsQueryDto sysJobsQueryDto);

	public Integer saveSysJobs(SysJobsDto sysJobsDto);

	public Integer startSysJob(String ids);

	public Integer stopJobs(String ids);

	public ResponseResult startSingleSysJob(Long id);
}
