package com.rpym.univweb.dto.merchandise;

import com.rpym.univweb.dto.PageDto;

public class MerchandiseQueryDto extends PageDto {

	private String merchandisename;

	public String getMerchandisename() {
		return merchandisename;
	}

	public void setMerchandisename(String merchandisename) {
		this.merchandisename = merchandisename;
	}
	
}
