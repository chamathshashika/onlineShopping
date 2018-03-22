package com.chamath.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chamath.shoppingbacked.dao.CategoryDAO;
import com.chamath.shoppingbackend.dto.Cateogry;

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

	// load all the product and based n category

	@RequestMapping(value = "show/all/products")
	public ModelAndView showAllProducts() {

		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "All Products");
		// passing the list of categories
		model.addObject("categories", categoryDAO.list());
		model.addObject("userClickAllProducts", true);
		return model;

	} 
	
	@RequestMapping(value = "show/category/{id}/products")
	public ModelAndView showAllProducts(@PathVariable("id") int id) {

		ModelAndView model = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		Cateogry catagery = null;
		
		catagery = categoryDAO.get(id);
		
		
		model.addObject("title", catagery.getName());
		// passing the list of categories
		model.addObject("categories", categoryDAO.list());
		
		//parsing the single category object
		model.addObject("category", catagery);
		
		
		model.addObject("userClickCategoryProducts", true);
		return model;

	} 

}
