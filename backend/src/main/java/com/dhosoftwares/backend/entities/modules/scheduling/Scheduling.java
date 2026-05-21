package com.dhosoftwares.backend.entities.modules.scheduling;

import java.time.Instant;

import com.dhosoftwares.backend.entities.misc.Patient;
import com.dhosoftwares.backend.entities.users.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_scheduling")
@Getter
@Setter
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createAt;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updateAt;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant scheduleDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "scheduling_type_id")
    private SchedulingType schedulingType;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Scheduling(){
    }

    public Scheduling(Long id, Instant createAt, Instant updateAt, Instant scheduleDate, String description, User user,
            SchedulingType schedulingType, Patient patient) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.scheduleDate = scheduleDate;
        this.description = description;
        this.user = user;
        this.schedulingType = schedulingType;
        this.patient = patient;
    }
}
