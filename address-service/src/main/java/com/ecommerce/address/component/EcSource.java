package com.ecommerce.address.component;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@MappedSuperclass
public abstract class EcSource {

    @JsonProperty(access = Access.WRITE_ONLY)
    protected Integer limit;

    @JsonProperty(access = Access.WRITE_ONLY)
    protected Integer offset;

    public Integer getLimit() {
        if(limit == null) {
            limit = 20;
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        if(offset == null) {
            offset = 1;
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
