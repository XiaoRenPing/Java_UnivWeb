package com.rpym.univweb.common;

import org.apache.commons.lang3.StringUtils;

import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dto.common.AopStoreDto;
import com.rpym.univweb.filter.TokenFilter;

public class CommonBase {
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
	
	
	/**
	 * 添加前缀
	 * @param userName
	 * @return
	 */
	public static String addPrefixWebSocket(String userName) {
		String tokey = StringUtils.join(CommonConst.WEB_SOCKET, CommonConst.UNDER_LINE, userName);
		return tokey;
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
	 * @param mobileNumber
	 * @return
	 */
	public static String addPrefixIdentifyCode(String mobileNumber) {
		String userKey = CommonConst.IDENTIFY_CODE + CommonConst.UNDER_LINE + mobileNumber;
		return userKey;
	}
	
	/**
	 * 获取token
	 * @return
	 */
	public String getSessionToken() {
		AopStoreDto aopStoreDto = TokenFilter.getAopStore();
		if(aopStoreDto != null) {
			String token = aopStoreDto.getToken();
			return token;
		}
		return null;
	}
	
	/**
	 * 获取token 参数  ?token=
	 * @return
	 */
	public String getSessionTokenParam() {
		AopStoreDto aopStoreDto = TokenFilter.getAopStore();
		if(aopStoreDto != null) {
			String token = aopStoreDto.getToken();
			token = CommonConst.QUESTION.concat(CommonConst.TOKEN).concat(CommonConst.EQUEL).concat(token);
			return token;
		}
		return null;
	}
	
}