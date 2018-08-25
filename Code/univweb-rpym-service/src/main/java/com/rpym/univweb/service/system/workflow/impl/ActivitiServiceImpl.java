package com.rpym.univweb.service.system.workflow.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.ManagementService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricTaskInstanceQuery;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.NativeTaskQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.activiti.image.impl.DefaultProcessDiagramGenerator;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.FileCopyUtils;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysUsersMapper;
import com.rpym.univweb.dto.workflow.HanderTaskInDto;
import com.rpym.univweb.dto.workflow.HistoryTaskListQryInDto;
import com.rpym.univweb.dto.workflow.PathOutDto;
import com.rpym.univweb.dto.workflow.TaskListQryInDto;
import com.rpym.univweb.dto.workflow.TaskListQryOutDto;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.workflow.IActivitiService;
import com.rpym.univweb.utils.JumpCmd;
import com.rpym.univweb.utils.RandomUtil;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.utils.UWException;

@Service("activitiService")
public class ActivitiServiceImpl extends BaseService implements IActivitiService{
	
	@Autowired
	private SysUsersMapper userDao;
	
	@Autowired
	ManagementService managementService;
	
	/**
	 * 查询我的待办
	 * 	查询运行任务表：act_ru_task
	 * 	查询条件：assignee  审批人
	 */
	public PageInfo<TaskListQryOutDto> queryTaskList(TaskListQryInDto dto, HttpServletRequest request) {
		SysUsers user = (SysUsers) request.getSession().getAttribute("sessionUser");		
		//String name = user.getUsername();
		// 任务查询对象，操作的是任务表(act_ru_task)
        TaskQuery query = taskService.createTaskQuery();
        // 根据任务的办理人过滤
        query.taskAssignee("xrp").orderByTaskCreateTime().desc();
        long total = query.count();
        
        int firstResult = dto.getPageNum() > NumberUtils.INTEGER_ZERO ? (dto.getPageNum() - 1) : NumberUtils.INTEGER_ZERO;
        int pageSize = dto.getPageSize() == NumberUtils.INTEGER_ZERO ? 10 : dto.getPageSize();
        
        List<Task> list = query.listPage(firstResult * pageSize , pageSize);
        ProcessDefinitionEntity processDefinitionEntity = null;
        
        List<TaskListQryOutDto> listRtn = convert(list, TaskListQryOutDto.class);
        
        for(TaskListQryOutDto task : listRtn) {
        	
        	processDefinitionEntity = (ProcessDefinitionEntity)((RepositoryServiceImpl)repositoryService).getDeployedProcessDefinition(task.getProcessDefinitionId());
        	
        	task.setFlowName(processDefinitionEntity.getName());
        	
        	Map<String,Object> vars = taskService.getVariables(task.getId());
        	
        	// 切换
        	if(vars.size() > 0 && vars.containsKey("context")) {
        		Map<String,Object> param = (Map<String,Object>)vars.get("context");
        		if(param.size() > 0 && param.containsKey("id")) {
        			task.setDataId(param.get("id").toString());
        		}
        	}
        	
        	HistoricProcessInstance history = historyService.createHistoricProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).orderByProcessInstanceStartTime().asc().singleResult();
        	if(history != null) {
        		task.setCreateUser(history.getStartUserId());
        	}
        }
        PageInfo<TaskListQryOutDto> page = new PageInfo<TaskListQryOutDto>(listRtn);
        page.setTotal(total);
        long pages =  total%pageSize == 0 ? (total/pageSize) : (total/pageSize + 1);
        page.setPages((int)pages);
        page.setPageSize(pageSize);
        page.setSize(pageSize);
        page.setPageNum(dto.getPageNum() == NumberUtils.INTEGER_ZERO ? NumberUtils.INTEGER_ONE : dto.getPageNum() );
		return page;
	}

	/**
	 *  获取我的申请记录
	 */
	public PageInfo<TaskListQryOutDto> queryTaskApplyList(TaskListQryInDto dto, HttpServletRequest request) {
		SysUsers user = (SysUsers) request.getSession().getAttribute("sessionUser");//this.getSessionUserName();肖仁枰
		String name = user.getName();
		
		// 任务查询对象，操作的是任务表(act_ru_task)
		String sql = "select * from "+ managementService.getTableName(Task.class) + " t where t.OWNER_=#{creator}";
        NativeTaskQuery query = taskService.createNativeTaskQuery().sql(sql).parameter("creator", name);
        // 根据任务的办理人过滤
        //query.orderByTaskCreateTime().desc();
        long total = query.count();
        
        int firstResult = dto.getPageNum() > NumberUtils.INTEGER_ZERO ? (dto.getPageNum() - 1) : NumberUtils.INTEGER_ZERO;
        int pageSize = dto.getPageSize() == NumberUtils.INTEGER_ZERO ? 10 : dto.getPageSize();
        
        List<Task> list = query.listPage(firstResult * pageSize , pageSize);
        ProcessDefinitionEntity processDefinitionEntity = null;
        
        List<TaskListQryOutDto> listRtn = convert(list, TaskListQryOutDto.class);
        
        for(TaskListQryOutDto task : listRtn) {
        	
        	processDefinitionEntity = (ProcessDefinitionEntity)((RepositoryServiceImpl)repositoryService).getDeployedProcessDefinition(task.getProcessDefinitionId());
        	
        	task.setFlowName(processDefinitionEntity.getName());
        	
        	Map<String,Object> vars = taskService.getVariables(task.getId());
        	
        	// 切换
        	if(vars.size() > 0 && vars.containsKey("context")) {
        		Map<String,Object> param = (Map<String,Object>)vars.get("context");
        		if(param.size() > 0 && param.containsKey("id")) {
        			task.setDataId(param.get("id").toString());
        		}
        	}
        	
        	HistoricProcessInstance histiry = historyService.createHistoricProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).orderByProcessInstanceStartTime().asc().singleResult();
        	if(histiry != null) {
        		task.setCreateUser(histiry.getStartUserId());
        	}
        }
        PageInfo<TaskListQryOutDto> page = new PageInfo<TaskListQryOutDto>(listRtn);
        page.setTotal(total);
        long pages =  total%pageSize == 0 ? (total/pageSize) : (total/pageSize + 1);
        page.setPages((int)pages);
        page.setPageSize(pageSize);
        page.setSize(pageSize);
        page.setPageNum(dto.getPageNum() == NumberUtils.INTEGER_ZERO ? NumberUtils.INTEGER_ONE : dto.getPageNum() );
		return page;
	}
	
	
	
	/**
	 *  完成流程任务
	 *     查询表：任务表(act_ru_task)
	 *     查询条件：审批人 assignee  + taskid任务id
	 */
	public ResponseResult complete(HanderTaskInDto dto, HttpServletRequest request) {
		
		SysUsers user = (SysUsers) request.getSession().getAttribute("sessionUser");//this.getSessionUserName();
		String assignee = user.getUsername();
		
		// 任务查询对象，操作的是任务表(act_ru_task)
        TaskQuery query = taskService.createTaskQuery();

        // 根据任务的办理人过滤
        query.taskAssignee(assignee); // 只查询张三的任务，其他人的任务不查
        query.taskId(dto.getTaskId());
        Task task = query.singleResult();
        
        if(task == null) {
        	throw new UWException("未找到代办ID:" + dto.getTaskId());
        }
        
        String processInstanceId = task.getProcessInstanceId();
        
        // 添加批注（审批意见）
        taskService.addComment(dto.getTaskId(), processInstanceId, dto.getMessage());
        
        //Map<String, Object> param = new HashMap<String, Object>();
        Map<String, Object> param = taskService.getVariables(dto.getTaskId());
        Map<String, Object> context = (Map<String, Object>)param.get("context");
        context.put("path", dto.getPath());
        if(StringUtils.isNotBlank(dto.getFormdata())) {
        	context.put("formdata", dto.getFormdata());
        }
        
        // 设置本次处理结果-流程路径变量
        taskService.setVariables(dto.getTaskId(), param);
        
		taskService.complete(dto.getTaskId());
		
		// 重新查询流程实例流转下一个环节的代办人
		query = taskService.createTaskQuery();
		List<Task> taskList = query.processInstanceId(processInstanceId).list();
		if(CollectionUtils.isEmpty(taskList)) {
			System.out.println("未获取到下一环节，可能流程已经结束!");
		} else {
			for(Task t : taskList ) {
				System.out.println("下一环节名称:" + t.getName() + ", 处理人：" + t.getAssignee());
			}
		}
		
		ResponseResult result = new ResponseResult();
		result.setStatus(200);
		result.setData(true);;
		return result;
	}

	/**
	 * 
	 * 	查询历史审批记录
	 * 		查询条件：审批人
	 */
	public PageInfo<TaskListQryOutDto> queryHistoryTaskList(HistoryTaskListQryInDto dto, HttpServletRequest request) {
		SysUsers user = (SysUsers) request.getSession().getAttribute("sessionUser");
		String assignee = user.getUsername();//this.getSessionUserName();

		HistoricTaskInstanceQuery query = historyService.createHistoricTaskInstanceQuery();
		query.taskAssignee(assignee);
		query.finished().orderByTaskCreateTime().desc();
		
        long total = query.count();
        
        int firstResult = dto.getPageNum() > NumberUtils.INTEGER_ZERO ? (dto.getPageNum() - 1) : NumberUtils.INTEGER_ZERO;
        int pageSize = dto.getPageSize() == NumberUtils.INTEGER_ZERO ? 10 : dto.getPageSize();

        List<HistoricTaskInstance> list = query.listPage(firstResult * pageSize , pageSize);
        ProcessDefinitionEntity processDefinitionEntity = null;
        
        List<TaskListQryOutDto> listRtn = convert(list, TaskListQryOutDto.class);
        
        TaskQuery nextQuery;
        List<Task> taskList;
        List<String> nextNodes = new ArrayList<String>();
        List<String> nextAssignee = new ArrayList<String>();
        
        for(TaskListQryOutDto task : listRtn) {
        	
        	processDefinitionEntity = (ProcessDefinitionEntity)((RepositoryServiceImpl)repositoryService).getDeployedProcessDefinition(task.getProcessDefinitionId());
        	
        	task.setFlowName(processDefinitionEntity.getName());
        	
        	// 防止测试数据对应关系不对，使用异常捕获，但是方法本身可以继续执行
        	try {
        		
        		HistoricVariableInstance historicVariableInstance = historyService.createHistoricVariableInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult();
        		
				Map<String,Object> vars = (Map<String,Object>)historicVariableInstance.getValue();
				
				// 切换
				if(vars.size() > 0 && vars.containsKey("context")) {
					Map<String,Object> param = (Map<String,Object>)vars.get("context");
					if(param.size() > 0 && param.containsKey("id")) {
						task.setDataId(param.get("id").toString());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
        	
        	HistoricProcessInstance histiry = historyService.createHistoricProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).orderByProcessInstanceStartTime().asc().singleResult();
        	if(histiry != null) {
        		task.setCreateUser(histiry.getStartUserId());
        	}
        	
        	// 获取审批意见
        	List<Comment> comments = taskService.getTaskComments(task.getId());
        	List<String> messsags = new ArrayList<String>();
        	for(Comment comment : comments) {
        		messsags.add(comment.getFullMessage());
        	}
        	task.setComment(messsags);
        	
        	// 获取下一节点处理人
        	nextQuery = taskService.createTaskQuery();
    		taskList = nextQuery.processInstanceId(task.getProcessInstanceId()).list();
    		if(!CollectionUtils.isEmpty(taskList)) {
    			nextNodes.clear();
            	nextAssignee.clear();
    			for(Task t : taskList ) {
    				nextNodes.add(t.getName());
    				nextAssignee.add(t.getAssignee());
    			}
    			task.setNextNodeName(StringUtils.join(nextNodes, CommonConst.SPLIT));
    			task.setNextAssignee(StringUtils.join(nextAssignee, CommonConst.SPLIT));
    		} else {
    			task.setNextNodeName("流程结束");
    		}
        }
        PageInfo<TaskListQryOutDto> page = new PageInfo<TaskListQryOutDto>(listRtn);
        page.setTotal(total);
        long pages =  total%pageSize == 0 ? (total/pageSize) : (total/pageSize + 1);
        page.setPages((int)pages);
        page.setPageSize(pageSize);
        page.setSize(pageSize);
        page.setPageNum(dto.getPageNum() == NumberUtils.INTEGER_ZERO ? NumberUtils.INTEGER_ONE : dto.getPageNum() );
		return page;
	}

	
	public List<PathOutDto> toHanderTask(String taskId) {
		
		ProcessDefinitionEntity processDefinitionEntity = null;  

        String id = null;  

        //获取流程实例Id信息   
        String processInstanceId = taskService.createTaskQuery().taskId(taskId).singleResult().getProcessInstanceId();  

        //获取流程发布Id信息   
        String definitionId = runtimeService.createProcessInstanceQuery().processInstanceId(processInstanceId).singleResult().getProcessDefinitionId();  

        processDefinitionEntity = (ProcessDefinitionEntity) ((RepositoryServiceImpl) repositoryService).getDeployedProcessDefinition(definitionId);  
        
        ExecutionEntity execution = (ExecutionEntity) runtimeService.createProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();  

        //当前流程节点Id信息   
        String activitiId = execution.getActivityId();    

        //获取流程所有节点信息   
        List<ActivityImpl> activitiList = processDefinitionEntity.getActivities();
        
        Map<String,Object> vars = taskService.getVariables(taskId);
        
        //遍历所有节点信息   
        for(ActivityImpl activityImpl : activitiList){      
            id = activityImpl.getId();     
            if (activitiId.equals(id)) {
                //获取下一个节点信息   
                return nextTaskDefinition(activityImpl, activityImpl.getId(), processInstanceId, vars); 
            }
        }  
        return null; 
	}

	/**
	 * 	获取流程进程图片
	 */
	public void queryImage(String processInstanceId, HttpServletResponse response) {
		
		String processDefinitionId = historyService.createHistoricProcessInstanceQuery().processInstanceId(processInstanceId).singleResult().getProcessDefinitionId();
    	
    	BpmnModel model = repositoryService.getBpmnModel(processDefinitionId);

        //得到流程执行对象
        List<HistoricActivityInstance> historyList = historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstanceId).list();
        
        //得到执行过的Activity的Id
        List<String> activityIds = new ArrayList<String>();
        for (HistoricActivityInstance history : historyList) {
            activityIds.add(history.getActivityId());
        }
        
        String imageType = "png";
        
        InputStream in = new DefaultProcessDiagramGenerator().generateDiagram(
        		model, 
        		imageType, 
    			activityIds, 
    			new ArrayList<String>(), 
    			"宋体", 
    			"宋体", 
    			null,
    			null,
    			1.0);
        try {
        	
        	String fileName = StringUtils.join(RandomUtil.getVarNum(), CommonConst.POINT , imageType);
        	response.setCharacterEncoding(CommonConst.CHARSET_UTF8);
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment;fileName=" + new String(fileName.getBytes("gbk"),"iso-8859-1"));
			
			OutputStream out = response.getOutputStream();
			
			FileCopyUtils.copy(in, out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Map<String, Object> queryFormDataInTask(String taskId) {
		 Map<String, Object> processFromData = taskService.getVariables(taskId);
		 if(processFromData != null) {
			 return processFromData;
		}
		return null;
	}

	
	/**
	 * 任务回滚操作
	 */
	public String taskRollback(String taskId) {
		//根据要跳转的任务ID获取其任务
	    HistoricTaskInstance hisTask = historyService.createHistoricTaskInstanceQuery().taskId(taskId).singleResult();
	    //进而获取流程实例
	    ProcessInstance instance = runtimeService.createProcessInstanceQuery().processInstanceId(hisTask.getProcessInstanceId()).singleResult();
	    //取得流程定义
	    ProcessDefinitionEntity definition = (ProcessDefinitionEntity) repositoryService.getProcessDefinition(hisTask.getProcessDefinitionId());
	    //获取历史任务的Activity
	    ActivityImpl hisActivity = definition.findActivity(hisTask.getTaskDefinitionKey());
	    //实现跳转
	    ExecutionEntity executionEntity = managementService.executeCommand(new JumpCmd(instance.getId(), hisActivity.getId()));
	    
	    return executionEntity.getTasks().get(0).getId();
	}

	
	//-------------------- 工具方法  -----------------------
	/**  
     * 下一个任务节点信息,  
     * 如果下一个节点为用户任务则直接返回,  
     * 如果下一个节点为排他网关, 获取排他网关Id信息, 根据排他网关Id信息和execution获取流程实例排他网关Id为key的变量值,  
     * 根据变量值分别执行排他网关后线路中的el表达式, 并找到el表达式通过的线路后的用户任务
     * @param ActivityImpl activityImpl     流程节点信息  
     * @param String activityId             当前流程节点Id信息  
     * @param String elString               排他网关顺序流线段判断条件
     * @param String processInstanceId      流程实例Id信息  
     * @return  
     */    
    private List<PathOutDto> nextTaskDefinition(ActivityImpl activityImpl, String activityId, String processInstanceId, Map<String,Object> vars) {

    	List<PathOutDto> paths = new ArrayList<PathOutDto>();
    	// 获取节点所有流向线路信息
        List<PvmTransition> outTransitions1 = activityImpl.getOutgoingTransitions();
        for (PvmTransition tr : outTransitions1) {
        	PvmActivity pvmActivity = tr.getDestination();
        	String type = pvmActivity.getProperty("type").toString();
        	if("exclusiveGateway".equals(type) || "parallelGateway".equals(type)) {
        		List<PathOutDto> pathOutDtoList =  nextTaskDefinition((ActivityImpl)tr.getDestination(), activityId, processInstanceId, vars);
        		
        		// 如果是并行网关，保留一个路径返回，不需要分支
        		if(pathOutDtoList.size() > CommonConst.NUM_1 && "parallelGateway".equals(type)) {
        			PathOutDto dto = new PathOutDto();
        			dto.setPath(pathOutDtoList.get(CommonConst.NUM_0).getPath());
        			List<String> outPaths = new ArrayList<String>();
        			for(int i = 0;  i< pathOutDtoList.size() ; i++) {
        				outPaths.add(pathOutDtoList.get(i).getName());
        			}
        			dto.setName(StringUtils.join("会签环节(", StringUtils.join(outPaths, CommonConst.SPLIT), ")"));
        			paths.add(dto); 
        		} else {
        			paths.addAll(pathOutDtoList);
        		}
        		
        	} else {
        		
        		String id = tr.getDestination().getId();
        		String name = tr.getDestination().getProperty("name").toString();
        		Object conditionTextObj = tr.getProperty("conditionText");
        		Object lineNameObj = tr.getProperty("name");
        		String lineName = lineNameObj == null ? null : lineNameObj.toString();
        		if(conditionTextObj == null) {
        			PathOutDto dto = new PathOutDto();
        			dto.setPath(id);
        			dto.setName(lineName == null ? name : ("(" + lineName + ")" + name));
        			paths.add(dto); 
        		} else {
        			String conditionText = conditionTextObj.toString(); // 获取排他网关线路判断条件信息
        			// 判断el表达式是否成立
        			if (isCondition(StringUtils.trim(conditionText.toString()), vars)) {
        				PathOutDto dto = new PathOutDto();
        				dto.setPath(id);
        				dto.setName(lineName == null ? name : ("(" + lineName + ")" + name));
        				paths.add(dto); 
        			}
        		}
        		
        	}
        }
        return paths;
    }


}
