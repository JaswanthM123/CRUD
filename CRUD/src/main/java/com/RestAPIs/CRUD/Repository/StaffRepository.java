package com.RestAPIs.CRUD.Repository;

import com.RestAPIs.CRUD.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Long> {
}
