package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustNme {

	@JsonProperty("FrstNme")
	private String frstNme;
	@JsonProperty("MidNme")
	private String midNme;
	@JsonProperty("LstNme")
	private String lstNme;

	public CustNme() {
		this.frstNme = "John";
		this.midNme = "H.";
		this.lstNme = "Adams";
	}

}
