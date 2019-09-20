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

    private Medic medic;

    @ManyToOne
    @JoinColumn (name = "patient_id")
    private Patient patient;



}
