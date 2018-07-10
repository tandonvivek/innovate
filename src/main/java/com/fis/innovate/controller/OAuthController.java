package com.fis.innovate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fis.innovate.model.AcctListRspEnv;
import com.fis.innovate.model.CustInqRspEnv;
import com.fis.innovate.model.OAuth;

@RestController
public class OAuthController {

	@GetMapping(value = "/token", produces = "application/json;charset=UTF-8")
	public OAuth getToken() {
		OAuth token = new OAuth();
		return token;
	}
}
