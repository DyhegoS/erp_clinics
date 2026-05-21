package com.dhosoftwares.backend.entities.modules.scheduling;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_scheduling_type")
@Getter
@Setter
public class SchedulingType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public SchedulingType() {}

    public SchedulingType(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
