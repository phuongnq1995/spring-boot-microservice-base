package com.ecommerce.address.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.address.component.EcService;
import com.ecommerce.address.component.ResultSetData;
import com.ecommerce.address.district.DistrictEntity;
import com.ecommerce.address.district.DistrictSource;

@RestController
public class DistrictController {

    @Autowired
    @Qualifier("district-service")
    private EcService<DistrictEntity, DistrictSource> ecService;

    @PostMapping("/districts")
    public ResponseEntity<ResultSetData<DistrictSource>> getListData(
            @RequestBody DistrictSource source){
        return ResponseEntity.ok(ecService.getListSource(source));
    }
}
