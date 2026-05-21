package com.dhosoftwares.backend.entities.misc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_patient")
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String address;
    private String phone;

    public Patient(){}

    public Patient(Long id, String name, String email, String cpf, String address, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
    }

    
}
