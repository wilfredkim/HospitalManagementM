package com.wilfred.patientservice.service;

import com.wilfred.patientservice.model.Patient;

import java.util.List;

public interface PatientServiceI {
    Patient saveDoctor(Patient patient);

    List<Patient> findAll();

    Patient findById(Long id);
}
