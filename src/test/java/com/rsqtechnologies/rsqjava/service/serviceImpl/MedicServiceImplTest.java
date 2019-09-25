package com.rsqtechnologies.rsqjava.service.serviceImpl;

import com.rsqtechnologies.rsqjava.model.Medic;
import com.rsqtechnologies.rsqjava.repository.MedicRepository;
import com.rsqtechnologies.rsqjava.repository.SpecialtyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MedicServiceImplTest {

    private final String FIRST_NAME = "John";
    private final String LAST_NAME = "Smith";


    @Mock
    MedicRepository medicRepository;

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    MedicServiceImpl medicService;

    Medic medic;

    @BeforeEach
    void setUp() {
        medic = Medic.builder().id(1L).firstName(FIRST_NAME).lastName(LAST_NAME).build();
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}