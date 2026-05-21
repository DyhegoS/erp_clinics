package com.dhosoftwares.backend.entities.professionals;

import java.util.ArrayList;
import java.util.List;

import com.dhosoftwares.backend.entities.misc.MedicalProcedure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "tb_nurse")
@Getter
public class Nurse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String coren;

    private List<MedicalProcedure> medicalProcedures = new ArrayList<>();

    public Nurse(){}

    public Nurse(Long id, String name, String coren) {
        this.id = id;
        this.name = name;
        this.coren = coren;
    }
}
