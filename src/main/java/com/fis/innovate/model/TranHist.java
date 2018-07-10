package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranHist {

	@JsonProperty("DpTxnHistRsp")
	private DpTxnHistRsp acctHistRsp;

	public TranHist(long acctId) {
		this.acctHistRsp = new DpTxnHistRsp(acctId);
	}
}
