package com.rpym.univweb.service.system.user.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysUserRolesMapper;
import com.rpym.univweb.dao.SysUsersMapper;
import com.rpym.univweb.dto.user.UserQueryDto;
import com.rpym.univweb.dto.user.UserQueryOutDto;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.entity.SysUsersExample;
import com.rpym.univweb.service.base.BaseService;
import com.rpym.univweb.service.system.user.IUserService;
import com.rpym.univweb.utils.RandomUtil;
import com.rpym.univweb.utils.RedisCacheManager;
import com.rpym.univweb.utils.ResponseResult;

/**
 * 用户业务服务
* @ClassName: UserServiceImpl
* @Description: 
* @author XiaoRenPing
* @date 2018年6月2日
 */
@Service("userService")
public class UserServiceImpl extends BaseService implements IUserService{
	
	@Autowired
	SysUsersMapper userDao;
	
	@Autowired
	SysUserRolesMapper userRolesDao;
	
	@Autowired
	RedisCacheManager redisCacheManager;
	

	
	/**
	 * 添加用户  【新增用户信息】
	 * <p>Title: addUserInfo</p>   
	 * <p>Description: </p>  
	 * @author 肖仁枰 
	 * @param user
	 * @return   
	 * @see com.rpym.univweb.service.system.user.IUserService#addUserInfo(com.rpym.univweb.entity.SysUsers)
	 */
	public String addUserInfo(SysUsers user) {
		userDao.insertSelective(user);
		return user.getName();
	}

	
	/**
	 * 用户列表  【用户管理】
	 * <p>Title: queryUserList</p>   
	 * <p>Description: </p>  
	 * @author 肖仁枰 
	 * @param userQryDto
	 * @return   
	 * @see com.rpym.univweb.service.system.user.IUserService#queryUserList(com.rpym.univweb.dto.user.UserQueryDto)
	 */
	//@Cacheable(value="univweb_cache")
	public PageInfo<UserQueryOutDto> queryUserList(UserQueryDto userQryDto) {
		SysUsersExample userExample = new SysUsersExample();
		userExample.createCriteria().andIdIsNotNull();
		//this.initPage(userQryDto);
		//PageHelper.startPage(userQryDto.getPageNum(), userQryDto.getPageSize()); //设置页面问题
		List<SysUsers> userList = userDao.selectByExample(userExample);
		List<UserQueryOutDto> userQryOutList = convert(userList, UserQueryOutDto.class);
		PageInfo<UserQueryOutDto> userPageInfo = new PageInfo<UserQueryOutDto>(userQryOutList);
		return userPageInfo;
	}

	
	/**
	 * 用户登录操作
	 * <p>Title: login</p>   
	 * <p>Description: </p>  
	 * @author 肖仁枰 
	 * @param name
	 * @param password
	 * @param vcode
	 * @param request
	 * @return   
	 * @see com.rpym.univweb.service.system.user.IUserService#login(java.lang.String, java.lang.String, java.lang.String, javax.servlet.http.HttpServletRequest)
	 */
	public ResponseResult login(String name, String password, String vcode, HttpServletRequest request) {
		ResponseResult result = new ResponseResult();
		String sessionCode = (String) request.getSession().getAttribute("vcode");
		//校验验证码
		if(validateVerifyCode(vcode, sessionCode)) {
			result.setMsg("验证码不正确！");
			result.setStatus(202);
			return result;
		}
		
		SysUsersExample userExample = new SysUsersExample();
		userExample.createCriteria().andUsernameEqualTo(name).andPasswordEqualTo(password);
		List<SysUsers> userList = userDao.selectByExample(userExample);
		if(userList != null && userList.size() == 0) {
			result.setMsg("用户名或密码错误！");
			result.setStatus(201);
			//throw new UWException("用户名或密码错误！");
			return result;
		}
		SysUsers user = userList.get(0);
		//保存用户信息
		long time = 60 * 60; // 1个小时
		String token = RandomUtil.generateUUID();
		String userKey = this.addPrefixUser(user.getId());
		//判断Redis服务器是否启动
		
		//从Redis中获取token
		String tokenKey = (String) redisCacheManager.get(user.getId().toString());
		if(StringUtils.isNotBlank(tokenKey)) {
			redisCacheManager.del(tokenKey);
			redisCacheManager.del(userKey);
			redisCacheManager.del(addPrefixDeleteToken(token));
			
			String markDeletetokey = StringUtils.join(CommonConst.DELETE, CommonConst.UNDER_LINE, tokenKey);
			redisCacheManager.set(markDeletetokey, userKey, time);
		}
		boolean tokeyResult = redisCacheManager.set(token, user, time);
		boolean userKeyResult = redisCacheManager.set(userKey, tokenKey, time);

		logger.info("insert new token to redis = " + tokeyResult + ", " + userKeyResult);

		long endTime1 = System.currentTimeMillis();
		logger.info("执行登录，执行时长：" + (endTime1 - System.currentTimeMillis()));

		request.getSession().setAttribute("sessionUser", user);
	
		result.setData(token);
		result.setMsg("登录成功！");
		result.setStatus(200);
		return result;
	}

	
	/**
	 * 
	* @Description: 验证码判断
	* @param vcode
	* @param sessionCode
	* @param 
	* @return boolean 
	* @throws 
	* @author 肖仁枰
	* @date 2018年8月13日
	 */
	private boolean validateVerifyCode(String vcode, String sessionCode) {
		if(vcode.equalsIgnoreCase(sessionCode)) {
			return true;
		}else {
			return false;
		}
	}

	
	/**
	 * 
	 * <p>Title: getUserIdByUserName</p>   
	 * <p>Description: 根据用户名获取用户信息 </p>  
	 * @author 肖仁枰 
	 * @param name
	 * @return   
	 * @see com.rpym.univweb.service.system.user.IUserService#getUserIdByUserName(java.lang.String)
	 */
	public SysUsers getUserIdByUserName(String name) {
		SysUsersExample userExample = new SysUsersExample();
		userExample.createCriteria().andUsernameEqualTo(name);
		List<SysUsers> userList = userDao.selectByExample(userExample);
		if(!CollectionUtils.isEmpty(userList)) {
			userList.get(CommonConst.NUM_0);
		}
		return null;
	}


	
	/**
	 * 用户退出登录
	 * <p>Title: logout</p>   
	 * <p>Description: </p>  
	 * @author 肖仁枰 
	 * @param token
	 * @param request
	 * @return   
	 * @see com.rpym.univweb.service.system.user.IUserService#logout(java.lang.String, javax.servlet.http.HttpServletRequest)
	 */
	public String logout(String token, HttpServletRequest request) {
		if(token != null) {
			redisCacheManager.del(token);
			redisCacheManager.del(token);
			redisCacheManager.del(addPrefixDeleteToken(token));
		}
		request.getSession().removeAttribute("sessionUser");
		return "/view/user/login";
	}


	public String updateUserInfo(SysUsers user) {
		userDao.updateByPrimaryKeySelective(user);
		return "/view/user/list";
	}


	public String deleteUser(Long id) {
		userDao.deleteByPrimaryKey(id);
		return "/view/user/list";
	}

	
	

}
