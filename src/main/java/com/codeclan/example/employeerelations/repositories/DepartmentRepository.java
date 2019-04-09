package com.codeclan.example.employeerelations.repositories;

import com.codeclan.example.employeerelations.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
