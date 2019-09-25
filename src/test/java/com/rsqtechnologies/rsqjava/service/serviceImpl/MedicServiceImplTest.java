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

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MedicServiceImplTest {

    private final String FIRST_NAME = "John";
    private final String LAST_NAME = "Smith";

    private Medic medic;

    @Mock
    MedicRepository medicRepository;

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    MedicServiceImpl medicService;

    @BeforeEach
    void setUp() {
        medic = Medic.builder().id(1L).firstName(FIRST_NAME).lastName(LAST_NAME).build();
    }

    @Test
    void shouldReturnSetOfMedicsWhenSetNotEmpty() {
        //given
        Set<Medic> medicSet = new HashSet<>();
        medicSet.add(Medic.builder().id(1L).build());
        medicSet.add(Medic.builder().id(2L).build());

        //when
        when(medicRepository.findAll()).thenReturn(medicSet);
        Set<Medic> medics = medicService.findAll();

        //then
        assertNotNull(medics);
        assertEquals(2,medics.size());
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