package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuth {

	@JsonProperty("access_token")
	private String access_token;
	@JsonProperty("scope")
	private String scope;
	@JsonProperty("token_type")
	private String token_type;
	@JsonProperty("expires_in")
	private int expires_in;

	public OAuth() {
		this.access_token = "6f413d94-9994-3804-8cd1-0deecfff7877";
		this.scope = "am_application_scope default";
		this.token_type = "Bearer";
		this.expires_in = 3153;
	}
}
