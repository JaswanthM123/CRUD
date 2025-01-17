package com.RestAPIs.CRUD.Entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String name;

        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Student> students;

        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Staff> staff;
}
