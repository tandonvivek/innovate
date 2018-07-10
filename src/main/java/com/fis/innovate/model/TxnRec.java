package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TxnRec {

	@JsonProperty("TxnRefNbr")
	private String txnRefNbr;
	@JsonProperty("Amt")
	private Double amt;
	@JsonProperty("CrncyCde")
	private String crncyCde;
	@JsonProperty("PstDfltNarr")
	private String pstDfltNarr;
	@JsonProperty("PmtTyp")
	private String pmtTyp;
	@JsonProperty("OrigChnlId")
	private String origChnlId;
	@JsonProperty("PstDte")
	private String pstDte;

	public TxnRec(String txnRefNbr, Double amt, String crncyCde, String pstDfltNarr, String pmtTyp, String origChnlId,
			String pstDte) {
		this.txnRefNbr = txnRefNbr;
		this.amt = amt;
		this.crncyCde = crncyCde;
		this.pstDfltNarr = pstDfltNarr;
		this.pmtTyp = pmtTyp;
		this.origChnlId = origChnlId;
		this.pstDte = pstDte;
	}
}
