package com.delight.aws.cicd.demo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class EmployeeDao {

	public List<Employee> getEmployee() {
		return Stream.of(new Employee(101, "Rana", "WW"), new Employee(58, "Sam", "EE"),
				new Employee(205, "Andrew", "YY"), new Employee(809, "Tom", "VV")).collect(Collectors.toList());
	}
}
