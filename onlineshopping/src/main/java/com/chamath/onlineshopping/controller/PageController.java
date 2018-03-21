package com.chamath.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chamath.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {

	// dependency injection. no need to create new key word
	// spring will manage this things for me
	// interface
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "HOME");
		// passing the list of categories
		model.addObject("categories", categoryDAO.list());
		model.addObject("userClickHome", true);
		return model;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "ABOUT");
		model.addObject("userClickAbout", true);
		return model;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Contact Us");
		model.addObject("userClickContact", true);
		return model;

	}

}
