package com.rpym.univweb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class RandomUtil {

	/**
	 * 年月日时分秒毫秒 + 6位随机数
	 * @return
	 */
	public static String getVarNum() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String dateString = formatter.format(new Date());
		String randomNum = (long) ((Math.random() * 9 + 1) * 100000) + "";
		return dateString + randomNum;
	}
	
	/**
	 * 生成6位数验证码
	 * @return
	 */
	public static String getIdentifyCode() {
		String randomNum = (long) ((Math.random() * 9 + 1) * 100000) + "";
		return randomNum;
	}
	
	
	/**
	 * 生成事物流水号
	 * @return
	 */
	public static String getTransactionId() {
		return "SN" + RandomUtil.getVarNum();
	}
	
	/**
	 * 生成合同编号
	 * @return
	 */
	public static String getContractId() {
		return "CN" + RandomUtil.getVarNum();
	}

	/**
	 * TK单编号
	 * @return
	 */
	public static String getTKOrderNumber() {
		return "TK" + RandomUtil.getVarNum();
	}

	/**
	 * 生成获取UUID
	 * @return
	 */
	public static String generateUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
	
	// 测试
	public static void main(String[] args) {
		System.out.println(getVarNum());
	}
}
