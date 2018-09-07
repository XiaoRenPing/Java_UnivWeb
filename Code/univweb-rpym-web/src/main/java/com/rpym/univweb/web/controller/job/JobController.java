package com.rpym.univweb.web.controller.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.service.system.job.ISysJobsService;
import com.rpym.univweb.utils.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("定时任务接口")
@Controller
@RequestMapping("/jobs/*")
public class JobController {

	@Autowired
	ISysJobsService jobsService;
	
	@ApiOperation(value="跳转到添加定时任务界面",httpMethod="GET")
	@RequestMapping(method=RequestMethod.GET, value="/toadd")
	public String toAddJob() {
		return "system/jobs/addJob";
	}
	
/*	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public String toEditJob() {
		return "system/jobs/editJob";
	}
*/	
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String pageListJob() {
		return "system/jobs/jobList";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toview")
	public ModelAndView toViewJob(@RequestParam("id") Long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("system/jobs/viewJob");
		mv.addObject("job", jobsService.getSysJobsById(id));
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/toedit")
	public ModelAndView toEditJob(@RequestParam("id") Long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("system/jobs/editJob");
		mv.addObject("job", jobsService.getSysJobsById(id));
		return mv;
	}
	
	//------------------------------- 瀹氭椂鍣ㄧ鐞� -------------------------------------
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
	public Boolean editJob(SysJobsDto sysJobsDto) { //@ModelAttribute
		return jobsService.updateSysJobsInfo(sysJobsDto);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	@ResponseBody
	public Integer deleteJob(@RequestParam("id") Long id) {
		return jobsService.deleteSysJobs(id);
	}
	
	// -------------------------- 鍚姩/鍋滄     -----------------------------
	/**
	 * 鍚姩浠诲姟
	 * @param ids id瀛楃涓叉暟缁�
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/start")
	@ResponseBody
	public ResponseResult startJob(@RequestParam("id") Long id) {
		return jobsService.startSingleSysJob(id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET, value="/batchstart")
	@ResponseBody
	public Integer startJobs(@RequestParam("ids") String ids) {
		return jobsService.startSysJob(ids);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/stop")
	@ResponseBody
	public ResponseResult stopJob(@RequestParam("id") Long id) {
		return jobsService.stopSingleSysJob(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/batchstop")
	@ResponseBody
	public Integer stopJobs(@RequestParam("ids") String ids) {
		return jobsService.stopJobs(ids);
	}
}
