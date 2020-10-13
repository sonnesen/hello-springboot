package com.mentoria.hellospringboot.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloResource {

	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("/hello")
	public ModelAndView sayHello(@RequestParam(name = "nome", required = false, 
		defaultValue = "World") String nome) {
	
		ModelAndView model = new ModelAndView("hello/saudacao");
		model.addObject("nome", nome);
		
		return model;
	}
}
