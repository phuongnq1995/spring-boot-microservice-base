package com.ecommerce.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.category.dto.TopCategoryInfo;
import com.ecommerce.category.service.TopCategoryService;

@RestController
public class TopCategoryController {

	@Autowired
	private TopCategoryService topCategoryService;

	@GetMapping("/categories")
	public ResponseEntity<List<TopCategoryInfo>> getCategories() {

		return ResponseEntity.ok(topCategoryService.getCategories());
	}
}
