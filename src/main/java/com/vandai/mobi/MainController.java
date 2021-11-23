package com.vandai.mobi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MainController {
	@GetMapping
	public String hello() {
		return "hello world";
	}
}
