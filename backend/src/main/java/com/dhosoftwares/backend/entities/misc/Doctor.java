package com.dhosoftwares.backend.entities.misc;

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
    private String email;
    private String crm;

    public Doctor(){}

    public Doctor(Long id, String name, String email, String crm) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.crm = crm;
    }
}
