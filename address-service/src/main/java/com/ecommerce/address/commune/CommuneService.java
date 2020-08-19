package com.ecommerce.address.commune;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.address.component.EcService;
import com.ecommerce.address.component.ResultSetData;
import static java.util.stream.Collectors.toList;

@Service("commune-service")
public class CommuneService implements EcService<CommuneEntity, CommuneSource> {

    @Autowired
    private CommuneRepository communeRepo;

    @Override
    public ResultSetData<CommuneSource> getListSource(CommuneSource source) {
        Pageable pageable = PageRequest.of(source.getOffset(), source.getLimit());
        Page<CommuneEntity> page = communeRepo.findByCondition(source.getCode(), source.getName(), 
                source.getCodeProvince(), source.getCodeDistrict(), pageable);
        return new ResultSetData<CommuneSource>(toResource(page.getContent()), page.getTotalElements());
    }

    @Override
    public List<CommuneSource> toResource(List<CommuneEntity> entity) {
        return entity.stream().map(CommuneSource::new).collect(toList());
    }

}
