package com.rpym.univweb.utils;

import java.io.Serializable;
import java.util.HashMap;

public class Response extends HashMap<String, Object> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Response getInstance(){
		return new Response();
	}

}
