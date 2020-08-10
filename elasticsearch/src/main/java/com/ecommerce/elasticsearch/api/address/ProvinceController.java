package com.ecommerce.elasticsearch.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.elasticsearch.address.ProvinceService;
import com.ecommerce.elasticsearch.address.entity.ProvinceEntity;
import com.ecommerce.elasticsearch.address.source.ProvinceSource;
import com.ecommerce.elasticsearch.component.ResultData;
import com.ecommerce.elasticsearch.component.ResultSetData;

@RestController
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @GetMapping("/provinces")
    public ResponseEntity<ResultSetData<ProvinceEntity>> getData(
            @RequestParam(value = "name", required = false, defaultValue = "") String name,
            @RequestParam(value = "code", required = false, defaultValue = "") String code,
            @RequestParam(value = "limit", defaultValue = "20") Integer limit,
            @RequestParam(value = "offset", defaultValue = "0") Integer offset) {
        ProvinceSource source = ProvinceSource.builder().code(code).name(name).offset(offset).limit(limit).build();
        return ResponseEntity.ok(provinceService.getListSource(source));
    }

    @PostMapping("/provincess")
    public ResponseEntity<ResultSetData<ProvinceEntity>> getData(
           @RequestBody ProvinceSource source) {
        return ResponseEntity.ok(provinceService.getListSource(source));
    }

    @PostMapping("/provice")
    public ResponseEntity<ResultData<ProvinceEntity>> createData(@RequestBody ProvinceEntity addressEntity) {
        return ResponseEntity.ok(provinceService.createSource(addressEntity));
    }
}
