package com.softserve.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.service.AuthorService;
import com.softserve.service.BookService;
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
public class BookController {
	
	/** BookService instance */
	@Autowired
	BookService bookService;
	
	/** GenreService instance */
	@Autowired
	GenreService genreService;
	
	/** AuthorService instance */
	@Autowired
	AuthorService authorService;
	
	@RequestMapping("/books")
	public String showBooks(Model model) {
		model.addAttribute("books" , bookService.findAvailableBooks());
		model.addAttribute("genres" , genreService.findAll());
		model.addAttribute("authors" , authorService.findAll());
		return "books";
	}
	
	@RequestMapping("/books/genres/{genr}")
	 public String showBookByGenre(@PathVariable("genr") String genr, Model model) {
	  model.addAttribute("books", bookService.findBooksByGenre(genr.toString()));
	  return "books";
	 }
	
	@RequestMapping(value = "/books/authors/{first}/{last}", method = RequestMethod.GET)
	 public String showBookByAuthor(@PathVariable("first") String first, 
			 @PathVariable("last") String last, Model model) {
	  model.addAttribute("books", bookService.findBooksByAuthor(first.toString(), last.toString()));
	  return "books";
	 }
	
	@RequestMapping(value = "/books/search", method = RequestMethod.GET)
	public String showSearchResults(@RequestParam("name") String name, @RequestParam("type") String type, Model model) {
	  model.addAttribute("books", bookService.search(name, type));
	  return "books";
	 }
}
