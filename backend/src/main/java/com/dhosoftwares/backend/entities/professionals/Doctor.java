package com.dhosoftwares.backend.entities.professionals;

import java.util.ArrayList;
import java.util.List;

import com.dhosoftwares.backend.entities.modules.exams.Exam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_doctor")
@Getter
@Setter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialty;
    private String crm;

    private List<Exam> exams = new ArrayList<>();

    public Doctor(){}

    public Doctor(Long id, String name, String specialty, String crm) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.crm = crm;
    }
}
