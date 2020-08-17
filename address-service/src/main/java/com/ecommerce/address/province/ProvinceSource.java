package com.ecommerce.address.province;

import com.ecommerce.address.component.EcSource;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(onConstructor = @__(@JsonCreator))
@JsonInclude(Include.NON_NULL)
@Getter
public class ProvinceSource extends EcSource {

    @JsonProperty(access = Access.READ_ONLY)
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String code;

    @JsonProperty
    private Boolean isDelete;

    public ProvinceSource(ProvinceEntity request) {
        this.id = request.getId();
        this.name = request.getName();
        this.isDelete = request.isDelete();
        this.code = request.getCode();
    }
}
