package com.rsqtechnologies.rsqjava.repository;

import com.rsqtechnologies.rsqjava.model.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
