package com.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.service.AuthorService;

/**
 * 
 * Core servlet controller class.
 * 
 * @author OlegKykena
 * @version 1.0
 * @since 26.10.2016
 *
 */
@Controller
public class AuthorController {

	/** AuthorService instance */
	@Autowired
	private AuthorService authorService;

	@RequestMapping("/authors")
	public String showAuthors(Model model) {
		model.addAttribute("authors", authorService.findAll());
		return "authors";
	}
}
