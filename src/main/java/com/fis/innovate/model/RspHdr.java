package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RspHdr {
	@JsonProperty("RtnCde")
	private String rtnCde;

	public RspHdr() {

	}

	public RspHdr(String rtnCde) {
		this.rtnCde = rtnCde;
	}
}
