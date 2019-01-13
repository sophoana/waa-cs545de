package com.packt.webstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
}
