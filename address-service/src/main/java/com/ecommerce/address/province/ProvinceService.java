package com.ecommerce.address.province;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.address.component.EcService;
import com.ecommerce.address.component.ResultSetData;
import com.ecommerce.address.province.sql.ProvinceSQL;

@Service("province-service")
public class ProvinceService implements EcService<ProvinceEntity, ProvinceSource> {

    @Autowired
    ProvinceRepository provinceRep;
    
    @Override
    public ResultSetData<ProvinceSource> getListSource(ProvinceSource source) {
        String sql = ProvinceSQL.search(source);
        Pageable pageable = PageRequest.of(source.getOffset() - 1, source.getLimit());
        Page<ProvinceEntity> page = provinceRep.findByCodeAndName(source.getCode(),source.getName(), pageable);
        return new ResultSetData<>(toResource(page.getContent()), page.getTotalPages());
    }

	@Override
	public List<ProvinceSource> toResource(List<ProvinceEntity> entity) {
		
		return entity.stream().map(ProvinceSource::new).collect(toList());
	}

}
