package com.codeclan.example.employeerelations.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "projects")
public class Project {
    @Column
    private String projectName;
    @Column
    private int numberOfDays;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable =false
            )}
    )
    private ArrayList<Employee> employees;

    public Project(){};

    public Project(String projectName, int numberOfDays){
        this.projectName = projectName;
        this.employees = new ArrayList<>();
        this.numberOfDays = numberOfDays;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
