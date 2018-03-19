package com.chamath.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("hi", "Well come to spring mvc as");
		return model;

	}

}
