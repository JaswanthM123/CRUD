package com.RestAPIs.CRUD.Repository;

import com.RestAPIs.CRUD.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
