package com.rpym.univweb.web.controller.workflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.workflow.HanderTaskInDto;
import com.rpym.univweb.dto.workflow.HistoryTaskListQryInDto;
import com.rpym.univweb.dto.workflow.PathOutDto;
import com.rpym.univweb.dto.workflow.TaskListQryInDto;
import com.rpym.univweb.dto.workflow.TaskListQryOutDto;
import com.rpym.univweb.service.system.workflow.IActivitiService;
import com.rpym.univweb.utils.Response;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.web.controller.base.BaseController;

@Controller
@RequestMapping("/workflow/*")
public class ActivitiController extends BaseController{

	@Autowired
	IActivitiService activitiService;
	
	//------------------------- 视图层跳转    -----------------------------
	/**
	 * 审批代办
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/mytasklist")
	public String myTaskList() {
		return "/view/workflow/taskList";
	}
	
	/**
	 * 审批申请
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/workflowlist")
	public String workflowList() {
		return "/view/workflow/workflowList";
	}
	
	/**
	 * 我的申请
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/myapply")
	public String myApplyTaskList() {
		return "/view/workflow/myApply";
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String taskIndex() {
		return "/view/workflow/index";
	}
	
	/**
	 * 立即审批
	 * @param taskId
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(method=RequestMethod.GET, value="/todealwith")
	public ModelAndView toDealwithApply(@RequestParam("taskId") String taskId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/view/workflow/dealwithapply");
		mv.addObject("taskId", taskId);
		return mv;
	}
	
	/**
	 * 审批记录
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(method=RequestMethod.GET, value="/findmyhistorytask")
	public String myHistoryTask(){
		return "/view/workflow/myhistorytask";
	}
	
	
	
	//------------------------- 业务调用  -----------------------------
	/**
	 * 查询我的待办
	 * @param dto
	 * @param request
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/tasklist")
	@ResponseBody
	public PageInfo<TaskListQryOutDto> myTodoList(@ModelAttribute TaskListQryInDto dto, HttpServletRequest request) {
		return activitiService.queryTaskList(dto, request);
	}
	
	/**
	 * 查询我申请的流程
	 * @param dto
	 * @param request
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/findmyappylist")
	@ResponseBody
	public PageInfo<TaskListQryOutDto> myApplyTaskList(@ModelAttribute TaskListQryInDto dto, HttpServletRequest request) {
		return activitiService.queryTaskApplyList(dto, request);
	}
	

	@RequestMapping(method=RequestMethod.GET, value="/myhistorytask")
	@ResponseBody
	public PageInfo<TaskListQryOutDto> findMyHistoryTaskList(@ModelAttribute HistoryTaskListQryInDto dto, HttpServletRequest request) {
		return activitiService.queryHistoryTaskList(dto, request);
	}
	
	
	/**
	 * 获取审批路径
	 * @param taskId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/applyrest")
	@ResponseBody
    public List<PathOutDto> findTaskPath(@RequestParam("taskId") String taskId){
    	return activitiService.toHanderTask(taskId);
    }
	
	
	/**
	 * 审批人处理待办
	 * @param taskId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/taskpath")
	@ResponseBody
    public List<PathOutDto> dealwithApplyInfo(@RequestParam("taskId") String taskId){
    	return activitiService.toHanderTask(taskId);
    }
	
	/**
	 * 获取任务中的dto表单数据
	 * @param taskId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/taskform")
	@ResponseBody
	public Map<String, Object> getFormDataInTask(@RequestParam("taskId") String taskId){
		return activitiService.queryFormDataInTask(taskId);
	}
	
	/**
	 * 完成流程
	 * @param dto
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/complete")
	@ResponseBody
	public ResponseResult completeWorkFlow(@ModelAttribute HanderTaskInDto dto, HttpServletRequest request) {
		return activitiService.complete(dto, request);
	}
	
}
