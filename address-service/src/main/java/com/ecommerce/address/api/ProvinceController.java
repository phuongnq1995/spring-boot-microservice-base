package com.ecommerce.address.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.address.component.EcService;
import com.ecommerce.address.component.ResultSetData;
import com.ecommerce.address.province.ProvinceEntity;
import com.ecommerce.address.province.ProvinceSource;

@RestController
public class ProvinceController {

    @Autowired
    @Qualifier(value = "province-service")
    EcService<ProvinceEntity, ProvinceSource> service;

    @PostMapping("provinces")
    public ResponseEntity<ResultSetData<ProvinceSource>> getListData(
            @RequestBody ProvinceSource source){
        return ResponseEntity.ok(service.getListSource(source));
    }
}
