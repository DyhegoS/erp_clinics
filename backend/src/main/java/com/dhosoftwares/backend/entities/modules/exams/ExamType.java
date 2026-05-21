package com.dhosoftwares.backend.entities.modules.exams;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_exam_type")
@Getter
@Setter
public class ExamType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public ExamType(){}

    public ExamType(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
