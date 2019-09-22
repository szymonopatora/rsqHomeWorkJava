package com.rsqtechnologies.rsqjava.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "medics")
public class Medic extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "medic_specialties", joinColumns = @JoinColumn(name = "medic_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Specialty> specialties = new HashSet<>();
}
