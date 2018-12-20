package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mum.edu.domain.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloWorld() {
		return "employee";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	@ResponseBody
	public Employee addEmployee(@RequestBody @Valid Employee employee) {

		return new Employee();

	}

}
