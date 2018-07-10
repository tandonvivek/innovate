package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TIN {

	@JsonProperty("TaxId")
	private String taxId;
	@JsonProperty("TaxIdTyp")
	private String taxIdTyp;

	public TIN() {
		this.taxId = "******656";
		this.taxIdTyp = "SSN";
	}

}
