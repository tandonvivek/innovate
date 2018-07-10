package com.fis.innovate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DpFundTrsfrRspEnv {

	@JsonProperty("DpFundTrsfrRsp")
	private DpFundTrsfrRsp dpFundTrsfrRsp;

	public DpFundTrsfrRspEnv() {
		this.dpFundTrsfrRsp = new DpFundTrsfrRsp();
	}
}
