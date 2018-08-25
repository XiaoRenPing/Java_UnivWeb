package com.rpym.univweb.service.system.user;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.rpym.univweb.dto.user.UserQueryDto;
import com.rpym.univweb.dto.user.UserQueryOutDto;
import com.rpym.univweb.entity.SysUsers;
import com.rpym.univweb.utils.ResponseResult;

public interface IUserService {

	public String addUserInfo(SysUsers user);
	
	public PageInfo<UserQueryOutDto> queryUserList(UserQueryDto userQryDto);

	public ResponseResult login(String name, String password, String vcode, HttpServletRequest request);

	public SysUsers getUserIdByUserName(String name);

	public String logout(String token, HttpServletRequest request);

}
