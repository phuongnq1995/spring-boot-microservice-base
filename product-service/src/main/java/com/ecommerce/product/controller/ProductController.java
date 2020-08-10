package com.ecommerce.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.configuration.Configuration;

@RestController
public class ProductController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/product/limit")
	public long getLimit() {

		return configuration.getLimit();
	}
}
