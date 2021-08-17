package com.intuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TuesdayController {

	//http://localhost:8080/today -> Today is Tuesday
	
	@GetMapping("/today")
	public String getToday() {
		return "Today is Tuesday";
	}
	
	//http://localhost:8080/hello/Sam -> Hello Sam
	@GetMapping("/hello/{name}")
	public String greet(@PathVariable("name") String name) {
		return "Hey " + name;
	}
	
	//http://localhost:8080/bye?name=Sam -> Bye Bye Sam
	//@GetMapping("/bye")
	@PostMapping("/bye")
	public String bye(@RequestParam("name") String name) {
		return "Bye Bye " + name;
	}
	
}
