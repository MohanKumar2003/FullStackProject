package com.onlinestore.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/")
	public String getProducts() {
		return "Welcome to Our full stack Project";
	}
}
