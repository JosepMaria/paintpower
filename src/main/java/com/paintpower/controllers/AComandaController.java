package com.paintpower.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AComandaController {

	@GetMapping("/admin/comandes")
	public String comandes() {
		return "admin/comandes";
	}
}
