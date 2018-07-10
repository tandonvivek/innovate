package com.fis.innovate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fis.innovate.model.CustInqRspEnv;

@RestController
public class ECController {

	@GetMapping(value = "/mediatedapiec/v1.0/customers/{customersId}/profile", produces = "application/json;charset=UTF-8")
	public CustInqRspEnv getStatus(@PathVariable String customersId) {
		CustInqRspEnv custInq = new CustInqRspEnv(customersId);
		return custInq;
	}
}
