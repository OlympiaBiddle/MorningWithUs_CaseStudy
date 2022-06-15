package com.olympiabiddle.mwu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.olympiabiddle.mwu.entity.Customer;
import com.olympiabiddle.mwu.service.CustomerService;

@Controller
public class CustomerConrtoller {
	@Autowired private CustomerService service;
	
//	@GetMapping("/register")
//	public String showRegisterForm(Model model) {
//		model.addAttribute("pageTitle", "Customer Registration");
//		model.addAttribute("customer", new Customer());
//		return "register/register_form";
//	}
	
	@GetMapping("/index")
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		return "register";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	@GetMapping("/menu")
	public String menu(Model model) {
		return "menu";
	}
}
