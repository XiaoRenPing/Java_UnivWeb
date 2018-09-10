package com.rpym.univweb.service.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.javax.el.ExpressionFactory;
import org.activiti.engine.impl.javax.el.ValueExpression;
import org.activiti.engine.impl.juel.ExpressionFactoryImpl;
import org.activiti.engine.impl.juel.SimpleContext;
import org.activiti.engine.task.Task;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rpym.univweb.common.CommonBase;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dto.common.AopStoreDto;
import com.rpym.univweb.dto.common.PageDto;
import com.rpym.univweb.dto.common.SessionUserDto;
import com.rpym.univweb.filter.TokenFilter;

public class BaseService extends CommonBase{
	
	// 日志记录
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
		
	/**
     * 工作流服务
     * Activiti 中每一个不同版本的业务流程的定义都需要使用一些定义文件，
     * 部署文件和支持数据 ( 例如 BPMN2.0 XML 文件，表单定义文件，流程定义图像文件等 )，
     * 这些文件都存储在 Activiti 内建的 Repository 中。Repository Service 提供了对 repository 的存取服务。
     */
    @Autowired
    protected RepositoryService repositoryService;
    
    /**
     * 工作流服务
     * 在 Activiti 中，每当一个流程定义被启动一次之后，都会生成一个相应的流程对象实例。
     * Runtime Service 提供了启动流程、查询流程实例、设置获取流程实例变量等功能。此外它还提供了对流程部署，流程定义和流程实例的存取服务。
     */
    @Autowired
    protected RuntimeService runtimeService;
    
    /**
     * 工作流服务
     * Activiti 中内置了用户以及组管理的功能，
     * 必须使用这些用户和组的信息才能获取到相应的 Task。
     * Identity Service 提供了对 Activiti 系统中的用户和组的管理功能。
     */
    @Autowired
    protected IdentityService identityService;
    
    /**
     * 工作流服务
     * 在 Activiti 中业务流程定义中的每一个执行节点被称为一个 Task，对流程中的数据存取，
     * 状态变更等操作均需要在 Task 中完成。Task Service 提供了对用户 Task 和 Form 相关的操作。
     * 它提供了运行时任务查询、领取、完成、删除以及变量设置等功能。
     */
    @Autowired
    protected TaskService taskService;
    
    /**
     * 工作流服务
     *  History Service 用于获取正在运行或已经完成的流程实例的信息，
     *  与 Runtime Service 中获取的流程信息不同，历史信息包含已经持久化存储的永久信息，并已经被针对查询优化。
     */
    @Autowired
    protected HistoryService historyService;
    
    /**
     * 工作流服务
     * Management Service 提供了对 Activiti 流程引擎的管理和维护功能，
     * 这些功能不在工作流驱动的应用程序中使用，主要用于 Activiti 系统的日常维护。
     */
    @Autowired
    protected ManagementService managementService;
    
    /**
     * 工作流服务 表单服务
     */
    @Autowired
    protected FormService formService;
    
	/**
	 * 集合转换
	 * @param source
	 * @param cls
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> convert(List<?> source, Class<?> cls) {
		List<T> rtnList = new Page<T>();
		BeanUtils.copyProperties(source, rtnList);
		rtnList.clear();
		Object newObj;
		for(Object obj : source) {
			try {
				newObj = cls.newInstance();
				BeanUtils.copyProperties(obj, newObj);
				rtnList.add((T)newObj);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return rtnList;
	}
	
	/**
	 * 分页查询
	 * @param dto
	 */
	public void initPage(PageDto dto) {
		PageHelper.startPage(dto.getPageNum() == NumberUtils.INTEGER_ZERO  ? NumberUtils.INTEGER_ONE : dto.getPageNum(), 
				dto.getPageSize() == NumberUtils.INTEGER_ZERO ? 10 : dto.getPageSize(), true);
	}
	
	
	/**
	 * 脱敏处理
	 * @param str
	 * @return
	 */
	public String changeStr(String str) {
		if (str == null || str.length() <= 0) {
			return null;
		}
		if (str.length() <= 5) {
			String newStr = "";
			for (int i = 0; i < str.length(); i++) {
				newStr += "*";
			}
			return str.replaceAll("[0-9a-zA-Z]{1,5}", newStr);
		} else {
			String newStr = "";
			for (int i = 0; i < 5; i++) {
				newStr += "*";
			}
			String substr = str.substring(1, 5);
			return str.replace(substr, newStr);
		}
	}
	
	/**
	 * like 查询
	 * @param value
	 * @return
	 */
	public String fullLike(String value) {
		return "%" + value + "%";
	}
	
	/**
	 * like 查询
	 * @param value
	 * @return
	 */
	public String leftLike(String value) {
		return "%" + value;
	}
	
	
	/**
	 * like 查询
	 * @param value
	 * @return
	 */
	public String rightLike(String value) {
		return value + "%";
	}
	
	
	
	/**
	 * 获取附件ids
	 * @param attachmentIds
	 * @return
	 */
	public List<String> getAttachmentIdArray(String attachmentIds) {
		String ids[] = attachmentIds.split(",");
		List<String> attachmentIdArray = new ArrayList<String>();
		for(String key : ids) {
			if(StringUtils.isNotBlank(key)) {
				attachmentIdArray.add(key);
			}
		}
		return attachmentIdArray;
	}
	
	
	
	
	
    /** 
     * 根据key和value判断el表达式是否通过信息  
     * @param String key    el表达式key信息  
     * @param String el     el表达式信息  
     * @param String value  el表达式传入值信息  
     * @return 
     */  
    @SuppressWarnings("unchecked")
	public boolean isCondition(String el, Map<String,Object> vars) {
    	el = replace(el);
        ExpressionFactory factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext();
        context.setVariable("context", factory.createValueExpression((Map<String, Object>)vars.get("context"), Map.class));    
        ValueExpression e = factory.createValueExpression(context, el, boolean.class);    
        return (Boolean) e.getValue(context);  
    }
    
    
    /** 
     * 根据key和value判断el表达式是否通过信息  
     * @param String key    el表达式key信息  
     * @param String el     el表达式信息  
     * @param String value  el表达式传入值信息  
     * @return 
     */  
    @SuppressWarnings("unchecked")
	public String getElValue(String el, Map<String,Object> vars) {
    	el = replace(el);
        ExpressionFactory factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext();
        context.setVariable("context", factory.createValueExpression((Map<String, Object>)vars.get("context"), Map.class));    
        ValueExpression e = factory.createValueExpression(context, el, String.class);    
        return (String) e.getValue(context);  
    }
    
    /**
     * 替换el表达式里面的path路径
     * 因为path在审批的时候才能确定，但是在流程获取下一个节点的时候没有确定，所以要忽略该表达式
     * 做法就是直接path条件替换成true
     * ${path == "filling" && 3 > 2} 替换成 ${true && 3 > 2} 
     * @param el
     * @return
     */
    public String replace(String el) {
    	return el.replaceAll("(context.path\\s*=\\s*=\\s*\"\\S+\")", "true");
    }
    
    /**
     * 初始化对象
     */
/*    private void initBiz() {
    	if(webSockectBiz == null) {
    		webSockectBiz = (IWebSocketBiz)SpringContextUtils.getBean("webSockectBiz");
    	}
    }*/
    
	/**
	 * 发送通知消息到客户端
	 * @param taskId
	 */
	/*public void sendMsgToClientAfterComplete(String taskId) {
		initBiz();
		HistoricTaskInstance history = historyService.createHistoricTaskInstanceQuery().taskId(taskId).singleResult();
		if(history != null) {
			webSockectBiz.sendMessage(history.getAssignee(), new WebSocketMsgTransferDto(WebSocketConst.EVENT_REFRESH_HISTORYS, null, null));
		}
		
		List<Task> taskList = taskService.createTaskQuery().processInstanceId(history.getProcessInstanceId()).list();
		
		for(Task  task : taskList) {
			webSockectBiz.sendMessage(task.getAssignee(), new WebSocketMsgTransferDto(WebSocketConst.EVENT_REFRESH_TASK, null, null));
		}
		
	}*/
	
	/**
	 * 发送通知消息到客户端
	 * @param processInstanceId
	 */
	/*public void sendMsgToClientByProcessInstanceId(String processInstanceId) {
		initBiz();
		List<Task> taskList = taskService.createTaskQuery().processInstanceId(processInstanceId).list();
		
		for(Task  task : taskList) {
			webSockectBiz.sendMessage(task.getAssignee(), new WebSocketMsgTransferDto(WebSocketConst.EVENT_REFRESH_TASK, null, null));
		}
		
	}*/
	
	/**
	 * 发送通知消息到客户端
	 * @param processInstanceId
	 */
	/*public void sendMsgToAllClientByTaskId(String taskId) {
		initBiz();
		HistoricTaskInstance history = historyService.createHistoricTaskInstanceQuery().taskId(taskId).singleResult();
		
		List<HistoricTaskInstance> histories = historyService.createHistoricTaskInstanceQuery().processInstanceId(history.getProcessInstanceId()).list();
		
		for(HistoricTaskInstance task : histories) {
			if(StringUtils.isNotBlank(task.getAssignee())) {
				webSockectBiz.sendMessage(task.getAssignee(), new WebSocketMsgTransferDto(WebSocketConst.EVENT_REFRESH_TASK, null, null));
			}
		}
	}
	*/
	
	
	/**
	 * 判断是否有待办事项
	 * @Title: isHavingTask   
	 * @Description:  
	 * @param: @param businessKey
	 * @param: @param processDefinitionKey
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	protected boolean isHavingUncompleteTask(String businessKey, String processDefinitionKey) {
		Task task = taskService.createTaskQuery().processInstanceBusinessKey(String.valueOf(businessKey)).processDefinitionKeyLike(processDefinitionKey).singleResult();
		if(task != null){
			return true;
		}
		return false;
	}
	
	
	public String getSessionUserName() {
		return "";
	}
	
	
	public SessionUserDto getSessionUser() {
		AopStoreDto aopStoreDto = TokenFilter.getAopStore();
		if(aopStoreDto != null) {
			String token = aopStoreDto.getToken();
			SessionUserDto sessionUserDto = (SessionUserDto) aopStoreDto.getRedisCacheManager().get(addPrefixToken(token));
			return sessionUserDto;
		}
		return new SessionUserDto();
	}
	
	
	/**
	 * 添加前缀
	 * @param token
	 * @return
	 */
	public static String addPrefixUser(Long userId) {
		String userKey = CommonConst.USER + CommonConst.UNDER_LINE + userId;
		return userKey;
	}
	
	
	/**
	 * 添加前缀
	 * @param token
	 * @return
	 */
	public static String addPrefixToken(String token) {
		String tokey = StringUtils.join(CommonConst.TOKEN , CommonConst.UNDER_LINE , token);
		return tokey;
	}
	
	/**
	 * 添加前缀
	 * @param token
	 * @return
	 */
	public static String addPrefixDeleteToken(String token) {
		String tokey = StringUtils.join(CommonConst.DELETE , CommonConst.UNDER_LINE ,  CommonConst.TOKEN , CommonConst.UNDER_LINE, token);
		return tokey;
	}
}
