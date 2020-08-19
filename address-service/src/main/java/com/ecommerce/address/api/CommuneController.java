package com.ecommerce.address.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.address.commune.CommuneEntity;
import com.ecommerce.address.commune.CommuneSource;
import com.ecommerce.address.component.EcService;
import com.ecommerce.address.component.ResultSetData;

@RestController
public class CommuneController {

    @Autowired
    @Qualifier("commune-service")
    private EcService<CommuneEntity, CommuneSource> ecService;

    @PostMapping("/communes")
    public ResponseEntity<ResultSetData<CommuneSource>> getListData(
            @RequestBody CommuneSource source){
        return ResponseEntity.ok(ecService.getListSource(source));
    }
}
