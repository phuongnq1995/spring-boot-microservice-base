package com.ecommerce.elasticsearch.component;

public interface ElacticeService<E, R> {

    ResultSetData<E> getListSource(R source);

    ResultData<E> createSource(E source);
}
