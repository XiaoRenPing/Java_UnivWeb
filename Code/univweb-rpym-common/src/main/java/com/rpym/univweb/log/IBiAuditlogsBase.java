package com.rpym.univweb.log;

import com.rpym.univweb.entity.BiAuditlogs;

public interface IBiAuditlogsBase {

	int addLogs(BiAuditlogs logs);

	Long addAuditlogUrl(String url);

	Long addAuditlogAgent(String agent);
}
