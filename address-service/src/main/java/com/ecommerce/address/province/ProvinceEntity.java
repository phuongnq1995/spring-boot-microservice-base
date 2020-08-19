package com.ecommerce.address.province;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ecommerce.address.component.entity.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "province")
@Data
@EqualsAndHashCode(callSuper = false)
public class ProvinceEntity extends BaseModel {

	@Column
    private String code;
	@Column
    private String name;
}
