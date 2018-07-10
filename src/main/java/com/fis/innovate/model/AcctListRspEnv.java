package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctListRspEnv {

	@JsonProperty("AcctListRsp")
	private AcctListRsp acctListRsp;

	public AcctListRspEnv(String customerId) {
		this.acctListRsp = new AcctListRsp(customerId);
	}
}
