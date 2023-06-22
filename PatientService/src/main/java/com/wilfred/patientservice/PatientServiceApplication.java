package com.wilfred.patientservice;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wilfred.doctorservice.*","com.wilfred.patientservice.*"})
@EntityScan(basePackages = {"com.wilfred.doctorservice.*","com.wilfred.patientservice.*"})
@EnableJpaRepositories(basePackages = {"com.wilfred.doctorservice.*","com.wilfred.patientservice.*"})
public class PatientServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatientServiceApplication.class, args);
    }
}
