package org.example.jpaexercise.controller;

import jakarta.persistence.EntityManager;
import org.example.jpaexercise.config.JPAConfig;
import org.example.jpaexercise.model.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class IndexController {
    final JPAConfig jpaConfig; // 이게 의존성 주입이 되네;;;

    public IndexController(JPAConfig jpaConfig) {
        this.jpaConfig = jpaConfig;
    }

    @GetMapping
    public String index() {
        try (EntityManager entityManager = jpaConfig.getEntityManagerFactory().createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(new Student(UUID.randomUUID().toString()));
            entityManager.getTransaction().commit();
            // 닫아주는 건 따로 할 필요 없음 -> try-with-resource 구문은 아예 끝에 닫아줌
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}
