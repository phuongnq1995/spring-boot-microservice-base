package com.ecommerce.category.service;

import java.util.List;

import com.ecommerce.category.dto.TopCategoryInfo;

public interface TopCategoryService {

	List<TopCategoryInfo> getCategories();
}
