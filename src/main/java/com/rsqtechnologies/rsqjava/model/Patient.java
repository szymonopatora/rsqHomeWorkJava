package com.rsqtechnologies.rsqjava.model;

import com.rsqtechnologies.rsqjava.model.embedable.Address;
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
@Table(name = "patients")
public class Patient extends Person {

    @Embedded
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private Set<Visit> visits = new HashSet<>();
}
