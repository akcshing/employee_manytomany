package com.codeclan.example.employeerelations;

import com.codeclan.example.employeerelations.models.Department;
import com.codeclan.example.employeerelations.models.Employee;
import com.codeclan.example.employeerelations.models.Project;
import com.codeclan.example.employeerelations.repositories.DepartmentRepository;
import com.codeclan.example.employeerelations.repositories.EmployeeRepository;
import com.codeclan.example.employeerelations.repositories.ProjectsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeerelationsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectsRepository projectsRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("SMACK ALLEY");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Dave", "Davington", department, 2);
		employeeRepository.save(employee1);
	}

	@Test
	public void addEmployeeAndProjects(){
		Department department = new Department("TEAM UNICORN");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Michael", "Michaelton", department, 3);
		employeeRepository.save(employee1);

		Project project = new Project("Operation Skullduggery", 20);
		projectsRepository.save(project);

		project.addEmployee(employee1);
		projectsRepository.save(project);
	}



}
