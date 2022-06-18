package com.olympiabiddle.mwu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympiabiddle.mwu.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	/* will display all products in the products table dynamically */	
	@GetMapping("/menu")
	public String getProducts(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "menu";
}
}
