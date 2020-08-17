package com.ecommerce.address.component;

import java.util.List;

public interface EcService<E, R> {

    ResultSetData<R> getListSource(R source);

    List<R> toResource(List<E> entity);
}
