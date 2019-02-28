package com.univer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		String user = request.getParameter("user");
		HttpSession session = request.getSession();
		session.setAttribute("session_user", user);
		view.addObject("server_id", "you are requesting server_1");
		view.setViewName("result");
		return view;
	}

	@RequestMapping(value = "/check")
	public ModelAndView check(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		view.addObject("server_id", "you are requesting server_1");
		view.setViewName("result");
		return view;
	}
}