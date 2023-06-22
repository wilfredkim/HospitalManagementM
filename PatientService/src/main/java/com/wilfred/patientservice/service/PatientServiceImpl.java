package com.wilfred.patientservice.service;

import com.wilfred.doctorservice.model.Doctor;
import com.wilfred.doctorservice.service.DoctorServiceI;
import com.wilfred.patientservice.model.Patient;
import com.wilfred.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientServiceI {
    private final PatientRepository repository;

   private final DoctorServiceI doctorServiceI;

    @Override
    public Patient saveDoctor(Patient patient) {
        Doctor doctor = new Doctor();
        doctor.setName("John ******");
        doctor.setDepartment("TESSTTTT");
        doctor = doctorServiceI.saveDoctor(doctor);
        patient.setDoctorAssign(doctor.getName());
        return repository.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return repository.findAll();
    }

    @Override
    public Patient findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
