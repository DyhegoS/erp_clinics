package com.dhosoftwares.backend.entities.modules.appointment;

import java.util.ArrayList;
import java.util.List;

import com.dhosoftwares.backend.entities.misc.Files;
import com.dhosoftwares.backend.entities.misc.Patient;
import com.dhosoftwares.backend.entities.professionals.Doctor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_appointment")
@Getter
@Setter
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private AppointmentType appointmentType;
    private Doctor doctor;
    private Patient patient;

    private List<Files> files = new ArrayList<>();
}
