package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcctDtls {

	@JsonProperty("AcctId")
	private String acctId;
	@JsonProperty("AcctTyp")
	private String acctTyp;
	@JsonProperty("ProdTyp")
	private String prodTyp;
	@JsonProperty("AcctStat")
	private String acctStat;
	@JsonProperty("PrmyInd")
	private String prmyInd;
	@JsonProperty("BackendHost")
	private String backendHost;

	public AcctDtls(String acctId) {
		this.acctId = acctId;
		this.acctTyp = "Checking";
		this.prodTyp = "DEP";
		this.acctStat = "Active";
		this.prmyInd = "True";
		this.backendHost = "FIS Nextgen";
	}
}
