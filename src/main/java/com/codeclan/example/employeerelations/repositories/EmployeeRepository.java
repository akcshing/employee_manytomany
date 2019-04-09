package com.codeclan.example.employeerelations.repositories;

import com.codeclan.example.employeerelations.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
