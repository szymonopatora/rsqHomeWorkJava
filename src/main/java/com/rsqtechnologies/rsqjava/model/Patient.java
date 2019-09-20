package com.rsqtechnologies.rsqjava.model;

import lombok.*;

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

}
