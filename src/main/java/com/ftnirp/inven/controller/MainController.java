package com.ftnirp.inven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	
	@RequestMapping("head")
	public String showHeader() {
		return "head";
	}
	

}
