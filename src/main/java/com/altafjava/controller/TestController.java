package com.altafjava.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "This is GET request for teting. The current time is " + new Date();
	}
}
