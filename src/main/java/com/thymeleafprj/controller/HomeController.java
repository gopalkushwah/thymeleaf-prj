package com.thymeleafprj.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title","Home");
		return "index";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title","About");
		return "about";
	}
	@RequestMapping("/service")
	public String service(Model model) {
		model.addAttribute("title","Service");
		return "service";
	}
	
}
