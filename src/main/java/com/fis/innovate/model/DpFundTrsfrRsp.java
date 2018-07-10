package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DpFundTrsfrRsp {

	@JsonProperty("RspHdr")
	private RspHdr rspHdr;
	@JsonProperty("TxnRefNbr")
	private String txnRefNbr;

	public DpFundTrsfrRsp() {
		this.rspHdr = new RspHdr("Success");
		this.txnRefNbr = "87594643173966462";

	}
}
