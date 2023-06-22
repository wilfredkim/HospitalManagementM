package com.wilfred.patientservice.controller;

import com.wilfred.patientservice.model.Patient;
import com.wilfred.patientservice.service.PatientServiceI;
import com.wilfred.patientservice.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientServiceI patientServiceI;

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient) {
        return patientServiceI.saveDoctor(patient);
    }

    @GetMapping
    public List<Patient> getList() {
        return patientServiceI.findAll();
    }
}
