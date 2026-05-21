package com.dhosoftwares.backend.entities.misc;

import com.dhosoftwares.backend.entities.modules.exams.Exam;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_files")
@Getter
@Setter
public class Files {
    private Long id;
    private String extension;
    @Lob
    private byte[] content;

    private Exam exam;

    public Files(){}

    public Files(Long id, String extension, Exam exam) {
        this.id = id;
        this.extension = extension;
        this.exam = exam;
    }
}
