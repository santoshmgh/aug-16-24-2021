package com.intuit.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

	@Autowired
	private Calculator calculator;
	
	@GetMapping("/add/{num1}/{num2}")
	public HttpEntity<Integer> add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		int sum = calculator.add(num1, num2); 
		return new ResponseEntity<Integer>(sum, HttpStatus.OK);
	}
	
	@GetMapping("/square/{num}")
	public HttpEntity<Integer> square(@PathVariable int num) {
		int result = calculator.square(num); 
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}
	
	@PutMapping("/subtract/{num1}/{num2}")
	public HttpEntity<Integer> subtract(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		int diff = calculator.subtract(num1, num2); 
		return new ResponseEntity<Integer>(diff, HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public HttpEntity<Integer> multiply(@RequestParam int num1, @RequestParam int num2) {
		int product = calculator.multiply(num1, num2); 
		return new ResponseEntity<Integer>(product, HttpStatus.OK);
	}

	
//	@GetMapping("/add/{num1}/{num2}")
//	public int add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
//		return calculator.add(num1, num2);
//	}
//	
//	@GetMapping("/square/{num}")
//	public int square(@PathVariable int num) {
//		return calculator.square(num);
//	}
//	
//	@PutMapping("/subtract/{num1}/{num2}")
//	public int subtract(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
//		return calculator.subtract(num1, num2);
//	}
//	
//	@PostMapping("/product")
//	public int multiply(@RequestParam int num1, @RequestParam int num2) {
//		return calculator.multiply(num1, num2);
//	}
	
	
}
