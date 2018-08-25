package com.rpym.univweb.utils;

import java.util.List;

public class DataGridResult {

	private long total;
	private List<?> dataList;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getDataList() {
		return dataList;
	}
	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}
		
}
