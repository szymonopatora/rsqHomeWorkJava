package com.rsqtechnologies.rsqjava.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MedicDto {

    @NotBlank(message = "You need to pass in the first name")
    private String firstName;

    @NotBlank(message = "You need to pass in the last name")
    private String lastName;
}
