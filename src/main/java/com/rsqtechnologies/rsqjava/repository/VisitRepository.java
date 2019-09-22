package com.rsqtechnologies.rsqjava.repository;

import com.rsqtechnologies.rsqjava.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
