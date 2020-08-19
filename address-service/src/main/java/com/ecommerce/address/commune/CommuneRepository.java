package com.ecommerce.address.commune;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommuneRepository extends JpaRepository<CommuneEntity, Long>{

    @Query("SELECT p FROM CommuneEntity p Where p.isDelete = true and (:code is null or p.code = :code) "
            + "and (:name is null or p.name like %:name%) and (:codeProvince is null or p.codeProvince = :codeProvince)"
            + " and (:codeDistrict is null or p.codeDistrict = :codeDistrict)")
    Page<CommuneEntity> findByCondition(@Param("code") String code, 
            @Param("name") String name, @Param("codeProvince") String codeProvince, @Param("codeDistrict") String codeDistrict, Pageable pageable);
}
