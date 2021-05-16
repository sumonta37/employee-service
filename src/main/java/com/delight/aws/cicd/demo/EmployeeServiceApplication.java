package com.delight.aws.cicd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class EmployeeServiceApplication {

	@Autowired
	private EmployeeDao employeeDao;

	@GetMapping
	public List<Employee> fetchEmployee() {
		return employeeDao.getEmployee().stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
