package com.dhosoftwares.backend.entities.modules.scheduling;

import java.time.Instant;

import com.dhosoftwares.backend.entities.enums.SchedulingType;
import com.dhosoftwares.backend.entities.misc.Patient;
import com.dhosoftwares.backend.entities.users.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_scheduling")
public class Scheduling {
    private Long id;
    private Instant createAt;
    private Instant updateAt;
    private Instant scheduleDate;
    private String description;

    private User user;

    private SchedulingType schedulingType;
    
    private Patient patient;
    
}
