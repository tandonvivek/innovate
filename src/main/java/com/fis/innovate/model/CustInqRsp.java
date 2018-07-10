package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustInqRsp {

	@JsonProperty("RspHdr")
	private RspHdr rspHdr;
	@JsonProperty("CustId")
	private String custId;
	@JsonProperty("CustTyp")
	private String custTyp;
	@JsonProperty("CustNme")
	private CustNme custNme;
	@JsonProperty("BrthDte")
	private String brthDte;
	@JsonProperty("Gndr")
	private String gndr;
	@JsonProperty("TIN")
	private TIN tin;
	@JsonProperty("CustSnc")
	private String custSnc;
	@JsonProperty("BaseBrnch")
	private String baseBrnch;

	public CustInqRsp() {

	}

	public CustInqRsp(String customerId) {
		this.rspHdr = new RspHdr("Success");
		this.custId = customerId;
		this.custTyp = "Individual";
		this.custNme = new CustNme();
		this.brthDte = "1995-08-24";
		this.gndr = "Male";
		this.tin = new TIN();
		this.custSnc = "2018-01-27";
		
	}
}
