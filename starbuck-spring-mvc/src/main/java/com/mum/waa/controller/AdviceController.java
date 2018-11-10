package com.mum.waa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.waa.repository.DataRepository;

@Controller
public class AdviceController {

	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private HttpSession httpSession;

	@RequestMapping(value = "/advice", method = RequestMethod.GET)
	public String index(@RequestParam("roast") String roast, Model model) {
		if (httpSession.getAttribute("username") == null) {
			return "index";
		}
		if (roast.isEmpty()) {
			return "advice";
		}
		
		List<String> advices = dataRepository.getAdvices(roast);
		model.addAttribute("roast", roast.toUpperCase());
		model.addAttribute("advices", advices);
		return "display";
	}

}
