package com.mum.waa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.waa.repository.DataRepository;

@Controller
public class LoginController {

	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private HttpSession httpSession;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String index(@RequestParam("name") String name, @RequestParam("password") String password) {
		String expectedPassword = dataRepository.findPassword(name);
		if (expectedPassword == null || !expectedPassword.equals(password)) {
			httpSession.removeAttribute("username");
			return "redirect:/";
		} else {
			httpSession.setAttribute("username", name);
			httpSession.setMaxInactiveInterval(600);
			return "advice";
		}
	}
}
