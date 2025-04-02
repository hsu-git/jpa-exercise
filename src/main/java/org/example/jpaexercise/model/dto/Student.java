package org.example.jpaexercise.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public record Student(
        @Id @GeneratedValue Long id,
        String name) {

    public Student() {
        this(null, null);
    }

    // 이래야 JPA가 일함;;;
    public Student(String name) {
        this(null, name);
    }
}
