package com.wilfred.doctorservice.controller;

import com.wilfred.doctorservice.model.Doctor;
import com.wilfred.doctorservice.service.DoctorServiceI;
import com.wilfred.doctorservice.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.DOCTOR_API)
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorServiceI doctorServiceI;

    @PostMapping
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return doctorServiceI.saveDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getList() {
        return doctorServiceI.findAll();
    }
}
