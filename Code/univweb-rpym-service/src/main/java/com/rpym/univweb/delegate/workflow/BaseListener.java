package com.rpym.univweb.delegate.workflow;

import java.util.Map;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.impl.el.FixedValue;

import com.rpym.univweb.dto.workflow.BaseListenerDto;
import com.rpym.univweb.service.base.BaseService;

/**
 * 流程事件监听器
* @ClassName: BaseListener
* @Description: 
* @author 肖仁枰
* @date 2018年8月13日
 */
public abstract class BaseListener extends BaseService implements ExecutionListener{

	//el表达式参数：是否通过
	protected FixedValue isAuditPass;
	
	public abstract void hander(BaseListenerDto dto, DelegateExecution execution);
	
	/**
	 * 调用方法
	 */
	public void notify(DelegateExecution execution) throws Exception {
		Map<String, Object> vars = execution.getVariables();
		BaseListenerDto dto = new BaseListenerDto();
		if(vars.containsKey("path")) {
			dto.setPath(vars.get("path").toString());
		}
		if(vars.containsKey("context")) {
			Map<String, Object> context = (Map<String, Object>)vars.get("context");
			if(context.containsKey("id")) {
				dto.setId(context.get("id").toString());
			}
		}
		dto.setVars(vars);
		hander(dto, execution);
	}

	public FixedValue getIsAuditPass() {
		return isAuditPass;
	}

	public void setIsAuditPass(FixedValue isAuditPass) {
		this.isAuditPass = isAuditPass;
	}

	
}
