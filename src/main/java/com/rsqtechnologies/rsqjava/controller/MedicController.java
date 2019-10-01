package com.rsqtechnologies.rsqjava.controller;

import com.rsqtechnologies.rsqjava.dto.MedicDto;
import com.rsqtechnologies.rsqjava.service.MedicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MedicController {

    private final MedicService medicService;

    public MedicController(MedicService medicService) {
        this.medicService = medicService;
    }

    @RequestMapping("/showMedics")
    public String getAllMedics(Model model) {
        model.addAttribute("medics", medicService.findAll());
        return "medics";
    }

    @PostMapping("/addMedicForm")
    public String addMedic(@ModelAttribute("medic") @Valid MedicDto medicDto, BindingResult bindingResult,
                           Model model) {
        if (bindingResult.hasErrors()) {
            return "addMedicForm";
        }
        medicService.save(medicDto);
        return "redirect:/";
    }

    @GetMapping("/addMedicForm")
    public String addMedic(Model model) {
        model.addAttribute("medic", new MedicDto());
        return "redirect:/";
    }
}
