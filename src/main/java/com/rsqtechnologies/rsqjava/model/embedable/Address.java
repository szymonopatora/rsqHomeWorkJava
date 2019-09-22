package com.rsqtechnologies.rsqjava.model.embedable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

    private String street;

    private String number;

    private String zipCode;

    private String city;

    private String country;
}
