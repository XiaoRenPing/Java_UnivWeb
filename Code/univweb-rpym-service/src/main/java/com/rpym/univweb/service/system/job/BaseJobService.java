package com.rpym.univweb.service.system.job;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.utils.QuartzManager;

@Service
public class BaseJobService {
	
	@Autowired
	ISysJobsService sysJobsService;

	/**
	 * 启动需要运行的JOB
	 */
	@PostConstruct
	public void init() {
		System.out.println("开始启动需要运行的Job...");
		SysJobsQueryDto dto = new SysJobsQueryDto();
		PageInfo<SysJobs> jobs = sysJobsService.findSysJobsInfoPage(dto);
		for(SysJobs job : jobs.getList()) {
			if(job.getIsabandoned() == false) {
				System.out.println(job.toString());
				try {
					QuartzManager.addJob(job.getJobname(), CommonConst.JOB_GROUP_NAME, job.getJobname(), CommonConst.TRIGGER_GROUP_NAME, Class.forName(job.getJobclass()), job.getJobcron());
					System.out.println("任务：" + job.getJobname() + ",已启动");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("启动完成！");
	}
}