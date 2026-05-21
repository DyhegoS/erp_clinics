package com.dhosoftwares.backend.entities.modules.scheduling;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "schedulingType")
    private Set<Scheduling> scheduling = new HashSet<>();

    public SchedulingType() {}

    public SchedulingType(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
