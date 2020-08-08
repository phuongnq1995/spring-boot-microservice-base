package com.ecommerce.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.category.service.TopCategoryService;

@RestController
public class TopCategoryController {

	@Autowired
	private TopCategoryService topCategoryService;

}
