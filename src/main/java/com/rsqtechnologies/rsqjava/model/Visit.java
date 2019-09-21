package com.rsqtechnologies.rsqjava.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    private LocalDateTime visitDate;

    private String visitPlace;
    /**
     * I wanted to create new entity - Clinic witch would include BaseEntity, Embedded Address, Set<Medic> medics
     */
    private Medic medic;

    @ManyToOne
    @JoinColumn (name = "patient_id")
    private Patient patient;



}
