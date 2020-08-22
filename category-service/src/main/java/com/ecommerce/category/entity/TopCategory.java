package com.ecommerce.category.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class TopCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ecommerce_id_seq")
	@SequenceGenerator(name = "ecommerce_id_seq", sequenceName = "ecommerce_id_seq", allocationSize = 1)
	private Long id;

	@Column(unique = true)
	private String name;

	@Column(unique = true)
	private String code;

	private String description;
}
