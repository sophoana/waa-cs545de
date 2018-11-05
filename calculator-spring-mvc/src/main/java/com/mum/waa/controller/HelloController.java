package com.mum.waa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.waa.model.Calculator;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World");

		return "hello";
	}

	@RequestMapping(value = { "/calculator", "/" })
	public String getCalculator(Model model) {

		return "calculator";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String calculate(Calculator calculator, Model model) {
		Integer sum = calculator.getAdd1() + calculator.getAdd2();
		Integer prod = calculator.getMult1() * calculator.getMult2();
		calculator.setSum(sum);
		calculator.setProduct(prod);
		
		model.addAttribute("calculator", calculator);
		return "calculator";
	}
}
