package com.ecommerce.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.category.dto.TopCategoryInfo;
import com.ecommerce.category.entity.TopCategory;

public interface TopCategoryRepository extends JpaRepository<TopCategory, Long> {

	/**
	 * Get all categories
	 * {@code orm-mapping-resources/top-category.xml} file.
	 * @return List<TopCategoryInfo>
	 */
	@Query(nativeQuery = true)
	List<TopCategoryInfo> getCategories();
}
