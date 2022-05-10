package com.frankmoley.kata.firearmsgraphhql.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
    Manufacturer findManufacturerByCode(String code);
}
