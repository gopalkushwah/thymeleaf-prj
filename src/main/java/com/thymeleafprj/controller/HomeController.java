package com.thymeleafprj.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		return "index";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		return "about";
	}
	
}
