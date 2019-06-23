package com.devops.devops.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = { "/", "/index" })
	public String welcome(Model model) {
		model.addAttribute("course", "DevOps");
		return "index";

	}
}
