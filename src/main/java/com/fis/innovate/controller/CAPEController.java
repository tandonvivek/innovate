package com.fis.innovate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.innovate.model.AccountDetails;
import com.fis.innovate.model.DpFundTrsfrRspEnv;
import com.fis.innovate.model.TranHist;

@RestController
public class CAPEController {

	@GetMapping(value = "/mediatedapicape/v1.0/account/{acctId}/prodkey/Checking", produces = "application/json;charset=UTF-8")
	public AccountDetails getStatus(@PathVariable long acctId) {
		AccountDetails acctInq = new AccountDetails(acctId);
		return acctInq;
	}
	
	@GetMapping(value = "/mediatedapicape/v1.0/account/{acctId}/histinq", produces = "application/json;charset=UTF-8")
	public TranHist getTransactions(@PathVariable long acctId) {
		TranHist tranHist = new TranHist(acctId);
		return tranHist;
	}

	@PostMapping(value = "/mediatedapicape/v1.0/account/{accountId}/transferfunds", produces = "application/json;charset=UTF-8")
	public DpFundTrsfrRspEnv doFundTrans(@PathVariable String accountId) {
		DpFundTrsfrRspEnv fundTrans = new DpFundTrsfrRspEnv();
		return fundTrans;
	}
}
