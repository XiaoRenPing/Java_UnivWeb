package com.rpym.univweb.web.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dto.user.UserQueryDto;
import com.rpym.univweb.dto.user.UserQueryOutDto;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.service.system.user.IUserService;
import com.rpym.univweb.utils.ResponseResult;
import com.rpym.univweb.web.controller.base.BaseController;

/**
 * 用户管理Controller控制器
 * @ClassName: UserController 
 * @Description: 
 * @author 肖仁枰
 * @date 2018年8月9日
 */
@RestController
@RequestMapping("/users/*")
public class UserController extends BaseController{

	@Autowired
	private IUserService userService;
	
	
	/**
	 * 
	 * @Description: 跳转到登录界面
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author 肖仁枰
	 * @date 2018年8月9日
	 */
	@RequestMapping(method=RequestMethod.GET, value="/tologin")
	public String toLogin(){
		return "/view/user/login";
	}
	

	/**
	* 跳转注册界面
	* @Description: 
	* @param @return 
	* @return String 
	* @throws 
	* @author 肖仁枰
	* @date 2018年8月9日
	 */
	@RequestMapping(method=RequestMethod.GET, value="/toregister")
	public String toRegister(){
		return "/view/user/register";
	}
	

	/**
	 * 
	 * @Description: 用户登录
	 * @param username
	 * @param password
	 * @param request 
	 * @return ResponseResult  
	 * @throws
	 * @author 肖仁枰
	 * @date 2018年8月9日
	 */
	@RequestMapping(method=RequestMethod.POST, value="/login")
	@ResponseBody
	public ResponseResult login(@RequestParam("username") String username, @RequestParam("password")String password, @RequestParam("vcode")String vcode, HttpServletRequest request){
		return userService.login(username, password, vcode, request);
	}
	
	/**
	 * 退出登录状态
	* @Description: 
	* @param vcode
	* @param request
	* @return String 
	* @throws 
	* @author 肖仁枰
	* @date 2018年8月14日
	 */
	@RequestMapping(method=RequestMethod.GET, value="/quit")
	public String logout(@RequestParam("token")String token, HttpServletRequest request) {
		return userService.logout(token, request);
	}
	
	
	//--------------------------- 管理用户  ---------------------------------
	/**
	 * 
	 * @Description: 跳转到用户列表界面
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author 肖仁枰
	 * @date 2018年8月9日
	 */
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public String userIndex(){
		return "/view/user/userList";
	}
	
	/**
	 * 分页显示用户信息
	 * @Description: 
	 * @param userQryDto
	 * @param @return   
	 * @return PageInfo<UserQueryOutDto>  
	 * @throws
	 * @author 肖仁枰
	 * @date 2018年8月9日
	 */
	@RequestMapping(method=RequestMethod.POST, value="/list")
	@ResponseBody
	public Map<String, Object> pageUserList(@RequestBody UserQueryDto userQryDto){
		Map<String, Object> response = new HashMap<String, Object>();
		PageInfo<UserQueryOutDto> userPageInfo = userService.queryUserList(userQryDto);
		response.put("status", CommonConst.STATUS_SUCCESS);
		response.put("message", CommonConst.MSG_SUCCESS);
		response.put("data", userPageInfo);
		return response;
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/find")
	@ResponseBody
	public Map<String, Object> findUserList(@RequestParam(value="pageNum")Integer pageNum, @RequestParam(value="pageSize")Integer pageSize){
		Map<String, Object> response = new HashMap<String, Object>();
		PageInfo<UserQueryOutDto> userPageInfo = userService.findUserList(pageNum, pageSize);
		response.put("status", CommonConst.STATUS_SUCCESS);
		response.put("message", CommonConst.MSG_SUCCESS);
		response.put("data", userPageInfo);
		return response;
	}
	
	/**
	 * 新增用户
	 * @Description: 
	 * @param user
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author 肖仁枰
	 * @date 2018年8月9日
	 */
	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public String saveUserInfo(@ModelAttribute SysUsers user) {
		user.setIsactive(true);
		user.setIsdeleted(false);
		return userService.addUserInfo(user);
	}
	
	/**
	 * 修改UI
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/updateUI")
	public String updateUserUI(){
		return "/view/user/userList";
	}
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/update")
	@ResponseBody
	public String updateUserInfo(@ModelAttribute SysUsers user) {
		return userService.updateUserInfo(user);
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/delete")
	public String deleteUser(@RequestParam("id") Long id){
		return userService.deleteUser(id);
	}
	
}
