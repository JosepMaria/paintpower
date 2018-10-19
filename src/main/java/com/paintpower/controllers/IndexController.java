package com.paintpower.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value= {"","/","index"}, method=RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value= {"detall"}, method=RequestMethod.GET)
	public String detall(Model model) {
		return "detall";
	}

	
	@RequestMapping(value= {"register"}, method=RequestMethod.GET)
	public String register(Model model) {
		return "register";
	}
	
	@RequestMapping(value= {"prova"}, method=RequestMethod.GET)
	public String prova(Model model) {
		return "prova";
	}

}
