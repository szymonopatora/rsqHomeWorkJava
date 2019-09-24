package com.rsqtechnologies.rsqjava.repository;

import com.rsqtechnologies.rsqjava.model.Medic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicRepository extends CrudRepository<Medic, Long> {
}
