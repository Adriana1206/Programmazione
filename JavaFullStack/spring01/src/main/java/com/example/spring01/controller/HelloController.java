package com.example.spring01.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	private static Logger log = LogManager.getLogger(HelloController.class);

	public HelloController() {
		super();
		log.trace("***** Attivato costruttore di HelloController *****");
	}

	@GetMapping // /hello
	public String sayHello() {
		log.trace("ingresso in sayHello()");
		return "hello"; // nome della view (aka della JSP) da attivare
	}

	@GetMapping("/wm") // /hello/wm
	public String sayHelloWithMessage(Model model) {
		log.trace("ingresso in sayHelloWithMessage()");
		model.addAttribute("messaggio", "Greeting by Spring Controller");
		return "hello"; // nome della view (aka della JSP) da attivare
	}

}