package com.ecommerce.category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.category.entity.TopCategory;

public interface TopCategoryRepository extends JpaRepository<TopCategory, Long>{

}
