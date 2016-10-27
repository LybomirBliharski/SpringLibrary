package com.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.service.GenreService;

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
public class GenreController {

	/** GenreService instance */
	@Autowired
	GenreService genreService;
	
	@RequestMapping("/genres")
	public String showGenres(Model model) {
		model.addAttribute("genres", genreService.getListSortByAlh());
		return "genres";
	}
}
