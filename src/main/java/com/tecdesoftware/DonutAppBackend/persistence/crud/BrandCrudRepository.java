package com.tecdesoftware.DonutAppBackend.persistence.crud;

import com.tecdesoftware.donutapp.persistence.entity.Brand;
import org.springframework.data.repository.CrudRepository;

public interface BrandCrudRepository extends CrudRepository<Brand, Long> {
}
