package com.docker.root;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.docker.root.models.Employee;
import com.docker.root.repositories.EmployeeRepository;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
		Employee employee = new Employee();
		employee.setName("Atif");
		employee.setAddress("Rajshahi");
		employee.setGender("Male");
		employeeRepository.save(employee);

	}

}
