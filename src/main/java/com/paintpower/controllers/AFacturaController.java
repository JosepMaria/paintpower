package com.paintpower.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AFacturaController {

	@GetMapping("/admin/factures")
	public String factures() {
		return "admin/factures";
	}
}
