package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mum.edu.domain.Employee;

@Controller
@RequestMapping(value = "rest/hello")
public class HelloRestController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody Employee hello(@PathVariable(value = "name") String name) {
		String message = "Hello " + name;

		System.out.println(message);
		Employee employee = new Employee();
		employee.setFirstName(name);
		return employee;
	}
}
