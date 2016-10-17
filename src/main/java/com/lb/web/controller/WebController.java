package com.lb.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import com.lb.datajpa.user.service.UserService;
@RestController
@RequestMapping("/")
public class WebController {

	@RequestMapping("/person")
	public String listAll(Model model) {
		UserService us=new UserService();
		model.addAttribute("presonal", us.getAllUsers());
		return "personal";
	}

}
