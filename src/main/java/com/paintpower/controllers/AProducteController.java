package com.paintpower.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AProducteController {

	@GetMapping("/admin/productes")
	public String productes() {
		return "admin/productes";
	}
}