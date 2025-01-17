package com.RestAPIs.CRUD.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
