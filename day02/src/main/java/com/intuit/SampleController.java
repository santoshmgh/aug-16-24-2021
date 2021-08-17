package com.intuit;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class SampleController {

	@PostMapping("/register")
	public String process(@RequestParam String name, HttpSession session) {
		String message = "Hey " + name;
		session.setAttribute("message", message);
		return "result";
	}
	
	@GetMapping("/sample")
	public String getSampleData() {
		return "hello";
	}
}
