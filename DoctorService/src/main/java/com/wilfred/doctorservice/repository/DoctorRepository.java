package com.wilfred.doctorservice.repository;

import com.wilfred.doctorservice.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
