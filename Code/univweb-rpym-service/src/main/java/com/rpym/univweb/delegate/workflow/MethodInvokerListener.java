package com.rpym.univweb.delegate.workflow;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.impl.el.FixedValue;
import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dto.workflow.BaseListenerDto;
import com.rpym.univweb.utils.SpringContextUtils;
import com.rpym.univweb.utils.UWException;

/**
 * 流程委派操作 流程节点执行完成后，在流程线上配置调用service层的方法，方法自动被调用
 * 
 * @ClassName: MethodInvokerListener
 * @Description:
 * @author 肖仁枰
 * @date 2018年8月13日
 */
@SuppressWarnings("all")
public class MethodInvokerListener extends BaseListener {
	private static final long serialVersionUID = 1L;

	// 业务bean名称：Service层的注解value
	private FixedValue beanName;

	// 业务方法：Service层具体调用要执行的方法
	private FixedValue methodName;

	// 方法参数：java.lang.Long,java.lang.String 包括自定义类型:包名.类名
	private FixedValue methodTypes;

	// Gson格式化工具
	public static Gson GSON;

	@Override
	public void hander(BaseListenerDto dto, DelegateExecution execution) {
		Object serviceObj = SpringContextUtils.getBean(beanName.getExpressionText());
		if (serviceObj == null) {
			throw new UWException("未找到beanName=" + beanName + "的业务类，请检查配置是否正确！");
		}

		try {
			//流程参数格式{context:{dto:{id:"",name:"",....}}}
			Map<String, Object> context = (Map<String, Object>) dto.getVars().get("context");
			//获取formdata的流程参数数据
			if (context.containsKey("formdata")) {
				String formjson = (String) context.get("formdata");
				if (StringUtils.isBlank(formjson)) {
					throw new UWException("formdata参数为空!");
				}
				//获取类
				String types[] = methodTypes.getExpressionText().split(CommonConst.SPLIT);
				Class<?> classTypes[] = new Class<?>[types.length];
				for (int i = 0; i < classTypes.length; i++) {
					classTypes[i] = Class.forName(types[i]);
				}
				//获取方法和方法参数
				Method method = serviceObj.getClass().getMethod(methodName.getExpressionText(), classTypes);
				Parameter params[] = method.getParameters();
				Object args[] = new Object[params.length];
				
				//获取对象
				LinkedHashMap<String, String> linkedMap = CommonConst.GSON.fromJson(formjson, LinkedHashMap.class);
				String formdata[] = new String[linkedMap.size()];
				
				int idx = 0;
				for (Entry<String, String> entry : linkedMap.entrySet()) {
					formdata[idx] = GSON.toJson(entry.getValue());
					idx++;
				}
				//获取参数
				for (int i = 0; i < params.length; i++) {
					Parameter param = params[i];
					if (formdata.length < i + 1) {  //判断参数个数
						throw new UWException("表单数据项长度不匹配,表单实际长度" + formdata.length + ",期待长度：" + params.length);
					}
					Object paramValue = null;
					if (param.getType() == String.class) {
						paramValue = formdata[i].toString();
					} else {
						paramValue = GSON.fromJson(formdata[i], param.getType());
					}

					// BeanValidator
					/*
					 * Set<ConstraintViolation<Object>> constraintViolations =
					 * validator.validate(paramValue); if(constraintViolations.size() > 0) { String
					 * errMessage = constraintViolations.iterator().next().getMessage(); throw new
					 * UWException(errMessage); }
					 */
					args[i] = paramValue;

				}
				//实际调用方法，执行Service层业务操作
				method.invoke(serviceObj, args);

			} else {
				throw new UWException("未找到formdata参数!");
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			throw new UWException("未找到方法异常!");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new UWException("方法访问异常!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new UWException("参数类型不匹配异常!");
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new UWException("调用方法异常,错误原因：" + e.getTargetException().getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new UWException("类型参数配置异常!");
		}
	}

	
	//参数的get/set方法
	public FixedValue getBeanName() {
		return beanName;
	}
	public void setBeanName(FixedValue beanName) {
		this.beanName = beanName;
	}

	public FixedValue getMethodName() {
		return methodName;
	}
	public void setMethodName(FixedValue methodName) {
		this.methodName = methodName;
	}

	public FixedValue getMethodTypes() {
		return methodTypes;
	}
	public void setMethodTypes(FixedValue methodTypes) {
		this.methodTypes = methodTypes;
	}
}
