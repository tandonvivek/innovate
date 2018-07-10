package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DpAcctInqRsp {

	@JsonProperty("RspHdr")
	private RspHdr rspHdr;
	@JsonProperty("AcctId")
	private long acctId;
	@JsonProperty("AcctTyp")
	private String acctTyp;
	@JsonProperty("CrncyCde")
	private String crncyCde;
	@JsonProperty("PrmyStat")
	private String prmyStat;
	@JsonProperty("ScndyStat")
	private String scndyStat;
	@JsonProperty("OpenDte")
	private String openDte;
	@JsonProperty("LgrBal")
	private Double lgrBal;
	@JsonProperty("AvailBal")
	private Double availBal;
	@JsonProperty("LstDpAmt")
	private Double lstDpAmt;
	@JsonProperty("LstWthdrwlAmt")
	private Double lstWthdrwlAmt;

	public DpAcctInqRsp() {

	}

	public DpAcctInqRsp(long acctId) {
		this.rspHdr = new RspHdr("Success");
		this.acctId = acctId;
		this.acctTyp = "Checking";
		this.crncyCde = "USD";
		this.prmyStat = "Active";
		this.scndyStat = "Open";
		this.openDte = null;
		this.lgrBal = 15743.53;
		this.availBal = 15743.53;
		this.lstDpAmt = 51.00;
		this.lstWthdrwlAmt = 5.00;
	}
}
