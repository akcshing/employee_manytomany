package com.codeclan.example.employeerelations.repositories;

import com.codeclan.example.employeerelations.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Project,Long> {
}
