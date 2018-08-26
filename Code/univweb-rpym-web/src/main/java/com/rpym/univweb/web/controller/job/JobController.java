package com.rpym.univweb.web.controller.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.service.system.job.ISysJobsService;

@Controller
@RequestMapping("/jobs/*")
public class JobController {

	@Autowired
	ISysJobsService jobsService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddJob() {
		return "system/jobs/addJob";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditJob() {
		return "system/jobs/editJob";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListJob() {
		return "system/jobs/jobList";
	}
	
	//------------------------------- 定时器管理 -------------------------------------
	
	@RequestMapping(method=RequestMethod.GET, value="/list")
	@ResponseBody
	public PageInfo<SysJobs> listJob(SysJobsQueryDto jobQueryDto) {
		return jobsService.findSysJobsInfoPage(jobQueryDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public Integer addJob(SysJobsDto sysJobDto) {
		return jobsService.saveSysJobs(sysJobDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/edit")
	@ResponseBody
	public Integer editJob(SysJobsDto sysJobsDto) {
		return jobsService.updateSysJobsInfo(sysJobsDto);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public Integer deleteJob(@RequestParam("id") Long id) {
		return jobsService.deleteSysJobs(id);
	}
	
	// -------------------------- 启动/停止     -----------------------------
	/**
	 * 启动任务
	 * @param ids id字符串数组
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/start")
	@ResponseBody
	public Integer startJob(@RequestParam("ids") String ids) {
		return jobsService.startSysJob(ids);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/stop")
	@ResponseBody
	public Integer stopJob(@RequestParam("ids") String ids) {
		return jobsService.stopJob(ids);
	}
}
