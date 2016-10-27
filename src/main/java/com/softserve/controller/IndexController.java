package com.softserve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class IndexController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

}
