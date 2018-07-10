package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustInqRspEnv {

	@JsonProperty("CustInqRsp")
	private CustInqRsp custInqRsp;

	public CustInqRspEnv(String customerId) {
		this.custInqRsp = new CustInqRsp(customerId);
	}
}
