package com.ecommerce.category.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ecommerce.category.entity.base.BaseModel;

@Table
@Entity
public class TopCategory extends BaseModel {

	@Column(unique = true)
	private String name;

	@Column(unique = true)
	private String code;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
