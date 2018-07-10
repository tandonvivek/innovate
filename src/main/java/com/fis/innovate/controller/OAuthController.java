package com.fis.innovate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.innovate.model.OAuth;

@RestController
public class OAuthController {

	@PostMapping(value = "/token", produces = "application/json;charset=UTF-8")
	public OAuth getToken() {
		OAuth token = new OAuth();
		return token;
	}
}
