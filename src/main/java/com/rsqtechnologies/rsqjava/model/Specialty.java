package com.rsqtechnologies.rsqjava.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String description;
}
