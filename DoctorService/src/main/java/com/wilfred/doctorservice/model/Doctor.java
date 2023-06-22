package com.wilfred.doctorservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_doctors")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String department;
}
