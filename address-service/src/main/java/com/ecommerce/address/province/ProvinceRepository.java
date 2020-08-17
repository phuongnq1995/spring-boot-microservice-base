package com.ecommerce.address.province;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProvinceRepository extends JpaRepository<ProvinceEntity, Long> {

    @Query("SELECT p FROM ProvinceEntity p Where p.isDelete = true and (:code is null or p.code = :code) and (:name is null or p.name = :name)")
    Page<ProvinceEntity> findByCodeAndName(@Param("code") String code, @Param("name") String name, Pageable pageable);
}
