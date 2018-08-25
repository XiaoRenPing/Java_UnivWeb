package com.rpym.univweb.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.rpym.univweb.common.CommonBase;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.constants.ResponseConsts;
import com.rpym.univweb.dto.common.AopStoreDto;
import com.rpym.univweb.utils.RedisCacheManager;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.utils.SpringContextUtils;


public class TokenFilter implements Filter {

	/**
	 * 保持TOKEN
	 */
	private static ThreadLocal<AopStoreDto> requestLocal = new ThreadLocal<AopStoreDto>();
    
	private RedisCacheManager redisCacheManager;
    
	private String[] ignoreUrls; 
	
	public static AopStoreDto getAopStore() {
        return requestLocal.get();
    }
	
	
	/**
	 * 初始化获取redis缓存管理对象
	 */
    public void init(FilterConfig fConfig) throws ServletException {
        ServletContext sc = fConfig.getServletContext(); 
        XmlWebApplicationContext cxt = (XmlWebApplicationContext)WebApplicationContextUtils.getWebApplicationContext(sc);
        
        // Spring应用上下文环境  
        SpringContextUtils.setApplicationContext(cxt);
        
        if(cxt != null && cxt.getBean("redisCacheManager") != null) {
        	redisCacheManager = (RedisCacheManager) cxt.getBean("redisCacheManager");        
        }
        
        String urls = fConfig.getInitParameter("ignoreUrls");
        if(StringUtils.isNoneBlank(urls)) {
        	ignoreUrls = urls.split(CommonConst.SPLIT);
        } else {
        	ignoreUrls = new String[] {};
        }
    }
    
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        try {
			// 1.强制转换  
	        HttpServletRequest request = (HttpServletRequest) req;
	        HttpServletResponse response = (HttpServletResponse) resp;
	        response.setHeader("Access-Control-Allow-Headers", "*");
	        response.setHeader("Access-Control-Allow-Origin", "*");
	        response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, DELETE");
	        
	        // 该句代码的作用是促使请求组装map参数，作用于ResponseFilter.recordAccessLogInfo方法，否则获取不到参数列表
	        request.getParameter(StringUtils.EMPTY);
	        
	        // 排除忽略的地址
	        String uri = request.getRequestURI();
	        for(String ignoreUrl : ignoreUrls) {
	        	if(uri.endsWith(ignoreUrl)) {
	        		chain.doFilter(req, resp);
		        	return;
	        	}
	        }

	        request.setCharacterEncoding(CommonConst.UTF8);
	        response.setCharacterEncoding(CommonConst.UTF8);
	        response.setContentType(CommonConst.CONTENT_TYPE_UTF8);
	        request.setAttribute(CommonConst.REQUEST_DATE_TIME, new Date());
	        String token = request.getHeader(CommonConst.TOKEN);
	        if(StringUtils.isBlank(token)) {
	        	token = request.getParameter(CommonConst.TOKEN);
	        }
	        
	        if(token == null) {
	        	response.getWriter().println(ResponseResult.build(Integer.parseInt(ResponseConsts.STATUS_NO_TOKEN), "缺失token参数!").toString());
	        	return;
	        } else {
	        	Object sessionToken = redisCacheManager.get(CommonBase.addPrefixDeleteToken(token));
	        	
	        	// 如果存在以及被删除的TOKEN标记,说明已经重新登入过
	        	if(sessionToken != null) { 
	        		response.getWriter().println(ResponseResult.build(Integer.parseInt(ResponseConsts.STATUS_INVALID_TOKEN), "操作失败，您已经在其他地方登入，请重新登入!").toString());
	        		return;
	        	}
	        	sessionToken = redisCacheManager.get(CommonBase.addPrefixToken(token));
	        	if(sessionToken == null) {
	        		response.getWriter().println(ResponseResult.build(Integer.parseInt(ResponseConsts.STATUS_NO_TOKEN), "登入失效，请重新登入!").toString());
	        		return;
	        	}
	        }
	        // 保持TOKEN
	        requestLocal.set(new AopStoreDto(request, response, redisCacheManager, token));
        
        	// 验证通过
			chain.doFilter(req, resp);
		} finally {
			requestLocal.remove();
		}
	}
}