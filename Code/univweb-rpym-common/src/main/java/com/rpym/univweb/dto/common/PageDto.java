package com.rpym.univweb.dto.common;

public class PageDto {

		private int pageNum;
		
		private int pageSize;
		
		private String orderBy;

		public int getPageNum() {
			return pageNum;
		}

		public void setPageNum(int pageNum) {
			this.pageNum = pageNum;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public String getOrderBy() {
			return orderBy;
		}

		public void setOrderBy(String orderBy) {
			this.orderBy = orderBy;
		}

		@Override
		public String toString() {
			return "PageDto [pageNum=" + pageNum + ", pageSize=" + pageSize + ", orderBy=" + orderBy + "]";
		}
		
		
	}
