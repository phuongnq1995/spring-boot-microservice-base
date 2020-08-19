package com.ecommerce.address.commune;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ecommerce.address.component.entity.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "commune")
@Data
@EqualsAndHashCode(callSuper = false)
public class CommuneEntity extends BaseModel{

    @Column
    private String code;

    @Column(name = "code_province")
    private String codeProvince;

    @Column(name = "code_district")
    private String codeDistrict;

    @Column
    private String name;
}
