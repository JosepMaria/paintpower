package com.paintpower.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paintpower.models.entity.Pintura;
import com.paintpower.models.service.PinturaService;

@Controller
public class PinturaController {

	@Autowired
	private PinturaService pinturaService;
	
	@RequestMapping(value= {"pintura"}, method=RequestMethod.GET)
	public String index(Model model) {
		//String p = "hola";
		//model.addAttribute("pintures", p);
		List<Pintura> pint = pinturaService.findAll();
		model.addAttribute("pintures", pint);
		return "pintura";
	}
	
	
}
