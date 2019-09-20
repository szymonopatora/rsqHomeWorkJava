package com.rsqtechnologies.rsqjava.model;

import com.rsqtechnologies.rsqjava.model.embedable.Address;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

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
}
