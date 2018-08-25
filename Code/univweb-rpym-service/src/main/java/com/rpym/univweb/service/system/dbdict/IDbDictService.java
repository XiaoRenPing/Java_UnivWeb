package com.rpym.univweb.service.system.dbdict;

import java.util.List;

import com.rpym.univweb.entity.BiDbDictDetail;

public interface IDbDictService {

	List<BiDbDictDetail> getDistinctDbDictDetailByCode(String key);

}
