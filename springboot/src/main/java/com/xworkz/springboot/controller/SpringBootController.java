package com.xworkz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {

	public SpringBootController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("onDO")
	public String onDO() {
		System.out.println("Invoked onDo");
		return "springboot.jsp";
	}

	@RequestMapping("springboot")
	public String WelcomeMessage(String from, String message, Model model) {
		try {
			System.out.println("Invoked springboot page and redirecting to message.jsp");

			model.addAttribute("from", from);
			model.addAttribute("message", message);
		} catch (Exception e) {
			System.err.println("Exception in springboot controller " + e);
		}
		return "message.jsp";
	}

}
