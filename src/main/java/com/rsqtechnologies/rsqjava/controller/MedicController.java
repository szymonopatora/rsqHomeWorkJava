package com.rsqtechnologies.rsqjava.controller;

import com.rsqtechnologies.rsqjava.repository.MedicRepository;
import org.springframework.stereotype.Controller;

@Controller
public class MedicController {

    private final MedicRepository medicRepository;

    public MedicController(MedicRepository medicRepository) {
        this.medicRepository = medicRepository;
    }
}
