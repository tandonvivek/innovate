package com.fis.innovate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.innovate.model.Heartbeat;

@RestController
public class HeartbeatController {

	@PostMapping(value = "/heartbeat/validate", produces = "application/json;charset=UTF-8")
	public Heartbeat validate(@RequestBody Heartbeat newHB) {
		Heartbeat hb = new Heartbeat(newHB.getId());
		if (Heartbeat.hbCodeStatic.equals(newHB.getHbCode())) {
			hb.setStatus(true);
		}
		return hb;
	}

	@GetMapping(value = "/heartbeat/{id}/checkstatus", produces = "application/json;charset=UTF-8")
	public Heartbeat getStatus(@PathVariable String id) {
		Heartbeat hb = new Heartbeat(id);
		return hb;
	}

	@GetMapping(value = "/heartbeat/{id}/logout", produces = "application/json;charset=UTF-8")
	public Heartbeat logout(@PathVariable String id) {
		Heartbeat hb = new Heartbeat(id);
		hb.setStatus(false);
		return hb;
	}
}
