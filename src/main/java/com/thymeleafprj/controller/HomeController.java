package com.thymeleafprj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleafprj.model.Course;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		List<String> list = List.of("Java","Python","Node","Js","React");
		model.addAttribute("list",list);
		return "index";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		List<Course> list = new ArrayList<>();
		list.add(new Course(1, "java", 5454));
		list.add(new Course(2, "python", 5454));
		list.add(new Course(3, "node", 5454));
		list.add(new Course(4, "react", 5454));
		list.add(new Course(5, "mongodb", 5454));
		list.add(new Course(6, "js", 5454));
		list.add(new Course(7, "css", 5454));
		model.addAttribute("list",list);
		return "about";
	}
	
	
//	conditional programming in thymeleaf
	@GetMapping("/condition")
	public String condition(Model model) {
		model.addAttribute("isActive",false);
		
		model.addAttribute("gender","F");
		
		List<Integer> of = List.of(23,32,3);
		model.addAttribute("myList", of);
		model.addAttribute("num", 2);
		return "condition";
	}
}
