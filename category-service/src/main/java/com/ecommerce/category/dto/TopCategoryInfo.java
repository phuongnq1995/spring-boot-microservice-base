package com.ecommerce.category.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Data
@EqualsAndHashCode
public class TopCategoryInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3314875778346648527L;

	private String name;
	private String code;
	private String description;
}
