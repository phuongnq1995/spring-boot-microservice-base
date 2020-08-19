package com.ecommerce.address.district;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ecommerce.address.component.entity.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "district")
@Data
@EqualsAndHashCode(callSuper = false)
public class DistrictEntity extends BaseModel {

    @Column
    private String code;

    @Column(name = "code_province")
    private String codeProvince;

    @Column
    private String name;
}
