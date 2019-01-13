package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Employee save(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee findByNumber(int employeeId) {

		return employeeRepository.findOne((long) employeeId);
	}

}
