package com.students.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.students.domain.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("student") Student student, Model model) {

		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("student") @Valid Student student, BindingResult result,
			HttpServletRequest request) {

		if (result.hasErrors())
			return "registration";

		return "success";
	}

}
