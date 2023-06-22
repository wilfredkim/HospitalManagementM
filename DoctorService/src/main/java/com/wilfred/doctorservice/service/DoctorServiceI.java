package com.wilfred.doctorservice.service;

import com.wilfred.doctorservice.model.Doctor;

import javax.print.Doc;
import java.util.List;

public interface DoctorServiceI {

    Doctor saveDoctor(Doctor doctor);

    List<Doctor> findAll();

    Doctor findById(Long id);
}
