package com.ecommerce.elasticsearch.address.source;

import com.ecommerce.elasticsearch.common.Constant;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor(onConstructor = @__(@JsonCreator) )
@JsonInclude(Include.NON_NULL)
@Builder
public class ProvinceSource {

    @JsonProperty
    private String id;

    @JsonProperty(value = "code")
    private String code;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "limit")
    private Integer limit;

    @JsonProperty(value = "offset")
    private Integer offset;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        if(code == null) {
            code = Constant.EMPTY_DEFAULT_VALUE;
        }
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        if(name == null) {
            name = Constant.EMPTY_DEFAULT_VALUE;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLimit() {
        if(limit == null) {
            limit = Constant.LIMIT_DEFAULT_VALUE;
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        if(offset == null) {
            offset = Constant.OFFSET_DEFAULT_VALUE;
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
