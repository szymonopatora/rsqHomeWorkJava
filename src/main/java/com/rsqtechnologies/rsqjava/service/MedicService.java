package com.rsqtechnologies.rsqjava.service;

import com.rsqtechnologies.rsqjava.dto.MedicDto;
import com.rsqtechnologies.rsqjava.model.Medic;

public interface MedicService extends CrudService<Medic, Long> {
    void save(MedicDto medicDto);
}
