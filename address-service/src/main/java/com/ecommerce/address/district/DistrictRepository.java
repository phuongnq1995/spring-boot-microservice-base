package com.ecommerce.address.district;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DistrictRepository extends JpaRepository<DistrictEntity, Long> {

    @Query("SELECT p FROM DistrictEntity p Where p.isDelete = true and (:code is null or p.code = :code) "
            + "and (:name is null or p.name = :name) and (:codeProvince is null or p.codeProvince = :codeProvince)")
    Page<DistrictEntity> findByCondition(@Param("code") String code, 
            @Param("name") String name, @Param("codeProvince") String codeProvince, Pageable pageable);
}
