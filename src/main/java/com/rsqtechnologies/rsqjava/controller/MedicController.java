package com.rsqtechnologies.rsqjava.controller;

import com.rsqtechnologies.rsqjava.service.MedicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MedicController {

    private final MedicService medicService;

    public MedicController(MedicService medicService) {
        this.medicService = medicService;
    }

    @RequestMapping("/showMedics")
    public String getAllMedics (Model model) {
        model.addAttribute("medics", medicService.findAll());
        return "medics";
    }
}
