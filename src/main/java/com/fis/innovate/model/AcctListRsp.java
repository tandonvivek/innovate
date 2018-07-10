package com.fis.innovate.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctListRsp {

	@JsonProperty("RspHdr")
	private RspHdr rspHdr;
	@JsonProperty("CustId")
	private String custId;
	@JsonProperty("AcctDtls")
	private List<AcctDtls> acctDtls = new ArrayList<AcctDtls>();

	public AcctListRsp() {

	}

	public AcctListRsp(String customerId) {
		this.rspHdr = new RspHdr("Success");
		this.custId = customerId;
		this.acctDtls.add(new AcctDtls("50000002319"));
		this.acctDtls.add(new AcctDtls("50000002576"));

	}
}
