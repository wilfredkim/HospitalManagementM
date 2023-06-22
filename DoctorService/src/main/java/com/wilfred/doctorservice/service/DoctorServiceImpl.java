package com.wilfred.doctorservice.service;

import com.wilfred.doctorservice.model.Doctor;
import com.wilfred.doctorservice.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorServiceI {

    private final DoctorRepository repository;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    @Override
    public List<Doctor> findAll() {
        return repository.findAll();
    }

    @Override
    public Doctor findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
