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
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MedicServiceImplTest {

    private final String FIRST_NAME = "John";
    private final String LAST_NAME = "Smith";

    Medic medic;

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
        assertEquals(2, medics.size());
    }

    @Test
    void shouldReturnZeroWhenSetOfMedicsIsEmpty() {
        //given
        Set<Medic> medicSet = new HashSet<>();

        //when
        when(medicRepository.findAll()).thenReturn(medicSet);
        Set<Medic> medics = medicService.findAll();

        //then
        assertEquals(0, medics.size());
    }


    @Test
    void shouldFindMedicById() {
        //given

        //when
        when(medicRepository.findById(anyLong())).thenReturn(Optional.of(medic));
        Medic medicToBeFound = medicService.findById(1L);

        //then
        assertNotNull(medicToBeFound);
    }

    @Test
    void shouldReturnNullWhenMedicByIdNotFound() {
        //given

        //when
        when(medicRepository.findById(anyLong())).thenReturn(Optional.empty());
        Medic medicToBeFound = medicService.findById(1L);

        //then
        assertNull(medicToBeFound);
    }

    @Test
    void shouldSaveMedic() {
        //given
        Medic medicToBeSaved = Medic.builder().id(1L).build();
        when(medicRepository.save(any())).thenReturn(medic);
        //when

        Medic medicSaved = medicService.save(medicToBeSaved);

        //then
        assertNotNull(medicSaved);
        verify(medicRepository).save(any());
    }

    @Test
    void shouldDeleteMedic() {
        //given

        //when
        medicService.delete(medic);

        //then
        verify(medicRepository, times(1)).delete(any());
    }

    @Test
    void shouldDeleteMedicById() {
        //given

        //when
        medicService.deleteById(1L);

        //then
        verify(medicRepository, times(1)).deleteById(any());
    }

}