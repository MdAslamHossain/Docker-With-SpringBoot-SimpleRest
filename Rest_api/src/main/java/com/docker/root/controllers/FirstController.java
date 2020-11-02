package com.docker.root.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.root.models.Employee;
import com.docker.root.repositories.EmployeeRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employee")
public class FirstController {
	private static final Logger LOGGER = LoggerFactory.getLogger(FirstController.class);
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/message")
	public ResponseEntity<List<Employee>> getEmployees() {

		LOGGER.info("ENTER -- Service class : FirstController --- method : getEmployees()");
		return ResponseEntity.ok().body(employeeRepository.findAll());
	}
}