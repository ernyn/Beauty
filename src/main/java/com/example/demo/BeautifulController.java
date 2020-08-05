package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeautifulController {

	@RequestMapping(value = "/Beautiful")
	private String hello() {
		return "/index.html";
	}
}