package com.rpym.univweb.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * 加密工具类
 * @ClassName: EncryptionUtils 
 * @Description: 密码加密，生成Token
 * @author 肖仁枰
 * @date 2018年8月9日
 */
public class EncryptionUtils {

	//base64
	public static String base64Encode(String data) {
		return Base64.encodeBase64String(data.getBytes());
	}
	public static String base64Encode(byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}
	public static byte[] base64Decode(String data) {
		return Base64.decodeBase64(data.getBytes());
	}
	//MD5
	public static String md5(String data) {
		return DigestUtils.md5Hex(data);
	}
	//sha1
	public static String sha1(String data) {
		return DigestUtils.sha1Hex(data);
	}
	//sha256Hex
	public static String sha256Hex(String data) {
		return DigestUtils.sha256Hex(data);
	}
	
	/**
	 * 创建TOKEN
	 * @param s
	 * @return
	 */
	public final static String createToken(String s) {
		try {
			// 获得密文
			return java.util.Base64.getEncoder().encodeToString(md5(s).getBytes());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
