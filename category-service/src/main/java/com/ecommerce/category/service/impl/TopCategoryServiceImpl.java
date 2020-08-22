package com.ecommerce.category.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ecommerce.category.dto.TopCategoryInfo;
import com.ecommerce.category.repository.TopCategoryRepository;
import com.ecommerce.category.service.TopCategoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TopCategoryServiceImpl implements TopCategoryService {

	@Autowired
	TopCategoryRepository topCategoryRepository;

	@Override
	@Cacheable("topCategories")
	public List<TopCategoryInfo> getCategories() {

		return topCategoryRepository.getCategories();
	}
}
