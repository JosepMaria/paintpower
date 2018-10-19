package com.paintpower.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AInformeController {

	@GetMapping("/admin/informes")
	public String informes() {
		return "admin/informes";
	}
}
