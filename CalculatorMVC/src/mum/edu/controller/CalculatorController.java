package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.domain.CalculatorOperand;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalculatorValidator;

@Controller
public class CalculatorController {

	@AutoWired
	CalculatorValidator validator;

	@RequestMapping(value = { "/", "/calculator_input" })
	public String inputProduct(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}

	@RequestMapping(value = { "/calculate" })
	public String calculate(CalculatorOperand calculatorOperand, HttpServletRequest request,
			HttpServletResponse response) {

		// Validation
		List<String> errors = validator.validate(calculatorOperand);

		if (errors.isEmpty() == false) {
			request.setAttribute("errors", errors);
			return "/WEB-INF/jsp/calculator.jsp";
		}

		Integer add1 = calculatorOperand.getAdd1();
		Integer add2 = calculatorOperand.getAdd2();
		Integer mul1 = calculatorOperand.getMult1();
		Integer mul2 = calculatorOperand.getMult2();

		Integer sum = add1 + add2;
		Integer prod = mul1 * mul2;

		request.setAttribute("add1", add1);
		request.setAttribute("add2", add2);
		request.setAttribute("mult1", mul1);
		request.setAttribute("mult2", mul2);
		request.setAttribute("sum", sum);
		request.setAttribute("product", prod);

		return "/WEB-INF/jsp/result.jsp";
	}
}
