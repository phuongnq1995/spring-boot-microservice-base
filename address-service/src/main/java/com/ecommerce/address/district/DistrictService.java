package com.ecommerce.address.district;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.address.component.EcService;
import com.ecommerce.address.component.ResultSetData;
import static java.util.stream.Collectors.toList;

@Service("district-service")
public class DistrictService implements EcService<DistrictEntity, DistrictSource> {

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public ResultSetData<DistrictSource> getListSource(DistrictSource source) {
        Pageable pageable = PageRequest.of(source.getOffset(), source.getLimit());
        Page<DistrictEntity> page = districtRepository.findByCondition(source.getCode(), source.getName(),
                source.getCodeProvince(), pageable);
        return new ResultSetData<>(toResource(page.getContent()), page.getTotalElements());
    }

    @Override
    public List<DistrictSource> toResource(List<DistrictEntity> entity) {
        return entity.stream().map(DistrictSource::new).collect(toList());
    }

}
