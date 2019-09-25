package com.rsqtechnologies.rsqjava.service.serviceImpl;

import com.rsqtechnologies.rsqjava.model.Medic;
import com.rsqtechnologies.rsqjava.repository.MedicRepository;
import com.rsqtechnologies.rsqjava.repository.SpecialtyRepository;
import com.rsqtechnologies.rsqjava.service.MedicService;

import java.util.HashSet;
import java.util.Set;

public class MedicServiceImpl implements MedicService {

    private final MedicRepository medicRepository;
    private final SpecialtyRepository specialtyRepository;

    public MedicServiceImpl(MedicRepository medicRepository, SpecialtyRepository specialtyRepository) {
        this.medicRepository = medicRepository;
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Medic> findAll() {
        Set<Medic> medics = new HashSet<>();
        medicRepository.findAll().forEach(medics::add);
        return medics;
    }

    @Override
    public Medic findById(Long id) {
        return medicRepository.findById(id).orElse(null);
    }

    @Override
    public Medic save(Medic object) {
        return medicRepository.save(object);
    }

    @Override
    public void delete(Medic object) {
        medicRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        medicRepository.deleteById(id);
    }
}
