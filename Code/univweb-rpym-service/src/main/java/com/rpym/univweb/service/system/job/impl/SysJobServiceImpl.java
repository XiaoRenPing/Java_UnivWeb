package com.rpym.univweb.service.system.job.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysJobsMapper;
import com.rpym.univweb.dto.job.SysJobsDto;
import com.rpym.univweb.dto.job.SysJobsQueryDto;
import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.entity.SysJobsExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.job.ISysJobsService;
import com.rpym.univweb.utils.QuartzManager;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.utils.UWException;

@Service("sysJobsService")
public class SysJobServiceImpl extends BaseService implements ISysJobsService{

	@Autowired
	SysJobsMapper sysJobsDao;
	
	/**
	 * 删除
	 * @param id
	 * @return   
	 */
	public Integer deleteSysJobs(Long id) {
		SysJobs sysJobs = new SysJobs();
		sysJobs.setId(id);
		sysJobs.setIsabandoned(Boolean.valueOf(true));
		return sysJobsDao.updateByPrimaryKeySelective(sysJobs);
	}

	/**
	 * 修改
	 * @param id
	 * @return   
	 */
	public Integer updateSysJobsInfo(SysJobsDto sysJobsDto) {
		if(sysJobsDto == null || sysJobsDto.getId() == null) {
			throw new UWException("参数id不能为空");
		}
		SysJobs sysJobs = new SysJobs();
		BeanUtils.copyProperties(sysJobsDto, sysJobs);
		return sysJobsDao.updateByPrimaryKeySelective(sysJobs);
	}

	
	/**
	 * 根据id查询显示详情
	 * @param id
	 * @return   
	 */
	public SysJobs getSysJobsById(Long id) {
		return sysJobsDao.selectByPrimaryKey(id);
	}

	/**
	 * 分页列表显示任务信息
	 * @param id
	 * @return   
	 */
	public PageInfo<SysJobs> findSysJobsInfoPage(SysJobsQueryDto sysJobsQueryDto) {
		SysJobsExample example = new SysJobsExample();
		SysJobsExample.Criteria criteria = example.createCriteria();
		if(sysJobsQueryDto.getJobname() != null) {
			criteria.andJobnameLike(sysJobsQueryDto.getJobname());
		}
		if(sysJobsQueryDto.getJobclass() != null) {
			criteria.andJobclassEqualTo(sysJobsQueryDto.getJobclass());
		}
		//this.initPage(sysJobsQueryDto);
		List<SysJobs> list = sysJobsDao.selectByExample(example);
		return new PageInfo<SysJobs>(list);
	}

	
	/**
	 * 保存
	 * @param id
	 * @return   
	 */
	public Integer saveSysJobs(SysJobsDto sysJobsDto) {
		SysJobsExample example = new SysJobsExample();
		Integer count = null;
		if(sysJobsDto.getJobclass() != null) {
			example.createCriteria().andJobclassEqualTo(sysJobsDto.getJobclass());
			count = sysJobsDao.countByExample(example);
		}
		if((count != null) && (count >= CommonConst.NUM_1)) {
			throw new UWException("定时任务:" + sysJobsDto.getJobclass() +  "已存在,忽略!");
		}
		SysJobs sysJobsWithBlobs = new SysJobs();
		BeanUtils.copyProperties(sysJobsDto, sysJobsWithBlobs);
		sysJobsWithBlobs.setCreationtime(new Date());
		return sysJobsDao.insertSelective(sysJobsWithBlobs);
	}

	/**
	 * 启动
	 */
	public ResponseResult startSingleSysJob(Long id) {
		SysJobs job = sysJobsDao.selectByPrimaryKey(id);
		if(job != null) {
			QuartzManager.addJob(job.getJobname(),  QuartzManager.JOB_GROUP_NAME, "univweb_"+job.getJobname(), QuartzManager.TRIGGER_GROUP_NAME, job.getClass(), job.getJobcron());
		}
		return ResponseResult.ok();
	}
	
	public ResponseResult stopSingleSysJob(Long id) {
		SysJobs job = sysJobsDao.selectByPrimaryKey(id);
		if(job != null) {
			QuartzManager.pauseJob(job.getJobname(), QuartzManager.JOB_GROUP_NAME, "univweb_"+job.getJobname(), QuartzManager.TRIGGER_GROUP_NAME);
		}
		return ResponseResult.ok();
	}

	
	public Integer stopJobs(String ids) {
		return null;
	}

	public Integer startSysJob(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
