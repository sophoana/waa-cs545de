package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee findByNumber(int employeeId);
}
