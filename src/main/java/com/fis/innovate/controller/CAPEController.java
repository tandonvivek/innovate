package com.fis.innovate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fis.innovate.model.AccountDetails;

@RestController
public class CAPEController {

	@GetMapping(value = "/mediatedapicape/v1.0/account/{acctId}/prodkey/Checking", produces = "application/json;charset=UTF-8")
	public AccountDetails getStatus(@PathVariable long acctId) {
		AccountDetails acctInq = new AccountDetails(acctId);
		return acctInq;
	}
}
