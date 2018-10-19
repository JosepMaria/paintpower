package com.paintpower.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paintpower.models.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "llistar", method = RequestMethod.GET)
	public String llistar(Model model) {
		model.addAttribute("titol", "Llistat de clients");
		model.addAttribute("clients", clientService.findAll());
		return "llistar";
	}
}
