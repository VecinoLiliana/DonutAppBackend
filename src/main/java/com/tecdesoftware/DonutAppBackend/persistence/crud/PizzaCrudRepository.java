package com.tecdesoftware.DonutAppBackend.persistence.crud;

import com.tecdesoftware.donutapp.persistence.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaCrudRepository extends CrudRepository<Pizza, Long> {
}
