package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetails {

	@JsonProperty("DpAcctInqRsp")
	private DpAcctInqRsp acctInqRsp;

	public AccountDetails(long acctId) {
		this.acctInqRsp = new DpAcctInqRsp(acctId);
	}
}
