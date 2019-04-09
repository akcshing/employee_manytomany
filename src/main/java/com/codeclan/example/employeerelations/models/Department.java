package com.codeclan.example.employeerelations.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="departments")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String departmentName;

    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private ArrayList<Employee> employees;


    public Department(){
    }

    public Department(String department){
        this.departmentName = department;
        this.employees = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employees) {
        this.employees.add(employees);
    }
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
