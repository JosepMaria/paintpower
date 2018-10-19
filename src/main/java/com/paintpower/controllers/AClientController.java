package com.paintpower.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AClientController {

	@GetMapping("/admin/clients")
	public String clients() {
		return "admin/clients";
	}
}
