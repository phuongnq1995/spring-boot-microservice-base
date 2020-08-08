package com.ecommerce.category.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.category.TopCategoryRepository;
import com.ecommerce.category.entity.TopCategory;

@Service
public class TopCategoryServiceImpl extends TopCategory {

	@Autowired
	private TopCategoryRepository topCategoryRepository;

}
