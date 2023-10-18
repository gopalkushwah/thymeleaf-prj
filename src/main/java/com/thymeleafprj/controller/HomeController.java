package com.thymeleafprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name","Gopal Kushwah");
		return "index";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("name","Gopal Kushwah");
		return "about";
	}
}
