package com.rpym.univweb.dao.ext;

import com.rpym.univweb.entity.SysJobs;
import com.rpym.univweb.entity.SysJobsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysJobsExtMapper {

	List<SysJobs> findSysJobs(Map<String, Object> paramMap);

}